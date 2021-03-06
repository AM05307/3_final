package gosuic.controller.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gosuic.biz.property.PropertyBiz;

@Controller
public class PropertyController {

	@Autowired
	private PropertyBiz propertyBiz;
	
	// 전체 출력하기
		@RequestMapping("/list.sp")
		public String all_list(Model model) {
			model.addAttribute("all_list", propertyBiz.listApt());
			System.out.println("매물목록 출력");
			return "/WEB-INF/view/list.jsp";
		}


}
