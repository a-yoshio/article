package jp.co.moover.article_exercise.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.moover.article_exercise.domain.Article;
import jp.co.moover.article_exercise.service.ArticleService;

@Controller
@RequestMapping("/ArticleController")
public class ArticleController {
	@Autowired
	private ArticleService service;
	/**
	 * トップにもどる.
	 * @return トップ画面
	 */
	@RequestMapping("/")
	public String index(Model model) {
		
	 	List<Article> articleList = service.findAll();
	 	model.addAttribute("articleList",articleList);
		return "ArticleTop";
	}

}
