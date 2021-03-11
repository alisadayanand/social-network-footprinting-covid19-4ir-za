<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<h1 id="article_header" class="text-warning" align="center">Tweets from Vodacom, Telkom & Takealot</h1>
	<div>&nbsp;</div>


	<div id="display_tweets">
		<c:url var="displayTweets" value="/user/list" /><a id="add" href="${displayTweets}" class="btn btn-success">Display Tweets</a>
	</div>

	<div id="ba1">
		<%--		<input type = "image" src = "images/vbm.png"> Vodacom </input>--%>
		<h2></h2>
		<h2>Basic Analysis:</h2>
	</div>
	<div>&nbsp;</div>

	<div id="ba">
		<c:url var="ba" value="/user/ba"/><a id="v" href="${ba}" class="btn btn-success">Basic Analysis</a>
	</div>

	<div>&nbsp;</div>

	<div id="sa">
		<%--		<input type = "image" src = "images/vbm.png"> Vodacom </input>--%>
		<h2></h2>
		<h2>Sentiment Analysis:</h2>
	</div>
	<div>&nbsp;</div>

	<div id="vbm">
		<c:url var="vbm" value="/user/vbm"/><a id="v" href="${vbm}" class="btn btn-success">Vodacom before March</a>
	</div>

	<div>&nbsp;</div>

	<div id="vam">
		<c:url var="vam" value="/user/vam"/><a id="v" href="${vam}" class="btn btn-success">Vodacom after March</a>
	</div>

	<div>&nbsp;</div>

	<div id="tbm">
		<c:url var="tbm" value="/user/tbm"/><a id="v" href="${tbm}" class="btn btn-success">Telkom before March</a>
	</div>

	<div>&nbsp;</div>

	<div id="tam">
		<c:url var="tam" value="/user/tam"/><a id="v" href="${tam}" class="btn btn-success">Telkom  after March</a>
	</div>

	<div>&nbsp;</div>

	<div id="tabm">
		<c:url var="tabm" value="/user/tabm"/><a id="v" href="${tabm}" class="btn btn-success">Takealot before March</a>
	</div>

	<div>&nbsp;</div>

	<div id="taam">
		<c:url var="taam" value="/user/taam"/><a id="v" href="${taam}" class="btn btn-success">Takealot after March</a>
	</div>

	<div id="fr1">
		<%--		<input type = "image" src = "images/vbm.png"> Vodacom </input>--%>
		<h2></h2>
		<h2>Final Report:</h2>
	</div>
	<div>&nbsp;</div>

	<div id="fr">
		<c:url var="fr" value="/user/fr"/><a id="v" href="${fr}" class="btn btn-success">Final Report</a>
	</div>

	<div>&nbsp;</div>

	<!-- Table to display the user list from the mongo database -->
	<table id="users_table" class="table">
		<thead>
		<tr align="left">
			<th>id_str</th><th>full_text</th><th>source</th><th>in_reply_to_status_id_str</th>
			<th>in_reply_to_user_id_str</th><th>in_reply_to_screen_name</th><th>lang</th><th>entities</th><th>user</th>
			<th>is_quote_status</th><th>favorited</th><th>retweeted</th><th>retweet_count</th><th>favorite_count</th><th colspan="2"></th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${users}" var="user">
			<tr align="left">
				<td><c:out value="${user.id_str}" /></td>
				<td><c:out value="${user.full_text}" /></td>
				<td><c:out value="${user.source}" /></td>
				<td><c:out value="${user.in_reply_to_status_id_str}" /></td>
				<td><c:out value="${user.in_reply_to_user_id_str}" /></td>
				<td><c:out value="${user.in_reply_to_screen_name}" /></td>
				<td><c:out value="${user.lang}" /></td>
				<td><c:out value="${user.entities}" /></td>
				<td><c:out value="${user.user}" /></td>
				<td><c:out value="${user.is_quote_status}" /></td>
				<td><c:out value="${user.favorited}" /></td>
				<td><c:out value="${user.retweeted}" /></td>
				<td><c:out value="${user.retweet_count}" /></td>
				<td><c:out value="${user.favorite_count}" /></td>

			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>