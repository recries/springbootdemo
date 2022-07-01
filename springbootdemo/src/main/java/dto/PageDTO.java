package dto;

import org.springframework.stereotype.Component;

@Component
//페이지 요소 DTO
public class PageDTO {
	private int currentPage; //현페이지
	private int totalCount; //총 레코드 수
	private int blockCount =5; //한 페이지에 보여줄 레코드의 수
	private int blockPage = 3; //한 블록에 보여줄 페이지의 수
	private int totalPage; //총 페이지 수
	private int startRow; //레코드 시작 번호
	private int endRow; //레코드 끝 번호
	private int startPage; //시작 페이지
	private int endPage; //끝 페이지
	private int number; 
	public PageDTO() {
	}
	
	//레코드 설정
	public PageDTO(int currentPage, int totalCount) {
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		//레코드 시작
		startRow = (currentPage -1)* blockCount +1;
		//레코드 끝
		endRow = startRow + blockCount -1;
		//총페이지 수
		totalPage = totalCount / blockCount +(totalCount % blockCount == 0 ? 0: 1 );
		//시작 페이지 시작페이지가 0이면 안되기 때문에 +1을 한다.
		startPage = (int)((currentPage -1) / blockPage) * blockPage +1;
		//끝 페이지
		endPage = startPage + blockPage -1;
		if(totalPage < endPage) {
			endPage = totalPage;
		}
		
		
	}
	
	
	//Getter Setter List
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getBlockCount() {
		return blockCount;
	}
	public void setBlockCount(int blockCount) {
		this.blockCount = blockCount;
	}
	public int getBlockPage() {
		return blockPage;
	}
	public void setBlockPage(int blockPage) {
		this.blockPage = blockPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getStartPage() {
		return startPage;
	}
	
	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
