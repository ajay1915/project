<%-- 
   Document   : home
   Created on : 14 Mar, 2019, 9:12:00 AM
   Author     : AJAY
--%>

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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
            margin: 0px;
        }
    </style>
</head>

<body>
    <div class="table-responsive">
        <table class="table table-light">
            <div id="aj">
                <thead style="height:80px;">
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
                        <td class="table-success" style="padding:50px; width: 50%; height: 460px;">
                            notifiacton panel
                        </td>
                        <td class="table-danger" style="padding:50px; width: 50%; height: 460px; margin-top: 150px;">
                            <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal"
                                data-target="#AdminLogin">Admin Login</button>
                            <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal"
                                data-target="#StaffLogin">Staff Login</button>
                            <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal"
                                data-target="#StudentLogin">Student Login</button>
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




    <!-- Staff Login Modal -->
    <div class="modal" id="StaffLogin">
        <div class="modal-dialog">
            <div class="modal-content">
                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="display-4">Staff Login</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <form action="staffvalidate">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="staffuname">Username</label>
                        <input type="text" name="staffuname" id="staffuname" class="form-control" placeholder="" aria-describedby="helpId">
                    </div>
                    <div class="form-group">
                        <label for="staffpwd">Password</label>
                        <input type="password" name="staffpwd" id="staffpwd" class="form-control" placeholder=""
                            aria-describedby="helpId">
                    </div>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <input type="submit" value="Login" class="btn btn-success float-left">

                    <button type="button" class="btn btn-danger " data-dismiss="modal">Close</button>
                </div>
                </form>
            </div>
        </div>
    </div>


    <!-- Student Login Modal -->
    <div class="modal" id="StudentLogin">
        <div class="modal-dialog">
            <div class="modal-content">
                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="display-4">Student Login</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <form action="stdvalidate">
                   <div class="modal-body">
                    <div class="form-group">
                        <label for="">Select Semester</label>
                        <select class="form-control" id="sem" name="sem">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="rollno">Roll Number</label>
                        <input type="rollno" name="rollno" id="rollno" class="form-control" placeholder=""
                            aria-describedby="helpId">
                    </div>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <input type="submit" value="Login" class="btn btn-success float-left">
                    <button type="button" class="btn btn-danger " data-dismiss="modal">Close</button>
                </div> 
                </form>
            </div>
        </div>
    </div>


    <!-- Admin Login Modal -->
    <div class="modal" id="AdminLogin">
        <div class="modal-dialog">
            <div class="modal-content">
                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="display-4">Admin Login</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <form action="admvalidate">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="uname">Username</label>
                        <input type="text" name="admuname" id="uname" class="form-control" placeholder=""
                            aria-describedby="helpId">
                    </div>
                    <div class="form-group">
                        <label for="staffpwd">Password</label>
                        <input type="password" name="admpwd" id="studentpwd" class="form-control" placeholder=""
                            aria-describedby="helpId">
                    </div>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                        <input type="submit" value="Login" class="btn btn-success float-left">
                    <button type="button" class="btn btn-danger " data-dismiss="modal">Close</button>
                </div>
                </form>
            </div>
        </div>
    </div>

</body>

</html>