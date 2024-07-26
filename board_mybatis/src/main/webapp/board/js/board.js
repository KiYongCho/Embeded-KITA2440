$(function() {
});

const getReplyList = function(bid) {
	$.get("/board_mybatis/board/api/replyList.jsp?bid="+bid, function(jsonStr) {
		const replyArr = JSON.parse(jsonStr);
		console.log(replyArr);
		for (reply of replyArr) {
			let formattedDate = moment(reply.rregdate).format("HH:MM");
			$("#replyList").append(
				"<p>[" 
				+ formattedDate 
				+	"] <b>" + reply.rwriter 
				+ "</b> "
				+ reply.rcontent 
				+ " <a href='javascript:deleteReply(\"" + reply.rid + "\");'>[X]</a>"
				+ "</p>"
			);
		}
	});
};

const registReply = function(rwriter, bid) {
	$.post(
		"/board_mybatis/board/api/registReply.jsp", 
		{
			"rwriter": rwriter,
			"rcontent": $("#rcontent").val(),
			"bid": bid
		}
	).done(function() {
		$("#replyList").html("");
		getReplyList(bid);
	});
}




















