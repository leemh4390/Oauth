package kr.co.oauth.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.oauth.service.OauthService;
import kr.co.oauth.vo.SnsInfoVO;
import kr.co.oauth.vo.UsersVO;

@Controller
public class MainController {
	
	@Autowired
	private OauthService service;
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	 
	@ResponseBody
	@GetMapping("oauth/countEmail")
	public Map<String, Integer> countEmail(@RequestParam("email") String email) {
		
		int result = service.selectCountEmail(email);
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("result", result);
	
		return map;
	}
	
	@GetMapping("register")
	public String registger(String type, Model model) {
		
		System.out.println("type : " + type);
		
		model.addAttribute("type", type);
		
		return "register";
	}
	
	@PostMapping("register")
	public String registger(UsersVO vo, SnsInfoVO sv) {
		
		int result = service.insertNaverUser(vo);
		
		sv.setId(result);
		
		service.insertSnsInfo(sv);
		
		return "redirect:login";
	}
	
	@GetMapping("complete")
	public String complete() {
		return "complete";
	}
	
	@GetMapping("board")
	public String list() {
		return "board";
	}

}
