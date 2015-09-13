package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import dao.ProductDAO;

@WebServlet("/ConsultProduct")
public class ConsultProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ConsultProduct() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
		ArrayList<Product> productList = new ArrayList<Product>();
		ProductDAO productdao = new ProductDAO();
		
		productList = productdao.listProducts();
		
		request.setAttribute("products", productList);
		
		System.out.println("AQUUUI " + productList.get(0).getProductName());
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/ConsultProductList.jsp");
        rd.forward(request,response);
	}
}
