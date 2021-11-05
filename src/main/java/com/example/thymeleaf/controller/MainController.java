package com.example.thymeleaf.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thymeleaf.vo.Board;

@Controller
public class MainController {
	
    @RequestMapping("/")
    String indexPage(Model model) {
    	
    	List<Board> list = new ArrayList<Board>();
    	List<Board> list2 = new ArrayList<Board>();
    	
    	List<Map> mapList = new ArrayList<Map>();
       	
        Board board1 = new Board(1, "제목1", "작성자1","내용1");
        Board board2 = new Board(2, "제목2", "작성자2","내용2");
        Board board3 = new Board(3, "제목3", "작성자3","내용3");
        Board board4 = new Board(4, "제목4", "작성자4","내용4");
              
        list.add(board1);
        list.add(board2);
        list.add(board3);
        list.add(board4);
                
        model.addAttribute("list",list);
        
        return "index";
    }
    
    @RequestMapping("/test")
    String testPage(Model model) {
    	
    	Map<String,String> map = new HashMap<String,String>();
    	
    	map.put("fruit1", "사과");
    	map.put("fruit2", "바나나");
    	map.put("fruit3", "멜론");
    	
    	model.addAttribute("mapList", map);
    	return "test";
    }
}
