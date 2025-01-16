/**
 * 
 */

function checkEmail(event) {
	// 가입폼의 #check-email을 누르면 email 텍스트 상자의 value가 중복되었는지 
	// Ajax로 체크!
															/*alert("이메일 체크 이벤트");   // 확인용 */			
		const obj = event.target;
		const target = obj.getAttribute("data-target");
		
		const frm = obj.form;
		const email = frm.email.value;
		
		if (email.trim().length === 0) {
			alert("이메일을 입력하세요.");
			frm.email.focus();
			return;
		}
		
		fetch(`${target}?email=${email}`)
		.then(response => {
			console.log(response);
			return response.json();
		})
		.then(data => {
			console.log(data);
			// ex. {result: 'success', exists: false}
			if (data.exists) {
				alert("이미 사용중인 이메일입니다");
				frm.emailCheck.value="n";
				throw new error("중복된 이메일입니다.");
			} else {
				alert("사용 가능한 이메일입니다.")
				frm.emailCheck.value="y";
			}
		})
		.catch(error => {
			console.error(error);
		})
	}

	
	
window.addEventListener("load", (event) => {
	document.getElementById("check-email").addEventListener("click", checkEmail);
})