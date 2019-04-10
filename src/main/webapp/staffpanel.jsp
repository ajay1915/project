<%-- 
    Document   : staffpanel
    Created on : 7 Apr, 2019, 7:21:14 PM
    Author     : AJAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
    </head>
    <style>
        body {}

        .my-container {
            
            position: relative;
        }

        .my-row {
            border: 1px solid #666666;
            border-collapse: collapse;

        }

        .my-col {
            border: 1px solid #666666;
            border-collapse: collapse;
        }

        #r1c1 {
            height: 100%;
        }

        #r2c2,
        #r2c1 {
            height: 100%;
        }
    </style>
</head>

<body>
    <div class="my-container">
        <div class="row my-row" id="r1c1">
            <div class="col-md-12 my-col">
                <jsp:include page="staffnavbar.jsp"/>
            </div>
            </div>
        </div>
        <div class="row my-row">
            
            <div class="col-12 my-col" id="r2c2">
                <jsp:include page="staffaddresult.html"/>
            </div>
        </div>
    </div>
</body>
</html>
