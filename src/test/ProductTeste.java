/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.IncludeProduct;
import dao.DBConfigure;
import model.Product;

/**
 * @author tiago
 *
 */
public class ProductTeste {
	
	@Test
	public void testIfReturnsTrueWithCorrectNameAndDescripriton() {
		IncludeProduct includeProduct = new IncludeProduct();
		String nameProduct = "Orange";
		String descriptionProduct = "Is a fruit";
		
		boolean aceptedNameAndDescription= false;
		aceptedNameAndDescription = includeProduct.includeProduct(nameProduct, descriptionProduct);
		
		assertEquals(true, aceptedNameAndDescription);
	}
	
	@Test
	public void testIfReturnsFalseWithIncorrectName() {
		IncludeProduct includeProduct = new IncludeProduct();
		String nameProduct = null;
		String descriptionProduct = "Is a fruit";
		
		boolean aceptedNameAndDescription= true;
		try{
			aceptedNameAndDescription = includeProduct.includeProduct(nameProduct, descriptionProduct);
		}
		catch(Exception e){
			aceptedNameAndDescription = false;
		}
		
		
		assertEquals(false, aceptedNameAndDescription);
	}
	
	@Test
	public void testIfReturnsFalseWithIncorrectDescription() {
		IncludeProduct includeProduct = new IncludeProduct();
		String nameProduct = "Orange";
		String descriptionProduct = null;
		
		boolean aceptedNameAndDescription= true;
		try{
			aceptedNameAndDescription = includeProduct.includeProduct(nameProduct, descriptionProduct);
		}
		catch(Exception e){
			aceptedNameAndDescription = false;
		}
		
		
		assertEquals(false, aceptedNameAndDescription);
	}
	
	
	@Test
	public void testIfReturnsFalseWithIncorrectDescriptionAndName() {
		IncludeProduct includeProduct = new IncludeProduct();
		String nameProduct = null;
		String descriptionProduct = null;
		
		boolean aceptedNameAndDescription= true;
		try{
			aceptedNameAndDescription = includeProduct.includeProduct(nameProduct, descriptionProduct);
		}
		catch(Exception e){
			aceptedNameAndDescription = false;
		}
		
		
		assertEquals(false, aceptedNameAndDescription);
	}
	
	@Test
	public void testCorretUrlInTheCorrectDBConfiguraion() {
		
		DBConfigure dbconfigure = new DBConfigure();
		
		String testeDbConfigure = dbconfigure.getUrl();
		String correctDBConfigure = "jdbc:mysql://localhost:3306/SisCot";
				
		assertEquals(correctDBConfigure, testeDbConfigure);
	}

}