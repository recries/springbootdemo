package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dto.BoardDTO;
import dto.PageDTO;
import service.BoardService;

@Component
public class MainController {
	@Autowired
	private PageDTO pdto;
	@Autowired
	private BoardService service;
	private int currentPage;

	public MainController() {
	}
	
	@RequestMapping("/board/list.do")
	public ModelAndView listMethod(HttpServletRequest request, PageDTO pv, ModelAndView mav) {
		String viewName = (String) request.getAttribute("viewName");
		int totalRecord = service.countProcess();
		
		//현재 페이지
		if(totalRecord >=1) { //게시글이 하나 이상 있어야함
			if(pv.getCurrentPage()==0) {
				currentPage = 1;//게시판에서 아무것도 안하면 currentPage는 0이다. 이에 1로 수정)
				//<a href="list.do">게시판</a>
			}else {
				currentPage = pv.getCurrentPage();
				//게시판 페이지 네비게이션을 누르면 currentPage가 정해진다.
			}
		pdto = new PageDTO(currentPage, totalRecord);
		//위 설정으로 startrow와 endrow가 계산된다.
		List<BoardDTO> aList = service.listProcess(pdto);
		mav.addObject("aList",aList);
		mav.addObject("pv",pdto);
		}
		mav.setViewName(viewName);
		
		return mav;
	}
}

