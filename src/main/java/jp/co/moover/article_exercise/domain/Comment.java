package jp.co.moover.article_exercise.domain;

/**
 * コメントを受け取る.
 * @author chai
 *
 */
public class Comment {
	
	/**コメントId*/
	private Integer id;
	/**コメントした人の名前*/
	private String name;
	/**内容*/
	private String content;
	/**記事ID*/
	private Integer articleid;

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
	public Integer getArticleid() {
		return articleid;
	}
	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}
	
	

}
