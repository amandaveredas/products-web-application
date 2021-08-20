<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Produtos Químicos</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container">
<c:if test="${not empty message}">
    <div class="alert alert-success alert-dismissible">
    			    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    			    <strong>Informação!</strong> ${message}
    </div>
</c:if>

  <h2>Lista de produtos: ${products.size()}</h2>

  <center><b><a href="/product">Incluir um novo produto</a></b><center>

  <c:if test="${not empty products}">
  <form action="/product/orderBy" method="post">
  			  	<div class="input-group">

  					<select name="sortBy" class="form-control">
  						<option value="name">Nome</option>
  						<option value="company">Ano de fundação</option>
  					</select>

  			      <div class="input-group-btn">
  			        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-sort-by-alphabet"></i></button>
  			      </div>
  			    </div>
  		  	</form>
  <table class="table table-striped">
      <thead>
        <tr>
          <th>Id</th>
          <th>Nome</th>
          <th>Empresa</th>
        </tr>
      </thead>
      <tbody>
      <c:forEach var="product" items="${products}" varStatus="id">
        <tr>
          <td>${product.id}</td>
          <td>${product.name}</td>
          <td>${product.company}</td>
          <td><a href="/product/${product.id}/consult">Detalhar</a></td>
          <td><a href="/product/${product.id}/delete">Excluir</a></td>
        </tr>
      </c:forEach>
        </tbody>
    </table>
  </c:if>
  <c:if test="${empty products}">
   <h2>Não existem times cadastrados!</h2>
   </c:if>
</div>

</body>

</html>
