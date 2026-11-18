/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KShongwe
 */
public class PrintProduct {
 
private Product product;
 
public PrintProduct(Product product) {
this.product = product;
}
 
public void PrintTotalSales() {
System.out.println("Total Products Sold: "
+ product.GetTotalProductsSold());
}
 
public void PrintAverageSales() {
System.out.println("Average Products Sold: "
+ product.GetAverageProductSold());
}
 
public void PrintMostPopularProduct() {
System.out.println("Most Popular Product: "
+ product.GetMostPopularProduct());
}
}
