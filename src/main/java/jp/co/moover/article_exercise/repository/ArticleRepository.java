package jp.co.moover.article_exercise.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.moover.article_exercise.domain.Article;

/**
 * 記事情報をDBから取得、格納を行う.
 * @author chai
 *
 */
@Repository
@Transactional
public class ArticleRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	public static final RowMapper<Article> articleRowMapper=(rs,i)->{
		Article article = new Article();
		article.setId(rs.getInt("id"));
		article.setName(rs.getString("name"));
		article.setContent(rs.getString("content"));
		return article;
	};
	
	
	/**
	 * 記事の全件取得を行う.
	 * @return　取得した情報を返す
	 */
	public List<Article> findAll(){
		
		String sql ="select id, name, content from articles";
		List<Article> articleList = template.query(sql, articleRowMapper);
		
		return articleList;
	}

}
