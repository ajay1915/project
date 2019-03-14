 <%-- 
    Document   : home
    Created on : 14 Mar, 2019, 9:12:00 AM
    Author     : AJAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Result Portal</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css"
         crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="/bootstrap/js/bootstrap.min.js"
        
        crossorigin="anonymous"></script>

    <style>
        table,
        tr,
        td {
            border: 1px solid black;
            table-layout: auto;
            border-collapse: collapse;
            text-align: center;
        }

        table {
            height: 100%;
            width: 100%;
            position: fixed;
            margin:0px;
        }
       
    </style>
</head>

<body>
    <div class="table-responsive">
        <table class="table table-light">
            <div id="aj">
                <thead>
                    <tr class="bg-info">
                        <td colspan="2">
                            <h1 class="display-3" align="center">Result Portal</h1>
                        </td>
                    </tr>
                </thead>

            </div>

            <div>
                <tbody>
                    <tr>
                        <td class="table-success" style="padding:50px;">
                            <jsp:include page="stdlogin.jsp"/>
                        </td>
                        <td class="table-danger" style="padding:50px;">
                            <jsp:include page="admlogin.jsp" />
                        </td>
                    </tr>
                </tbody>

            </div>

            <div>
                <tfoot>
                    <tr>
                        <td colspan="2">@footer</td>
                    </tr>
                </tfoot>
            </div>


        </table>
    </div>
</body>

</html>

