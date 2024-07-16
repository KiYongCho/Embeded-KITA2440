$(function(){
	
	$("#btn").on("click", function() {
		
		const num1 = $("input[name='num1']").val();
		const num2 = $("input[name='num2']").val();
		
		if (!num1 || isNaN(num1)) {
			alert('첫번째 숫자를 입력해 주세요!');
			return false;
		}
		if (!num2 || isNaN(num2)) {
			alert('두번째 숫자를 입력해 주세요!');
			return false;
		}
		const operator = $("input[name='operator']").val();
		if (!operator) {
			alert('연산자를 입력해 주세요!');
			return false;
		}
		if (operator!='+' && operator!='-' && operator!='*' && operator!='/') {
			alert('연산자는 +, -, *, / 중에서 입력해 주세요!');
			return false;
		}
		
		$("form[name='frm']").submit();
		
	});	
	
});
	






