<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String basePath = request.getContextPath(); %>
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
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.useso.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

</head>
<body style="background-color: #E2E2E2;">
    <div class="container">
        <div class="row text-center " style="padding-top:100px;">
            <div class="col-md-12">
                <%--<img src="/assets/img/logo-invoice.png" />--%>
                <h1>在线考试系统</h1>
            </div>
        </div>
         <div class="row ">

                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1">

                            <div class="panel-body">
                                <form:form role="form" action="" method="post" commandName="teacher" name="loginForm" id="loginForm">
                                    <hr />
                                    <h5>请输入正确信息进行登录...</h5>
                                       <br />
                                     <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" class="form-control" placeholder="用户名... " id="tname" name="tname"/>
                                        </div>
                                    <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input type="password" class="form-control"  placeholder="密码..." id="tpwd" name="tpwd"/>
                                        </div>
                                    <div class="form-group">
                                            <label class="checkbox-inline">
                                                <input type="checkbox" id="remember" name="remember" value="1"/> 记住我
                                            </label>
                                            <span class="pull-right">
                                                   <a href="/pages/index.jsp" >忘记密码 ? </a>
                                            </span>
                                        </div>

                                     <%--<a href="<%=basePath%>/admin/login" class="btn btn-primary "> 登录 </a>--%>
                                    <div class="form-group">
                                        <button type="button" class="btn btn-sm btn-success ajax-submit" <%--onclick="toSubmit('/admin/login2')"--%>>登录</button>

                                    </div>
                                    <hr />
                                    <%--Not register ? <a href="/pages/index.jsp" >click here </a> or go to <a href="/pages/index.jsp">Home</a>--%>
                                    </form:form>
                            </div>

                        </div>


        </div>
    </div>

</body>
<!-- JQUERY SCRIPTS -->
<script src="/assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="/assets/js/bootstrap.js"></script>
<script>
    $(document).ready(function() {
        $('.ajax-submit').click(function() {
           <%--/* var tname = document.getElementById("tname").value--%>
            <%--var tpwd = document.getElementById("tpwd").value;--%>
            <%--if(!tname || !tpwd){--%>
                <%--alert(tname);--%>
                <%--alert("请填写完整信息!");--%>
            <%--}else {--%>
                <%--$.ajax({--%>
                    <%--url: "<%=basePath%>/admin/login",--%>
                    <%--type: "post",--%>
                    <%--dataType: "json",--%>
                    <%--data: {tname:$("#tname").val(), tpwd:$("#tpwd").val()},--%>
                    <%--success: function(response) {--%>
<%--//                    if (response.ret == "fail") {--%>
<%--//                        $('#alert-text').html(response.error);--%>
<%--//                        $('#response').fadeIn();--%>
<%--//                    } else if (response.ret == "ok") {--%>
<%--//                        window.location.href = response.url;--%>
<%--//                    }--%>
                        <%--alert(response);--%>
                    <%--}--%>
                <%--});--%>
            <%--}--%>

<%--*/--%>
            //获取用户名  密码
             var tname = document.getElementById("tname").value;
             var tpwd = document.getElementById("tpwd").value;
             if(!tname || !tpwd){
                alert("请填写完整信息！");
                 return false;
             } else {
             //提交表单
                 $("#loginForm").attr("action", "<%=request.getContextPath()%>/admin/login");
                 $("#loginForm").submit();
             }
        });
    });
    function toSubmit(url) {
        var urlStr = "HTTP://localhost:8080" + url;
//				alert("url: "+url);
        console.log("url: " + urlStr);
        //调试js
//                debugger
        $.ajax({
            type: "POST",
            url: urlStr,
//					data: {username:$("#username").val(), content:$("#content").val()},
//					data: {},
            data: {tname:$("#tname").val(), tpwd:$("#tpwd").val()},
            dataType: "json",
            success: function (data) {
//                $('.main-page').empty();   //清空main-page里面的所有内容
                var html = '';
//						$.each(data, function(commentIndex, comment){
//							html += '<div class="comment"><h6>' + comment['username']
//									+ ':</h6><p class="para"' + comment['content']
//									+ '</p></div>';
//						});
                console.log(data);
                var addhtml = JSON.stringify(data);
                alert("data: " + data);
//                document.getElementById('main-page').innerHTML = data;     //可要看好这句话哦
            }, error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert(errorThrown);
            }
        });

    }
</script>
</html>
