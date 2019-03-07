<%@page import="models.ProjectModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controllers.Project"%>
<%@include file="../include/header.jsp" %>

papar senarai 
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
<!--        <td><%= pro.getId() %></td>-->
        <td><%= pro.getId() %></td>
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
