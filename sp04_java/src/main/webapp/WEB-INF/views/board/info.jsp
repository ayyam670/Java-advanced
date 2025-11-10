<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/info.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
</head>
<body>
	<h3>게시글 상세보기</h3>
	<div class="card"></div>
	<div>${board.bno}</div>
	<div>작성자: ${board.writer}</div>
	<div>내용: ${board.content}</div>
	<hr>

	<div id="replyForm">
		<input id="replyer" name="replyer"> <input id="reply"
			name="reply">
		<button type="button" class="btn btn-success btnInsert me-3">댓글등록</button>
	</div>

	<div id="replyList"></div>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>

<script>
	var bno = ${board.bno};
</script>
<script src="/resources/reply.js"></script>
</body>
</html>