<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" language="javascript" src="plugins/jquery-1.3.1.min.js"></script>
<script type="text/javascript" language="javascript" src="plugins/jquery.validate.min.js"></script>
<script type="text/javascript" language="javascript" src="plugins/json2.js"></script>
<script type="text/javascript"> 
$(document).ready(function() {
	$("#formulario").validate();
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Fotos</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href='http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700|Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="static/default.css"/>
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body>
<div id="wrapper">
  <div id="header-wrapper">
		<div id="header" class="container">
			<div id="logo">
				<h1><a href="#">FOTOS</a></h1>
			</div>
			<div id="menu">
				<ul>
					<li class="active"><a href="#" accesskey="1" title="">INICIO</a></li>
					<li><a href="#" accesskey="2" title="">REGISTRO</a></li>
					<li><a href="#" accesskey="3" title="">Busqueda</a></li>
				</ul>
			</div>
		</div>
	</div>
	<form  action="doAlta">
	<div id="page" class="container">
    		<div id="content">
		  <div class="aligncenter">
	  <h2>Registro usuario</h2>
	  <p>&nbsp;</p>
      <ul class="style3">
        <li class="first">
          <h3>Nombre usuario:</h3>
          <label for="txtUsuario"></label>
          <input type="text" name="name" id="txtUsuario" class="required" minlength="2"/>
          </a>
          </p>
        </li>
        <li class="first">
          <h3>Contraseña:</h3>
          <label for="txtUsuario2"></label>
          <input type="text" name="password" id="email" class="required email" minlength="2"/>
          </p>
        </li>
                <li class="first">
          <h3>Repite Contraseña:</h3>
          <label for="txtUsuario2"></label>
          <input type="text" name="password2" id="txtUsuario2" />
          </p>
        </li>
                <li class="first">
          <h3>Email:</h3>
          <label for="txtUsuario2"></label>
          <input type="text" name="mail" id="txtUsuario2" />
          </p>
        </li>
        <li class="first">
          <input class="date" type="submit" name="submit" value="Enviar" />
        </li>
      </ul>
   			  </div>
	  </div>
	</div>
	</form>
</div>
</body>
</html>
