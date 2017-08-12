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
<hr>
<c:forEach var="article" items="${articleList}">
	投稿ID：<c:out value="${article.id}"/><br>
	投稿者名:<c:out value="${article.name}"/><br>
	投稿内容：<c:out value="${article.content}"/><br>
	<hr>
</c:forEach>
</body>
</html>