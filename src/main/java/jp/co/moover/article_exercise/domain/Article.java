package jp.co.moover.article_exercise.domain;

import java.util.List;

/**
 * 掲示板記事受け取り.
 * @author chai
 *
 */
public class Article {
	
	/**ID*/
	private Integer id;
	/**記事作成者名*/
	private String name;
	/**内容*/
	private String content;
	/**コメント*/
	private List<Comment> commentList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	
	
	

}
