package jp.co.moover.article_exercise.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.moover.article_exercise.domain.Article;
import jp.co.moover.article_exercise.domain.Comment;
import jp.co.moover.article_exercise.service.ArticleService;
import jp.co.moover.article_exercise.service.CommentService;

/**
	投稿内容やコメントデータを取得格納する指示や、トップ画面の表示を行う.
 * @author chai
 *
 */
@Controller
@RequestMapping("/ArticleController")
public class ArticleController {
	@Autowired
	private ArticleService service;
	
	@Autowired
	private CommentService commentService;
	
	@ModelAttribute
	public ArticleForm setUp(){
		
		return new ArticleForm();
	}
	
	/**
	 * トップにもどる.
	 * @return トップ画面
	 */
	@RequestMapping("/")
	public String index(Model model) {
		
	 	List<Article> articleList = service.findAll();
	 	for(Article article: articleList){
	 		List<Comment> commentList= commentService.findByArticleId(article.getId());
	 		article.setCommentList(commentList);
	 		}
	 	model.addAttribute("articleList",articleList);
		return "ArticleTop";
	}
	
	
	/**
		投稿内容をDBに格納する.
	 * @param form 投稿内容がつまったFormオブジェクト
	 * @param model　Topに戻す際に必要となるオブジェクト
	 * @return　トップ画面を表示させるメソッドへ
	 */
	@RequestMapping("/insert")
	public String insert(ArticleForm form, Model model) {
	
		Article article =new Article();
		article.setName(form.getName());
		article.setContent(form.getContent());
		service.save(article);
		
		return index(model);
	}

}
