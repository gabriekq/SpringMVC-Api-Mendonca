<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Send your Threshold Pic Here !!! </title>
</head>
<body>

<h1>Under constrotion</h1>
<br/>

<form:form method="post" action="/Projeto-SpringMVC/savefile" enctype="multipart/form-data" >


<p>teste de arquivo</p>


<div>
<label for="summary">Send your picture</label>
<input type="file" name="summary"/>
<form:errors path="summaryPath"/>
</div>


<div>
<input  type="submit" value="Enviar" >
</div>


</form:form>




</body>
</html>