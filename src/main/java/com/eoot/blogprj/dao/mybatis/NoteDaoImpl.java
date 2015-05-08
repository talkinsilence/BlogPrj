package com.eoot.blogprj.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eoot.blogprj.dao.NoteDao;
import com.eoot.blogprj.model.Note;

@Repository
public class NoteDaoImpl implements NoteDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Note> getNotes() {
		NoteDao noteDao = sqlSession.getMapper(NoteDao.class);
		return noteDao.getNotes();
	}

}
