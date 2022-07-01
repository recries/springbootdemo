package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.BoardDAO;
import dto.BoardDTO;
import dto.PageDTO;

//Transactional을 위해 Service를 입력
@Service
@Transactional(propagation = Propagation.REQUIRED)//기본 트랜잭션

public class BoardServiceImp implements BoardService{

	@Autowired
	private BoardDAO dao;
	public BoardServiceImp() {
	}
	
	@Override
	public int countProcess() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDTO> listProcess(PageDTO pv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProcess(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO contentProcess(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reStepProcess(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO updateSelectProcess(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProcess(BoardDTO dto, String urlpath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProcess(int num, String urlpath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fileSelectprocess(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
