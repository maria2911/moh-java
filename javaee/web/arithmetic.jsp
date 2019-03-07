<%-- 
    Document   : arithmetic
    Created on : Mar 6, 2019, 2:38:49 PM
    Author     : Pengguna PC 09
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <h1>Hello World! belajar Arithmetic</h1>
        2 + 2 = ${2 + 2}
        <hr>
        <h1>Scriptlet</h1>
        <% 
        String name= "Maria Arshad ";
        out.println(name);
        out.println(cetak(5));
        %>
        
        <hr>
        <%! 
        public String cetak(int bil) {
        String str = "";
            for(int i=0; i<bil; i++){
                str += i + "--";
        }
        return str;
    }
        %>
        
        <h1>JSP Expression masukkan tanda = ...</h1>
        Tarikh hari ini ialah <%= new java.util.Date() %>
        <hr>
        
        <h1>JSP Directives masukkan tanda@</h1>
        <%@include file="form.html" %>
        <hr>
    </body>
</html>
