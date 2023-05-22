package kr.co.oauth.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.oauth.vo.SnsInfoVO;
import kr.co.oauth.vo.UsersVO;

@Mapper
@Repository
public interface OauthDAO {
	
	public int selectCountEmail(@RequestParam("email") String email);
	
	public int insertNaverUser(UsersVO vo);
	
	public void insertSnsInfo(SnsInfoVO sv);

}
