<%-- 
    Document   : addstaff
    Created on : 17 Mar, 2019, 3:56:14 PM
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
         .main-form {
            width: 450px;
            margin: 50px;
        }
    </style>
</head>

<body>
    <div class="my-container">
        <div class="row my-row" id="r1c1">
            <div class="col-md-12 my-col">
                <jsp:include page="admnavbar.jsp"/>
            </div>
            </div>

        </div>
        <div class="row my-row">
            <div class="col-2 my-col" id="r2c1">
                <div class="container">
                    <jsp:include page="admsidebar.jsp"/>
                </div>

            </div>
            <div class="col-10 my-col" id="r2c2">
                <h3 class="display-4">Add Staff</h3><hr>
                <form action="addstaff_db" class="main-form needs-validation" novalidate>
        <div class="row">
            <div class="col">
                <div class="form-group">
                    <label for="firstname">Firstname</label>
                    <input type="text" name="firstname" id="firstname" class="form-control" required>
                </div>
            </div>
            <div class="col">
                <div class="form-group">
                    <label for="lastname">Lastname</label>
                    <input type="text" name="lastname" id="lastname" class="form-control" required>
                </div>
            </div>
        </div>
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" name="username" id="username" class="form-control" required>
            <div class="invalid-feedback">Please enter a valid username.</div>
        </div>
        <div class="form-group">
            <label for="username">Email</label>
            <input type="text" name="email" id="username" class="form-control" required>
            <div class="invalid-feedback">Please enter a valid email.</div>
        </div>
        <div class="form-group">
            <label for="Phone">Phone Number</label>
            <input type="number" name="phone" id="Phone" class="form-control" required>
            <div class="invalid-feedback">Please enter a valid Phone number.</div>
        </div>
        <div class="form-group">
            <label for="">Select Subject</label>
            <select class="form-control" id="sem" name="sub">
                <option>USIT101</option>
                <option>USIT102</option>
                <option>USIT103</option>
                <option>USIT104</option>
                <option>USIT105</option>
            </select>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" id="password" class="form-control" required>
            <div class="invalid-feedback">Please enter a valid password.</div>
        </div>

        <button type="submit" class="btn btn-success">Submit</button>
    </form>
    <script>
        var form = document.querySelector('.needs-validation');
        form.addEventListener('submit', function (event) {
            if (form.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
            }
            form.classList.add('was-validated');
        })
    </script>
            </div>
        </div>
    </div>
</body>
</html>
