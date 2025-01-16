/**
 * 
 */

function checkEmail(event) {
	// 가입폼의 #check-email을 누르면 email 텍스트 상자의 value가 중복되었는지 
	// Ajax로 체크!
											/*alert("이메일 체크 이벤트");   // 확인용 */
	const frm= event.target.form;
	const url = event.target.getAttribute("data-target")
	
	const email = frm.email.value.trim();
	
	if (email.length === 0) {
		alert("이메일을 입력해 주세유");
		return;
	}
	
	
	
	
}

window.addEventListener("load", (event) => {
	document.getElementById("check-email").addEventListener("click", checkEmail);
})