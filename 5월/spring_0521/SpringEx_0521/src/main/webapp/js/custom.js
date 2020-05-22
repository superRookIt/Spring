function check() {

	var name_check = /^[가-힣]*$/;

	var id_check = /(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).*$/;

	var pw_check = /(?=.*[~!@#$%^&*()_+|<>?])(?=.[1-9]).*$/;

	if (join.id.value == "") {
		alert('id를 입력해주세요')
		join.id.focus();
		return false;
	}
	
	if (!(id_check.test(join.id.value))) {
		alert("아이디는 대소문자, 숫자 1개 이상씩 입력해주세요")
		join.id.focus();
		return false;
	}

	
	if (join.name.value == "") {
		alert('이름을 입력해주세요')
		join.name.focus();
		return false;
	}
	

	if (!(name_check.test(join.name.value))) {
		alert('한글만 입력 가능합니다')
		join.name.focus();
		return false;
	}


	if (join.pw.value == "") {
		alert('비밀번호를 입력해주세요')
		join.pw.focus();
		return false;
	}

	if (!(pw_check.test(join.pw.value))) {
		alert('비밀번호는 특수문자와 숫자를 1개 이상 입력해야 합니다')
		join.pw.focus();
		return false;
	}

	if (!(join.pw.value == join.pw2.value)) {
		alert('패스워드가 일치하지 않습니다. 다시 입력해주세요');
		join.pw.focus();
		return false;
	}

	if (join.gender.value == "") {
		alert('성별을 선택해주세요')
		join.gender.focus();
		return false;
	}

	return join.submit();

}
