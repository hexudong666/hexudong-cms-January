<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
   <%@  taglib  prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--日期插件--><script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
<!--bootstrap的css,js -->
<link rel="stylesheet" href="/resource/bootstrap-4.3.1/css/bootstrap.css"/> 
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script> 
</head>
<body>
	<!-- 循环获取 -->
	<c:forEach items="${collect}" var="f">
<!-- 获取的文章名字 -->文章标题为:${f.name}
<!-- 获取的文章创建时间 -->文章创建时间为:${f.created}
		<input type="button" value="删除" onclick="del(${f.id})">
	</c:forEach>
	
</body>
<script type="text/javascript">
	/*删除收藏的文章*/
	function del(id){
		location="/UserController/delSc?id"=+id;
	}

</script>
</html>