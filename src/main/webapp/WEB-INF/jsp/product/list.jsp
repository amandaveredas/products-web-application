<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
<div class="container">
  <h2>Lista de produtos: ${products.size()}</h2>
  <center><b><a href="">Incluir um novo time</a></b><center>
  <table class="table table-striped">
      <thead>
        <tr>
          <th>Nome</th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody>
      <c:forEach var="product" items="${products}">
        <tr>
          <td>${product}</td>
          <td><a href="">Detalhar</a></td>
          <td><a href="">Excluir</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>

</html>
