package kr.co.oauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.oauth.dao.OauthDAO;
import kr.co.oauth.vo.SnsInfoVO;
import kr.co.oauth.vo.UsersVO;

@Service
public class OauthService {
	
	@Autowired
	private OauthDAO dao;
	
	public int selectCountEmail(String email) {
		return dao.selectCountEmail(email);
	}; 
	
	public int insertNaverUser(UsersVO vo) {
		return dao.insertNaverUser(vo);
	};
	
	public void insertSnsInfo(SnsInfoVO sv) {
		dao.insertSnsInfo(sv);
	};

}
