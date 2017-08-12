package jp.co.moover.article_exercise.web;

/**
 * 記事の投稿内容を受け取るクラス.
 * @author chai
 *
 */
public class ArticleForm {
	
	/**氏名*/
	private String name;
	/**内容*/
	private String content;
	
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
	
	

}
