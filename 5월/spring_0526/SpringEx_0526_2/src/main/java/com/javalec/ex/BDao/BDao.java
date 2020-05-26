package com.javalec.ex.BDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.Unit.Constant;

public class BDao {

	
	
	public JdbcTemplate template;
	
	
	String sql;
	
	

	public BDao() {

		template = Constant.template;

	}

	
	public ArrayList<BDto> list() {

		sql = "select * from mvc_board order by bGroup desc, bstep asc";

		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}
	
	
	
	public void write(final String bname, final String btitle, final String bcontent) {
		
		sql = "insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (mvc_board_sequence.nextval,?,?,?,0,mvc_board_sequence.currval,0,0)";
		
	
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, bname);
				ps.setString(2, btitle);
				ps.setString(3, bcontent);
				
			}
		});
		
		
	}
	
	
	
	public BDto content_view(String bid) {
		
		sql = "select * from mvc_board where bId="+bid;
		
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
		
	}
	
	
	
	
	
	//개수 구하기
	
//	public int count() {
//		
//		sql = "select count(*) from mvc_board";
//		
//		return template.queryForObject(sql, Integer.class);
//		
//	}
	
	
	
	

}
