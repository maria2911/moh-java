<%@page import="models.ProjectModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controllers.Project"%>
<%@include file="../include/header.jsp" %>

<div>
    <a href="/pms/project/form.jsp" class="btn btn-info btn-sm">Tambah Project</a>
</div>
<br>
<form method="post" action="/pms/project">
    <div class="row">
        <div class="col-md-1">Title</div>
        <div class="col-md-2"><input type="text" name="title" class="form-control"></div>
        <div class="col-md-1">Description</div>
        <div class="col-md-2"><input type="text" name="description" class="form-control"></div>
        <div class="col-md-1"><input type="submit" name="search" class="btn btn-primary" value="Search"></div>
    </div>
</form>
<br>
<!--<div> PAPAR SENARAI PROJECT</div>-->

<table class="table table-bordered">
    <tr>
        <td>Bil</td>
        <td>Tajuk</td>
        <td>Keterangan</td>
        <td>Tindakan</td>
    </tr>
    <% 
        ArrayList list = (ArrayList)request.getAttribute("list");
        for (int i=0; i<list.size(); i++){
            ProjectModel pro = (ProjectModel) list.get(i);
    %>
    <tr>
        
        <td><%= i + 1 %></td>
        <td><%= pro.getTitle() %></td>
        <td><%= pro.getDescription() %></td>
        <td>  
            <a href="/pms/project?id=<%= pro.getId() %>&action=Edit" class="btn btn-success" btn-sm">Edit</a>
            <a href="/pms/project?id=<%= pro.getId() %>&action=Del" class="btn btn-danger" btn-sm">Delete</a>
        </td>
         
           
    </tr>
<% } %>
</table>

<%@include file="../include/footer.jsp" %>
