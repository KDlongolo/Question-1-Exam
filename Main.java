/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KShongwe
 */
public class Main {
 
public static void main(String[] args) {
 
Product product = new Product();
 
PrintProduct print = new PrintProduct(product);
 
System.out.println("MATTRESS SALES REPORT");
System.out.println("=====================");
 
print.PrintTotalSales();
print.PrintAverageSales();
print.PrintMostPopularProduct();
}
}

