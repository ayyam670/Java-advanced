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
	let bno = ${board.bno};
</script>
<script>
add(); // 등록 이번트
remove();  // 삭제 이벤트
getList(); // 전체조회

/* -----------------------------------------
 * 댓글 등록
 * -----------------------------------------
 */

function add(){
	$(".btnInsert").on("click", (e) => {
		// 인풋 태그 값을 콘솔에 출력 val()  , id = #()   name = $()
		const replyer = $(`[name="replyer"]`).val();
		const reply = $(`[name="reply"]`).val();
		console.log(replyer, reply);
		
		fetch('/reply', {
			  method: 'POST',
			  body: JSON.stringify({reply, replyer, bno}),   // 필드명과 값이 같을때는 축약형으로 생략가능  {reply:reply, replyer:replyer}
			  headers: {
			    'Content-type': 'application/json; charset=UTF-8',
			  },
			})
			  .then((response) => response.json())
			  .then((response) => {
				  //getList();
				  let data = response.data;
				  let reply = document.querySelector("#replyList");
				  let newTag =
					   `<div class="row mb-2" data-rno="\${data.rno}">
						<div class="col">\${data.replyer}</div>
						<div class="col-7">\${data.reply}</div>
						<div class="col"><button class="btn btn-danger btnDelete me-3">삭제</button>
										 <button class="btn btn-warning btnUpdate me-3">수정</button></div>
				</div>`
					  reply.insertAdjacentHTML("afterbegin", newTag);   // afterbegin
			  }); // end of then
	}) // end of on
};  // end of function add


/* -----------------------------------------
 * 댓글 조회
 * -----------------------------------------
 */
function getList(){
	fetch(`http://localhost:81/board/\${bno}/reply`)
	.then(response => response.json())
	.then((datas) => {
		let reply = document.querySelector("#replyList");
		for(data of datas){
			/* let newTag = `<div>\${data.reply} \${data.replyer}</div>` */
			let newTag = `<div class="row mb-2" data-rno="\${data.rno}">
				<div class="col">\${data.replyer}</div>
				<div class="col-7">\${data.reply}</div>
				<div class="col"><button class="btn btn-danger btnDelete me-3">삭제</button>
								 <button class="btn btn-warning btnUpdate me-3">수정</button></div>
			</div>`;
			reply.insertAdjacentHTML("beforeend", newTag);
		}
	})
}

/* -----------------------------------------
 * 댓글 삭제
 * -----------------------------------------
 */
function remove(){
	$("#reply").on("click", ".btnDelete", (e) => {
		const rno = $(e.target).closest(".row").data("rno");
		console.log(rno);
		/* 가장 가까운 조상 찾아감 = closest  */
		fetch(`http://localhost:81/reply/\${rno}`, {
			method: "DELETE"
		})
			.then(result => result.text())
			.then(result => {
				console.log(result)
				$(e.target).closest(".row").remove();
			})	
	});
}
</script>
</body>
</html>