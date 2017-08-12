package jp.co.moover.article_exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.moover.article_exercise.domain.Article;
import jp.co.moover.article_exercise.repository.ArticleRepository;

/**
 * 記事の情報をやりとりするクラス.
 * @author chai
 *
 */
@Service
@Transactional
public class ArticleService {
	@Autowired
	private ArticleRepository repository;
	
	/**
	 * 記事一覧をDBから取得するメソッド.
	 * @return 取得した情報を返す
	 */
	public List<Article> findAll(){
		
		return repository.findAll();
		
	}

}
