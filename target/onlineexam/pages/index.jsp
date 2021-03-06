﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Online_exam</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="/assets/css/font-awesome.css" rel="stylesheet" />
       <!--CUSTOM BASIC STYLES-->
    <link href="/assets/css/basic.css" rel="stylesheet" />
    <!--CUSTOM MAIN STYLES-->
    <link href="/assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.useso.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body onload="result()">
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">在线考试系统</a>
            </div>

            <div class="header-right">
                <a href="/admin/logout" class="btn btn-danger" title="退出登录"><i class="fa fa-exclamation-circle fa-2x"></i></a>
            </div>
        </nav>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <div class="user-img-div">
                            <img src="/assets/img/user.png" class="img-thumbnail" />

                            <div class="inner-text">
                               <%--帅的不要不要的盲僧--%>
                                ${result.admin_teacher2.tname}
                                   <%--<%= session.getAttribute("admin_teacher")%>--%>
                            <br />
                                <small>最后登录时间 : 200年前 </small>
                            </div>
                        </div>

                    </li>


                    <li>
                        <a class="active-menu" href="/pages/index.jsp"><i class="fa fa-dashboard "></i>主页</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-desktop "></i>学生管理 <span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="/students/student"><i class="fa fa-toggle-on"></i>学生列表</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bell "></i>学生操作</a>
                            </li>
                        </ul>
                    </li>
                     <li>
                        <a href="#"><i class="fa fa-yelp "></i>成绩管理 <span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="#"><i class="fa fa-coffee"></i>成绩查询</a>
                            </li>
                            <li>
                                <a href="#l"><i class="fa fa-flash "></i>成绩操作</a>
                            </li>
                        </ul>
                    </li>
                     <li>
                        <a href="#"><i class="fa fa-bicycle "></i>试卷管理 <span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                           
                             <li>
                                <a href="#"><i class="fa fa-desktop "></i>试卷列表 </a>
                            </li>
                             <li>
                                <a href="#"><i class="fa fa-code "></i>试卷操作</a>
                            </li>
                        </ul>
                    </li>
                </ul>

            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-head-line">主页</h1>
                        <h1 class="page-subhead-line">hello,欢迎使用本在线考试系统... </h1>
                    </div>
                </div>
                <!-- /. ROW  -->
                <div class="row">
                    <div class="col-md-4">
                        <div class="main-box mb-red">
                            <a href="#">
                                <i class="fa fa-bolt fa-5x"></i>
                                <h5>Zero Issues</h5>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="main-box mb-dull">
                            <a href="#">
                                <i class="fa fa-plug fa-5x"></i>
                                <h5>40 Task In Check</h5>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="main-box mb-pink">
                            <a href="#">
                                <i class="fa fa-dollar fa-5x"></i>
                                <h5>200K Pending</h5>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
    <!-- /. WRAPPER  -->

    <div id="footer-sec">
        Copyright &copy; 2016.XJC name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">主页</a>
    </div>
    <!-- /. FOOTER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="/assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="/assets/js/bootstrap.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="/assets/js/jquery.metisMenu.js"></script>
       <!-- CUSTOM SCRIPTS -->
    <script src="/assets/js/custom.js"></script>
        <script>
            /**
             *页面跳转   --   ajax实现
             */
            function toPage(url) {
                var urlStr = "HTTP://localhost:8080" + url;
//				alert("url: "+url);
                console.log("url: " + urlStr);
                //调试js
//                debugger
                $.ajax({
                    type: "GET",
                    url: urlStr,
//					data: {username:$("#username").val(), content:$("#content").val()},
//					data: {},
//                    dataType: "json",
                    success: function (data) {
                        $('.main-page').empty();   //清空main-page里面的所有内容
                        var html = '';
//						$.each(data, function(commentIndex, comment){
//							html += '<div class="comment"><h6>' + comment['username']
//									+ ':</h6><p class="para"' + comment['content']
//									+ '</p></div>';
//						});
                        console.log(data);
                        var addhtml = JSON.stringify(data);
//                        alert("data: " + data);
                        document.getElementById('main-page').innerHTML = data;     //可要看好这句话哦
                    }, error: function (XMLHttpRequest, textStatus, errorThrown) {
                        alert(errorThrown);
                    }
                });

            }

            function result() {
                var result = ${result};
                var code = result.code;
                if(code==2) {
                    alert("用户不存在");

                } else if(code == 3) {
                    alert("密码错误");
                }
            }
        </script>
</body>
</html>
