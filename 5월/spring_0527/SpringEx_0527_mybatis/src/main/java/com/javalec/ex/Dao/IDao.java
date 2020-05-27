package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.Dto.BDto;

public interface IDao {

	public ArrayList<BDto> list();

	public void write(String bName, String bTitle, String bContent);

	public BDto content_view(String bId);

	public void upHit(String bId);

	public BDto modify(String bId);

	public void modifyOk(String bId, String bName, String bTitle, String bContent);

	public void delete(String bId);

	public BDto reply(String bId);

	public void reply_ok(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep,
			String bIndent);

	public void replyshape(String bGroup, String bStep);

}
