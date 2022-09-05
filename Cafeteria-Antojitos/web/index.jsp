<%-- 
    Document   : index
    Created on : 2/09/2022, 11:26:28 PM
    Author     : izumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <style>
    body {
    height:100vh;
    width:100%;
    margin:0px;
    overflow:hidden;	
    margin: 0%;
	background: linear-gradient(0deg, #ccccc6,  #3f2616 );
  }
  
  #LibrarianPicture {
    width:100%;
    height:100%;
  }
  
  #loginContainer {
    padding:25px;
    background-color:  #624c3c;
    width:450px;
    height:auto;
    margin:auto;
    margin-top:25px;
    margin-bottom:100px;
    -webkit-box-shadow: 0px 5px 35px 0px rgba(0,0,0,0.75);
    -moz-box-shadow: 0px 5px 35px 0px rgba(0,0,0,0.75);
    box-shadow: 0px 5px 35px 0px rgba(0,0,0,0.75);
  }
  
  #loginPicture:hover + #leftEye,#loginPicture:hover + #rightEye {
    fill:white !important;
    transform: translate(5px, 0px);
  }
  
  .testClass {
    width:10px;
    height:10px;
    background-color:blue;
    position:absolute;
    z-index:100000;
  }
  
  #loginPicture {
    position:relative;
    width:250px;
    height:270px;
    background-color:white;
    border:7px solid  #8c7459;
    border-radius:20px;
    margin:auto;
    background-color:grey;
    z-index:200;
  }
  
  #loginPicture svg {
    width:100%;
    position:relative;
    top:-25px;
    z-index:0;
  }
  
  #loginOverlay {
    position:absolute;
    background-color:white;
    border:5px solid rgba(10,250,252,0.35);  width:250px;
    height:250px;
    top:30px;
    margin:auto;
    border-radius:180px;
    z-index:500;
  }
  
  .loginForm {
    color:white;
    margin-top:25px;
    padding-bottom:25px;
  }
  
  .loginForm label {
    width:30%;
    display:table-cell;
  }
  
  .loginForm input {
    width:100%;
    display:block;
    background-color:transparent;
    border:0px solid transparent;
    border-bottom:2px solid  #8c7459;
    font-size:20px;
    color:white;
    text-align:center;
    box-sizing: border-box;
  }
  
  .loginFormContainer {
    width: 100%;
  }
  
  #login {
    -webkit-transition: all 300ms ease-out 0s;
    -moz-transition: all 300ms ease-out 0s;
    -o-transition: all 300ms ease-out 0s;
    transition: all 300ms ease-out 0s;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    width:100%;
    margin-top:25px;
    padding:15px;
    background-color:  #8c7459;
    border:1px solid   #8c7459;
    color:#8c5426;
    cursor:pointer;
    font-size: 18px;
  }
  
  #login:hover {
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    background-color:transparent;
    color: #8c5426;
    border:1px solid  #8c5426;
    font-size: 20px;
  }  

  .imgdiv{
    width: 100%;
    height: 100%;
    border-radius: 20px;
  }
        </style>
        <title>Login</title>
    </head>
    <body>
    <div id="loginContainer">
        <div id="loginPicture">
            <img src="img/Logo.png" alt="" class="imgdiv">
        </div>  
        <div id="loginPictureCover"> </div>
        <form class="loginForm" action="Validar" method="POST">                            
            <div id="loginFormContainer"> 
                <input type="text" name="txtUser" placeholder="username"> 
            </div>
            <br>
            <div class="loginFormContainer">
                <input type="password" name="txtPass" placeholder="password">
            </div>
            <input id="login" type="submit" name="accion" value="Ingresar" clsas="btn btn-primary btn-block">
        </form>   
    </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
