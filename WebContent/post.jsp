<%@page import="dao.ArticleDao"%>
<jsp:useBean id="a" class="bean.Articles"></jsp:useBean>
<jsp:setProperty property="*" name="a"/>

<%
int i=ArticleDao.save(a);
if(i>0){
response.sendRedirect("add-success.jsp");
}else{
response.sendRedirect("add-error.jsp");
}
%>