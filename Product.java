/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KShongwe
 */
public class Product implements iProduct {
 
private String[] products = {
"Orthopedic Mattress",
"Memory Foam Mattress",
"Pocket Spring Mattress"
};
 
private int[][] sales = {
{120, 150, 180},
{100, 130, 160},
{140, 170, 200}
};
 
@Override
public int GetTotalProductsSold() {
int total = 0;
 
for (int row = 0; row < sales.length; row++) {
for (int col = 0; col < sales[row].length; col++) {
total += sales[row][col];
}
}
return total;
}
 
@Override
public double GetAverageProductSold() {
return (double) GetTotalProductsSold() / products.length;
}
 
@Override
public String GetMostPopularProduct() {
 
int highestTotal = 0;
String popularProduct = "";
 
for (int row = 0; row < sales.length; row++) {
 
int productTotal = 0;
 
for (int col = 0; col < sales[row].length; col++) {
productTotal += sales[row][col];
}
 
if (productTotal > highestTotal) {
highestTotal = productTotal;
popularProduct = products[row];
}
}
 
return popularProduct;
}
}
