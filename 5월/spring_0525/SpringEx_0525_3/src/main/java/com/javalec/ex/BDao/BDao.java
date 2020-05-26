package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.Util.Constant;

public class BDao {

	JdbcTemplate template;

	String sql;
	
	BDto dto = new BDto();

	public BDao() {

		template = Constant.template; // dataSource가 담겨 있는 jdbcTemplate

	}

	public ArrayList<BDto> list() {

		sql = "select * from mvc_board order by bGroup desc ";

		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}

	public BDto content_view(String bId) {
		
		upHit(bId);

		sql = "select * from mvc_board where bId=" + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}
	
	
	public void upHit(final String bId) { //final을 붙여줘야 함 
		
		
//		sql = "update mvc_board set bHit=bHit+1 where bId="+bId;
//		template.Update(sql);
		
		
		sql = "update mvc_board set bHit=bHit+1 where bId=?";
		
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setInt(1, Integer.parseInt(bId));
				
				
			}
		});
		
		
	} //upHit
	
	
	public void write(final String bName, final String bTitle, final String bContent) {
		
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			sql = "insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (mvc_board_sequence.nextval,?,?,?,0,mvc_board_sequence.currval,0,0)";
				
			PreparedStatement ps =	con.prepareStatement(sql);
			
			ps.setString(1, bName);
			ps.setString(2, bTitle);
			ps.setString(3, bContent);
			
			return ps;
			
			}
		});
		
		
	}
	
	
	
	public void delete(final String bId) {
		
		sql =" delete from mvc_board where bId=?";
	
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, bId);
				
			}
		});
		
		
	}
	
	
	
	public BDto reply(String bId) {
		
		sql= "select * from mvc_board where bId="+bId;
		
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
		
		//queryForObject는 BDto가 리턴값
		
		
	}
	
	
	
	public void reply_ok(String bId, final String bName, final String bTitle, final String bContent, final String bGroup, final String bStep, final String bIndent) {
		
		
		//replyShape(bGroup, bStep);
		
		sql = "insert into mvc_board(bId, bName, bTitle, bContent, bGroup, bStep, bIndent) values (mvc_board_sequence.nextval,?,?,?,?,?,?)  ";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

			ps.setString(1, bName);
			ps.setString(2, bTitle);
			ps.setString(3, bContent);
			ps.setInt(4, Integer.parseInt(bGroup));
			ps.setInt(5, Integer.parseInt(bStep));
			ps.setInt(6, Integer.parseInt(bIndent)+1);
			
			
				
			}
		});
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
