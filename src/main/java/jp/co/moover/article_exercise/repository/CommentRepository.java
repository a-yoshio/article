package jp.co.moover.article_exercise.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.moover.article_exercise.domain.Comment;

/**
 * コメントデータをDBから取得、格納するクラス.
 * @author chai
 *
 */
@Repository
@Transactional
public class CommentRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public static final RowMapper<Comment> commentRowMapper=(rs,i)->{
		Comment comment =new Comment();
		comment.setId(rs.getInt("id"));
		comment.setName(rs.getString("name"));
		comment.setContent(rs.getString("content"));
		comment.setArticleid(rs.getInt("article_id"));
		return comment;
	};
	
	/**
	 * 指定された記事のコメント全件を取得する.
	 * @param articleId 指定した記事のID
	 * @return　取得したコメント
	 */
	public List<Comment> findByArticle(int articleId){
		String sql="select id, name, content, article_id from comments"
				+ " where article_id=:articleId;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("articleId",articleId);
		List<Comment> commentList = template.query(sql, param,commentRowMapper);
		return commentList;
	}

}
