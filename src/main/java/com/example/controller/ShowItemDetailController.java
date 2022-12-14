package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;
import com.example.service.ShowItemDetailService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/showItemDetail")
public class ShowItemDetailController {

	@Autowired
	private ShowItemDetailService showItemDetailService;
	@Autowired
	private HttpSession session;

	/**
	 * トッピング情報を受け取り商品詳細画面へ遷移.
	 * 
	 * @param id    商品ID
	 * @param model モデル
	 * @return 商品詳細画面
	 */
	@GetMapping("/showItemDetail")
	public String showItemDetail(Integer id, Model model) {
		Item item = showItemDetailService.detailByItem(id);
		model.addAttribute("item", item);
		return "item_detail";

	}

}


//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.domain.Item;
//import com.example.service.ShowItemDetailService;
//
//import jakarta.servlet.http.HttpSession;
//
///**
// * 商品詳細情報を操作するコントローラー.
// * 
// * @author yamaokahayato
// *
// */
//@Controller
//@RequestMapping("/showItemDetail")
//public class ShowItemDetailController {
//
//	@Autowired
//	private ShowItemDetailService showItemDetailService;
//	@Autowired
//	private HttpSession session;
//
//	/**
//	 * トッピング情報を受け取り商品詳細画面へ遷移.
//	 * 
//	 * @param id    商品ID
//	 * @param model モデル
//	 * @return 商品詳細画面
//	 */
//	@GetMapping("/showItemDetail")
//	public String showItemDetail(Integer id, Model model) {
//		Item item = showItemDetailService.detailByItem(id);
//		model.addAttribute("item", item);
//		System.out.println(session.getId());
//		return "item_detail";
//
//	}
//
//}
