<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta>
<title>Insert title here</title>
</head>
<body>

<h1>掲示板アプリケーション</h1>
<form:form modelAttribute="articleForm" action="${pageContext.request.contextPath}/ArticleController/insert">
	投稿者名：<form:input path="name"/><br>
	投稿内容：<form:input path="content"/><br>
	<input type="submit" value="記事投稿"/><br>
</form:form>
<hr>
<c:forEach var="article" items="${articleList}">
	投稿ID：<c:out value="${article.id}"/><br>
	投稿者名:<c:out value="${article.name}"/><br>
	投稿内容：<c:out value="${article.content}"/><br>
	<br>
	<hr>
	<c:forEach var="comment" items="${article.commentList}">
		コメントID：<c:out value="${comment.id}"/><br>
		コメント者名:<c:out value="${comment.name}"/><br>
		コメント内容:<c:out value="${comment.content}"/><br>
		<hr>
	</c:forEach>
	<hr>
	<hr>
</c:forEach>
</body>
</html>