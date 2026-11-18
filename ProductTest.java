/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KShongwe
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
public class ProductTest {
 
*@Test
public void GetTotalProd*ctSales_WithValidData_ReturnsCorre*tValue() {
 
Product produc* = new Product();
 
int exp*cted = 1350;
 
assertEquals*expected,
product.*etTotalProductsSold());
}
 
*@Test
public void GetAverageSa*es_WithValidData_ReturnsCorrectVal*e() {
 
Product product = n*w Product();
 
double expec*ed = 450.0;
 
assertEquals(*xpected,
product.G*tAverageProductSold());
}
 
*@Test
public void GetMostPopul*rProduct_WithValidData_ReturnsCorr*ctValue() {
 
Product produ*t = new Product();
 
String*expected = "Pocket Spring Mattress*;
 
assertEquals(expected,
* product.GetMostPopu*arProduct());
}
}
