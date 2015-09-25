
<nav class="light-blue lighten-1" role="navigation">
	<div class="nav-wrapper container">
		<a id="logo-container" href="/SisCot" class="brand-logo">SisCot</a>
		<ul class="right hide-on-med-and-down">
			<li><a href="/SisCot/ConsultProvider">Fornecedores</a></li>
			<li><a href="/SisCot/ConsultProduct">Produtos</a></li>

			<%
				if (session.getAttribute("usuarioLogado") != null) {
			%>
			<li><a href="/SisCot/UpdateProviderView.jsp"> Ol� <%=session.getAttribute("usuarioLogado")%>
			</a></li>
			<li><a href="/SisCot/Logout">Logout</a></li>
			<%
				} else {
			%>
			<li><a href="/SisCot/login.jsp">Fazer Login</a></li>
			<%
				}
			%>
		</ul>



		<ul id="nav-mobile" class="side-nav">

		</ul>
		<a href="#" data-activates="nav-mobile" class="button-collapse"><i
			class="material-icons">menu</i></a>


	</div>
</nav>
