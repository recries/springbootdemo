package dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import dto.BoardDTO;
import dto.PageDTO;

@Mapper
@Repository
public interface BoardDAO {
	public int count();
	public List<BoardDTO> list(PageDTO pv);
	public BoardDTO content(int num);
	public void reStepCount(BoardDTO dto);
	public void save(BoardDTO dto);
	public void update(BoardDTO dto);
	public void delete(int num);
	public String getFile(int num);
}
