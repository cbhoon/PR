package com.ground;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ground.dto.MemberDTO;
import com.ground.mapper.MemberMapper;

@SpringBootTest
public class MapperTests {

	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testInsert() {
		
		 MemberDTO m1 = new MemberDTO();
	      
	      m1.setUser_id(53);
	      m1.setLog_id("mrsik");
	      m1.setLog_pw("900112");
	      m1.setUser_name("백길씩");
	      m1.setUser_birth("900112");
	      m1.setUser_gender("남자");
	      m1.setImg_path("");
	      m1.setNickname("길씩");
	      m1.setText("테스트");
	      m1.setAc_num(0);
	      m1.setCreateDate(new Date());
	      m1.setUpdateDate(new Date());
	      
	      System.out.println(m1);
	      memberMapper.insertMember(m1);
	      
	      System.out.println( "----------------------------------");
	      System.out.println( "레코드가 추가되었습니다.");
	      System.out.println( "----------------------------------");
		
		
		
		
		
	}
}
