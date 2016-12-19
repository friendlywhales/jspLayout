package org.zerock;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysql.fabric.xmlrpc.base.Array;
import com.whales.domain.MemberVO;
import com.whales.mapper.MemberMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	//@Autowired
	//private DataSource ds;
	
	@Autowired
	private SqlSessionFactory sqlSession;
	
	@Test
	public void contextLoads() {
	}
	
	/*@Test
	public void testConnection() throws Exception{
		System.out.println(ds);
		
		Connection con = ds.getConnection();
		
		System.out.println(con);
		
		con.close();
	}
	
	@Test
	public void testSqlSession() throws Exception{
		System.out.println(sqlSession);
	}
	*/
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testSelect() throws Exception{
		MemberVO vo = new MemberVO();
		
		vo = mapper.read2();
		
		System.out.println("vo:::>>>"+vo.toString());
	}
	
	
	

}
