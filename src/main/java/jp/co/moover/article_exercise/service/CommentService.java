package jp.co.moover.article_exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.moover.article_exercise.domain.Comment;
import jp.co.moover.article_exercise.repository.CommentRepository;

/**
 * コメントデータをDBから取得格納.
 * @author chai
 *
 */
@Service
@Transactional
public class CommentService {
	@Autowired
	private CommentRepository repository;
	
	/**
	 * 指定された掲示板のコメント全件を取得するメソッド.
	 * @param articleId 指定された掲示板のID
	 * @return　取得したコメント情報
	 */
	public List<Comment> findByArticleId(int articleId){
		
		return repository.findByArticle(articleId);
	}

}
