<%-- 
    Document   : decision
    Created on : Mar 6, 2019, 3:11:33 PM
    Author     : Pengguna PC 09
--%>

<%!
int day = 3;
%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page if ---- else</title>
    </head>
    <body>
        <h1>Belajar JSP for decision if ... else</h1>
        <% if (day == 1 | day ==7 ) {%>
            <p>Today is weekend</p>
        <% } else { %>
            <p>Today is not weekend</p>
        <% } %>
    </body>
</html>
