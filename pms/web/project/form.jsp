<%@page import="models.ProjectModel"%>
<%@include file="../include/header.jsp" %>

<%
ProjectModel pro = (ProjectModel) request.getAttribute("project");
%>

<legen>Daftar Projek</legen>
<form method="post" action="/pms/project">
    <div class="row">
        <div class="col-md-1">TAJUK</div>
        <div class="col-md-4"><input  value="<%= pro.getTitle() %>" class="form-control" name="title"></div>
<!--        <div class="col-md-4"><textarea class="form-control" name="title"></textarea></div>-->
    </div>
    <br>
    <div class="row">
        <div class="col-md-1">KETERANGAN</div>
        <div class="col-md-4"><textarea class="form-control" name="description"><%= pro.getDescription() %></textarea></div>
    </div>
     <br>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-4"><input class="btn btn-primary" type="submit" value="Simpan"></div>
    </div>
</form>

<%@include file="../include/footer.jsp" %>