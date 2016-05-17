<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>chinaz</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="/assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- FONTAWESOME STYLES-->
    <link href="/assets/css/font-awesome.css" rel="stylesheet"/>
    <!--CUSTOM BASIC STYLES-->
    <link href="/assets/css/basic.css" rel="stylesheet"/>
    <!--CUSTOM MAIN STYLES-->
    <link href="/assets/css/custom.css" rel="stylesheet"/>
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.useso.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
</head>
<body>
<div id="wrapper">
    <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/pages/index.jsp">在线考试系统</a>
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
                            帅的不要不要的盲僧
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
                    <h1 class="page-head-line">学生详细信息</h1>
                    <h1 class="page-subhead-line">下面是当前指定学生的学生信息，您可以进行查看操作. </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row">
                <div class="col-md-12">
                    <div class="alert alert-info">
                        <a href="/students/student" type="button" class="btn btn-primary btn-sm">返回上级</a><hr/>
                        <table class="table table-bordered table-striped">
                            <tr>
                                <th>ID</th>
                                <td>${student.id}</td>
                            </tr>
                            <tr>
                                <th>sname</th>
                                <td>${student.sname}</td>
                            </tr>
                            <tr>
                                <th>snumber</th>
                                <td>${student.snumber}</td>
                            </tr>
                            <tr>
                                <th>spwd</th>
                                <td>${student.spwd}</td>
                            </tr>
                            <tr>
                                <th>smail</th>
                                <td>${student.smail}</td>
                            </tr>
                            <tr>
                                <th>stel</th>
                                <td>${student.stel}</td>
                            </tr>
                            <tr>
                                <th>saddress</th>
                                <td>${student.saddress}</td>
                            </tr>
                        </table>
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


</body>
</html>
