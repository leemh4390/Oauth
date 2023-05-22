package kr.co.oauth.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersVO {
	
	private int id;
	private String username;
	private String email; 
	private String nickname; 
	private String sns_id; 
	private String sns_type; 
	private String sns_profile; 
	private String create_date; 
	private String modify_date; 
}
