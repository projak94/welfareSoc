<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title><spring:message code="title.circle" /></title>
</head>
<body>
    <form name="sForm" method="post" >
        <h2>로그인</h2>
        <div>
          <dl>
            <dt><label for="mng_id">아이디</label></dt>
            <dd><input style="width:190px;" type="text" name="user_id" title="아이디" maxlength="16"/></dd>
            <dt><label for="mng_pw">비밀번호</label></dt>
            <dd><input style="width:190px;" type="password" name="mng_pw" title="비밀번호" maxlength="20"/></dd>
          </dl>
          <p class="btn">
            <span style="border:1px solid #000;cursor:pointer;" id="loginBtn">로그인</span>
          </p>
        </div>
    </form>
    
<script src="<c:url value='/js/jquery/jquery-3.3.1.min.js'/>"></script>
<script>
    $("#loginBtn").click(function(){
      alert();
    });
</script>
</body>
</html>