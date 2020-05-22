<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style_header.css">
		<!--  <link rel="stylesheet" type="text/css" href="css/style_join03_success.css">-->
		<link rel="stylesheet" type="text/css" href="css/style_join02_info_input.css">
		<link rel="stylesheet" type="text/css" href="css/style_footer.css">

		<title>회원가입 - 회원가입완료</title>
	</head>
	
	<body>
		<header>
			<div id="nav_up">
				<ul>
					<li><a href="#">회원가입</a></li>
					<li><a href="#">로그인</a></li>
					<li><a href="#">고객행복센터</a></li>
					<li><a href="#">배송지역검색</a></li>
					<li><a href="#">기프트카드 등록</a></li>
				</ul>
			</div>	
			<nav>
				<a href="#"></a>
				<ul>
					<li><a href="#">COOKIT소개</a></li>
					<li><a href="#">COOKIT메뉴</a></li>
					<li><a href="#">리뷰</a></li>
					<li><a href="#">이벤트</a></li>
					<li><a href="#">MY쿡킷</a></li>
				</ul>
				<ul>
					<li>
						<a href="#"><span>장바구니</span></a>
					</li>
					<li>
						<a href="#"><span>메뉴찾기</span></a>
					</li>
				</ul>
			</nav>
		</header>
		
		
		
		
		
		<section>
			<div id="subBanner"></div>
			<div id="locationN">
				<ul>
					<li>HOME</li>
					<li>회원가입</li>
					<li>회원가입완료</li>
				</ul>
			</div>
			
			<div id="sub_top_area">
				<h3>회원가입</h3>
			</div>
			
			<div id="join_step_div">
				<ul style="display: table;  margin-left: auto;  margin-right: auto;">
					<li>
						<span>STEP.3</span>
						<p>회원가입완료</p>
					</li>
				</ul>
			</div>
			
			
			
			<div id="join_success_div">
			
			<fieldset class="fieldset_class">
					<dl id="join_name_dl">
						<dt>
							<div></div>
							<label for="name">이름</label>
						</dt>
						<dd>
							<input type="text" id="name" value="${jdto.name }" readonly="readonly"/>
						</dd>
					</dl>
					<dl id="join_id_dl">
						<dt>
							<div></div>
							<label for="id">아이디</label>
						</dt>
						
						<dd>
							<input type="text" id="id" value="${jdto.id }" readonly="readonly"/>
						</dd>
						
					</dl>
					<dl id="join_pw1_dl">
					
						<dt>
							<div></div>
							<label for="pw1">비밀번호</label>
						</dt>
						
						<dd>
							<input type="password" id="pw1" value="${jdto.pw }" readonly="readonly" />
						</dd>
					</dl>
					
					
					<dl id="join_mail_dl">
						<dt>
							<div></div>
							<label for="mail_id">이메일</label>
						</dt>
						<dd>
							<input type="text" id="mail_id" value="${jdto.mail_id }" readonly="readonly">
							<span>@</span>
							<input type="text" id="main_tail" value="${jdto.mail_tail }" readonly="readonly" >
						</dd>
					</dl>
					
					
					<dl id="join_address_dl">
						<dt> 
							<div></div>
							<label for="">주소</label>
						</dt>
						<dd>
							<input type="text" id="f_postal" name="f_postal" value="${jdto.f_postal }" readonly="readonly" />
							<span>-</span>
							<input type="text" id="l_postal" name="l_postal" value="${jdto.l_postal }" readonly="readonly">
							<input type="button" value="우편번호"/>
							<input type="text" id="address1" name="address1" value="${jdto.address1 }" readonly="readonly">
							<input type="text" id="address2" name="address2" value="${jdto.address2 }" readonly="readonly">
						</dd>
						
					</dl>
					
					<dl id="join_tell_dl">
						<dt>
							<div></div>
							<label for="f_tell">휴대전화</label>
						</dt>
						<dd>
							<input type="text" id="f_tell" name="f_tell" value="${jdto.f_tell }" readonly="readonly">
							<span> - </span>
							<input type="text" id="m_tell" name="m_tell" value="${jdto.m_tell }" readonly="readonly">
							<span> - </span>
							<input type="text" id="l_tell" name="l_tell" value="${jdto.l_tell }" readonly="readonly">
						</dd>
						
					</dl>
					<dl id="join_birth_dl">
						<dt>
							<div></div>
							<label for="birth_year">생년월일</label>
						</dt>
						
						<dd>
						<input type="text" id="birth_year" value="${jdto.birth_year }" readonly="readonly">
							
							<span>년</span>
							
						<input type="text" id="birth_month" value="${jdto.birth_month }" readonly="readonly">
							
							<span>월</span>
							
						<input type="text" id="birth_day" value="${jdto.birth_day }" readonly="readonly">
						
							<span>일</span>
						
						
						
						<c:choose>
					
					     <c:when test="${jdto.calendar eq 'lunar' }">
						
							<div>
								<input type="radio" name="calendar" id="lunar" value="lunar" checked="checked"/>
								<label for="lunar">양력</label>
								
								<input type="radio" name="calendar" id="solar" value="solar" />
								<label for="solar">음력</label>
								
							</div>
							
							</c:when>
							
							
							<c:otherwise>
							
							
							<div>
								<input type="radio" name="calendar" id="lunar" value="lunar" />
								<label for="lunar">양력</label>
								
								<input type="radio" name="calendar" id="solar" value="solar" checked="checked" >
								<label for="solar">음력</label>
								
							</div>
							
							</c:otherwise>
							
							</c:choose>
							
						</dd>
						
					</dl>
					
					
					<dl id="join_gender_dl">
					
						<dt>
							<div></div>
							<label for="">성별</label>
						</dt>
						


						
						<c:choose>
					
					     <c:when test="${jdto.gender eq 'male' }">
						
						
						<dd>
							<div>
								<input type="radio" name="gender" id="male" value="male" checked="checked"/>
								<label for="male">남성</label>
								<input type="radio" name="gender" id="female" value="female" />
								<label for="female">여성</label>
							</div>
						</dd>
						
						</c:when>
						
						<c:otherwise>
						
						<dd>
							<div>
								<input type="radio" name="gender" id="male" value="male" />
								<label for="male">남성</label>
								<input type="radio" name="gender" id="female" value="female" checked="checked" />
								<label for="female">여성</label>
							</div>
						</dd>
						
						</c:otherwise>
						
						</c:choose>
						
						
					</dl>
					
					
					
					<dl id="join_newsletter_dl">
					
						<dt>
							<div></div>
							<label for="">뉴스레터 수신여부</label>
						</dt>
						
						
						<c:choose>
					
					     <c:when test="${jdto.newletter eq 'yes' }">
						
						
						<dd>
							<span>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
							<div>
								<input type="radio" name="newletter" id="newletter_y" value="yes" checked="checked" />
								<label for="newletter_y">예</label>
								<input type="radio" name="newletter" id="newletter_n" value="no" />
								<label for="newletter_n">아니오</label>
							</div>
						</dd>
						
						</c:when>
						
						<c:otherwise>
						
						<dd>
							<span>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
							<div>
								<input type="radio" name="newletter" id="newletter_y" value="yes" >
								<label for="newletter_y">예</label>
								<input type="radio" name="newletter" id="newletter_n" value="no" checked="checked">
								<label for="newletter_n">아니오</label>
							</div>
						</dd>
						
						</c:otherwise>
						
						</c:choose>
						
						
						
					</dl>
					
					
					
					<dl id="join_sms_dl">
					
						<dt>
							<div></div>
							<label for="">SMS 수신여부</label>
						</dt>
						
						
						<c:choose>
					
					     <c:when test="${jdto.sms eq 'yes' }">
						
						
						<dd>
							<span>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
							
							<div>
								<input type="radio" name="sms" id="sms_y" value="yes" checked="checked"/>
								<label for="sms_y">예</label>
								<input type="radio" name="sms" id="sms_n" value="no" />
								<label for="sms_n">아니오</label>
							</div>
						</dd>
						
						</c:when>
						
						
						<c:otherwise>
						
						<dd>
							<span>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
							
							<div>
								<input type="radio" name="sms" id="sms_y" value="yes" />
								<label for="sms_y">예</label>
								<input type="radio" name="sms" id="sms_n" value="no"  checked="checked"/>
								<label for="sms_n">아니오</label>
							</div>
						</dd>
						
						
						</c:otherwise>
						
						</c:choose>
						
						
						
					</dl>
					
				</fieldset>

			
				<p style="text-align: center">
					감사합니다.
					<strong>회원가입이 완료되었습니다.</strong>
				</p>
			</div>	
				
				
		</section>
		
		
		
		
		
		
		
		<footer>
			<div id="footer_wrap">
				<div id="footer_cont">
					<div id="fl_l">
						<a href="#"></a>
						<p>© COOKIT ALL RIGHTS RESERVED</p>
					</div>
					<div id="fl_c">
						<ul>
							<li><a href="#">이용약관</a></li>
							<li><a href="#">개인정보처리 방침</a></li>
							<li><a href="#">법적고지</a></li>
							<li><a href="#">사업자정보 확인</a></li>
						</ul>
						<div id="fl_c_info">
							<p>씨제이제일제당(주)</p>
							<p>대표이사 : 손경식,강신호,신현재</p>
							<p>사업자등록번호 : 104-86-09535</p>
							<p>주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560</p>
							<p>통신판매업신고 중구 제 07767호</p>
							<p>개인정보보호책임자 : 조영민</p>
							<p>이메일 : cjon@cj.net</p>
							<p>호스팅제공자 : CJ올리브네트웍스㈜</p>
							<p>고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <a href="#">가입 사실 확인</a></p>
						</div>
					</div>
					<div id="fl_r">
						<span>cj그룹계열사 바로가기 ▼</span>
						<dl>
							<dt>고객행복센터</dt>
								<dd>1688-1920</dd>
						</dl>
						<a href="#">1:1문의</a>						
					</div>
				</div>
			</div>
		
		
		
		</footer>
	</body>
</html>