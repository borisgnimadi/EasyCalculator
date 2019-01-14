<%@page import="metier.Calculatrice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>

<title>Projet</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h2>Calculatrice</h2>

				<%
					if (request.getAttribute("result")!=null) {
				%>
				<p>
					<%=request.getAttribute("num1")%> 
					<%=request.getAttribute("signe")%> 
					<%=request.getAttribute("num2")%> = 
					<%=request.getAttribute("result")%>
				</p>
				<%
					}
				%>

				<form action="calculatrice" method="post" class="form-inline">
					<div class="form-group">
						<input type="text" class="form-control" id="num1" name="num1"
							placeholder="nombre 1" /> <select class="form-control"
							id="signe" name="signe" required>
							<option value="">Signe</option>
							<option value="plus">+</option>
							<option value="moins">-</option>
							<option value="fois">*</option>
							<option value="divise">/</option>
						</select> <input type="text" class="form-control" id="num2" name="num2"
							placeholder="nombre 2" />
					</div>

					<button type="submit" class="btn btn-default">Calculer</button>
				</form>

			</div>
		</div>

		<hr>

	</div>

</body>
</html>
