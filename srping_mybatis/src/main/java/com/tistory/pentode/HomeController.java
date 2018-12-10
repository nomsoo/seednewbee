package com.tistory.pentode;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tistory.pentode.service.BoardService;
import com.tistory.pentode.vo.BoardVO;


@Controller
public class HomeController {
	
	@Resource(name = "boardService")
	private BoardService boardService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/boardList.do")
	public String boardList(Model model) throws Exception {

	    List<BoardVO> list = boardService.selectBoardList();

	    logger.info(list.toString());

	    model.addAttribute("list", list);

	    return "boardList";
	}
	
	
	@RequestMapping(value = "/boardRegisterForm.do")
	public String boardRegisterForm(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception {

	    return "boardRegisterForm";
	}
	
	
	@RequestMapping(value = "/boardInsert.do")
	public String boardInsert(@ModelAttribute("boardVO") BoardVO boardVO, Model model) {
		
		boardService.insertBoard(boardVO);
		
		return "redirect:/boardList.do";
	}
}
