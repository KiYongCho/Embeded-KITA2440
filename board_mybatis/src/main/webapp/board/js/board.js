$(function() {
});

let loginMid;

const getReplyList = function(bid, mid) {
	loginMid = mid;
	$.get("/board_mybatis/board/api/replyList.jsp?bid="+bid, function(jsonStr) {
		const replyArr = JSON.parse(jsonStr);		
		for (reply of replyArr) {
			let formattedDate = moment(reply.rregdate).format("HH:MM");
			let eachReply = 
				"<p>[" 
				+ formattedDate 
				+	"] <b>" + reply.rwriter 
				+ "</b> "
				+ reply.rcontent;
			if (mid==reply.rwriter) {
				eachReply += " <a href='javascript:deleteReply(\"" + reply.bid + "\", \"" 
				+ reply.rid + "\");'>[X]</a>";
			} else {
				eachReply += "";					
			}				
			eachReply += "</p>";
			$("#replyList").append(eachReply);
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
		getReplyList(bid, loginMid);
	});
}

const deleteReply = function(bid, rid) {
	$.get("/board_mybatis/board/api/deleteReply.jsp?bid="+bid+"&rid="+rid, function() {
	}).done(function() {
		$("#replyList").html("");
		getReplyList(bid, loginMid);		
	});
};




















