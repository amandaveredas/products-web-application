<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Chemical Products</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <c:set var="title" value="Registro de produtos"/>
    <c:set var="route" value="/product/include"/>
    <c:set var="method" value="post"/>
    <c:set var="button1" value="Cadastrar"/>

    <c:if test="${not empty product}">
    	<c:set var="title" value="Consulta de produtos"/>
        <c:set var="route" value="/return"/>
        <c:set var="method" value="get"/>
        <c:set var="button1" value="Voltar"/>
    </c:if>

<div class="container">
<h2>${title}</h2>
  <form action="${route}" method="${method}">
    <div class="form-group">
      <label>Nome:</label>
      <input type="text" class="form-control" placeholder="Entre com o nome" name="name" value="${product.name}">
    </div>
    <div class="form-group">
      <label>Fabricante:</label>
      <input type="text" class="form-control" placeholder="Digite o nome do fabricante" name="company" value="${product.company}">
    </div>
    <button type="submit" class="btn btn-default">${button1}</button>
  </form>

</div>

</body>

</html>
