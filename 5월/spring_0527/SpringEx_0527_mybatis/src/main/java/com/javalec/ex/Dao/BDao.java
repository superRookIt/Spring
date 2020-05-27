package com.javalec.ex.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.Dto.BDto;
import com.javalec.ex.Util.Constant;

public class BDao {
	

	
	public JdbcTemplate template;
	
	String sql;

	
	
	public BDao() {
		
		template = Constant.template;

	}

	
	
	
	public ArrayList<BDto> list(){
		
		sql = "select * from mvc_board order by bGroup desc, bstep asc";
		
		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
		
	}
	
	
	
	
	// select -> template.queryForObject(1개의 객체) OR template.query(여러개) 
	// (new BeanPropertyRowMapper<BDto>(BDto.class))
	
	
	// insert, update, delete -> template.update
	// (new PreparedStatementCreator() OR new PreparedStatementSetter() )
	
	
	
	
	public void write(final String bName, final String bTitle, final String bContent) {

		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				sql = "insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (mvc_board_sequence.nextval,?,?,?,0,mvc_board_sequence.currval,0,0)";

				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				
				return ps;
			}
			
		});
		
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
	
	
	
	
	
	
	public BDto modify(String bId) {

		sql = "select * from mvc_board where bId=" + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

	}
	
	
	
	
	
	
	public void modifyOk(final String bId, final String bName, final String bTitle, final String bContent) {
		
		sql= "update mvc_board set bName=?, bTitle=?, bContent=? where bId=?";
		
		
		template.update(sql, new PreparedStatementSetter() {
			
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bId));
				
				
				
				
			}
		});
		
	}
	
	
	
	
	
	public void delete(final String bId) {

		sql = " delete from mvc_board where bId=?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1, bId);

			}
		});

	}
	
	
	
	
	
	public BDto reply(String bId) {

		sql = "select * from mvc_board where bId=" + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

		// queryForObject는 BDto가 리턴값

	}
	
	
	
	
	
	
	//답변 글 입력시 bStep 1씩 증가 ★★★
	public void replyshape(final String bGroup, final String bStep) {
		
		sql="update mvc_board set bStep=bStep+1 where bGroup=? and bStep > ?";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setInt(1, Integer.parseInt(bGroup));
				ps.setInt(2, Integer.parseInt(bStep));
				
			}
		});
		
	}
	
	
	
	

	public void reply_ok(String bId, final String bName, final String bTitle, final String bContent,
			final String bGroup, final String bStep, final String bIndent) {

		replyshape(bGroup, bStep);
		
		sql = "insert into mvc_board(bId, bName, bTitle, bContent, bGroup, bStep, bIndent) values (mvc_board_sequence.nextval,?,?,?,?,?,?)  ";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1, bName);
				ps.setString(2, bTitle);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bGroup));
				ps.setInt(5, Integer.parseInt(bStep));
				ps.setInt(6, Integer.parseInt(bIndent) + 1);

			}
		});

	}
	
	
	
	
	

}
