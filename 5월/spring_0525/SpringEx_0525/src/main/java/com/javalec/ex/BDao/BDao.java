package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.Util.Constant;

public class BDao {

	// jdbc template
	JdbcTemplate template;

	// 생성자
	public BDao() {

		template = Constant.template;
		// dataSource가 담겨 있는 jdbcTemplate

//		try {
//
//			context = new InitialContext();
//			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");
//
//		} catch (NamingException e) {
//			e.printStackTrace();
//
//		}

	}// 생성자

	// 객체 선언

//	DataSource ds = null;
//	Context context = null;
//
//	Connection con = null;
//	PreparedStatement ps = null;
//	ResultSet rs = null;

//	ArrayList<BDto> dtos = new ArrayList<BDto>();
//	BDto dto = new BDto();

	// db 컬럼

//	int bId;
//	String bName, bTitle, bContent;
//	int bHit, bGroup, bIndent, bStep;
//	Timestamp bDate;

	String sql = null;
	BDto dto = null;

	// list
	public ArrayList<BDto> list() {

		sql = "select * from mvc_board order by bGroup desc ";

		// object가 리턴됨
		return (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));

//		try {
//
//			con = ds.getConnection();
//			ps = con.prepareStatement(sql);
//			rs = ps.executeQuery();
//
//			while (rs.next()) {
//
//				bId = rs.getInt("bId");
//
//				bName = rs.getString("bName");
//				bTitle = rs.getString("bTitle");
//				bContent = rs.getString("bContent");
//
//				bHit = rs.getInt("bhit");
//				bGroup = rs.getInt("bgroup");
//				bIndent = rs.getInt("bindent");
//				bStep = rs.getInt("bstep");
//
//				bDate = rs.getTimestamp("bdate");
//
//				dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
//
//				dtos.add(dto);
//
//			}
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//
//		} finally {
//
//			try {
//
//				if (rs != null)
//					rs.close();
//				if (con != null)
//					con.close();
//				if (ps != null)
//					ps.close();
//
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//
//		} // finally
//
//		return dtos;

	}// list

	public BDto content_view(String bId) {

		// 조회수 1증가
		// upHit(bId);

		upHit(bId);

		sql = "select * from mvc_board where bId=" + bId;

		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
		// return 값이 BDto

	}

	public void upHit(final String bId) {

		sql = "update mvc_board set bHit=bHit+1 where bId=?";

		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setInt(1, Integer.parseInt(bId));

			}

		}

		);

	} //upHit
	
	
	
	

}
