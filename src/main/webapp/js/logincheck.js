
  //跳转注册页面
  $(register).click(function(){
    window.location.href="./register_step1.html"
  })

  //登录监听事件
  var btnlogin = document.getElementById("btnlogin");
  btnlogin.onclick = submitForm;

  //获取结点
  var hinttel= document.getElementById("hint-tel").getElementsByTagName("p");
  var hintpassword= document.getElementById("hint-password").getElementsByTagName("p");

  function submitForm (){
    var tel = document.getElementById("tel").value;
    var password = document.getElementById("password").value;
    // 如果字符串为空
    if(tel == "" || password == ""){
      if(tel == ""){
        if(hinttel.length==0){
          checkFrom("hint-tel","手机号");
        }else{

        } 
      }
      if(password == ""){
        if(hintpassword.length==0){
          checkFrom("hint-password","密码");
        }else{

        } 
      }
    }else{
      $.post("/TalentPools/Login",{
        username:tel,
        password:password
      },
      function(data,status){
        if(status == "success"){
          console.log(data)
          if(data.result==1){
            //登陆成功跳转页面
            if(data.role==1){
              //超级管理员
              window.location.href="admin.html"

            }else if(data.role==2){
              //操作员
              window.location.href="opertor-main.html?username="+tel
            }else{
              //普通用户
              window.location.href="user-main.html?value="+tel
              // window.location.href="user-main.html?username"+tel
            }
          }else{
            layer.msg("登录失败!");
          }
        }else{
          layer.msg("网络连接失败!");
        }
      });
    }
  }

  // 检查表单
  function checkFrom (str1,str2){
    var hinttel= document.getElementById(str1);
    //创建 p 标签
    var p = document.createElement("p");
    //添加 p 标签
    hinttel.appendChild(p);
    var p1 = hinttel.getElementsByTagName("p");
    p1[0].innerHTML = "请输入"+str2;
    //p标签添加样式(添加属性值)
    p1[0].setAttribute("class","tel");
  }

  //失去焦点判断
  function isCheckDate (){
    var tel = document.getElementById("tel").value;
    var password = document.getElementById("password").value;
    if(tel != ""){
      if(hinttel.length==0){

      }else{
        hinttel[0].parentNode.removeChild(hinttel[0]);
      }
    }else{
      if(hinttel.length==0){
        checkFrom("hint-tel","手机号");
      }else{

      } 
    }
    if(password != ""){
      if(hintpassword.length==0){

      }else{
        hintpassword[0].parentNode.removeChild(hintpassword[0]);
      }
    }else{
      if(hintpassword.length==0){
        checkFrom("hint-password","密码");
      }else{

      } 
    }
  }
