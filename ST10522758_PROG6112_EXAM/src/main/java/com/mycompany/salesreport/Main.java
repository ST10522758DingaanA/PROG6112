/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

import java.util.Scanner;

/**
 *
 * @author AGOBOKOE DINGAAN ST10522758
 */
public class Main {
       public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
      
      int[][] sales = new int [3][3];
      for (int product = 0; product < products.length; product++){
        for (int month = 0; month<3; month++){
              System.out.print("Enter sale per Month" +(month + 1) + "for" + products[product] + ":");
              sales[product][month] = input.nextInt();
        }
        System.out.println();
           }
      Product productObj = new Product(products, sales );
      PrintProduct printer = new PrintProduct();
      
      System.out.println("\nPRODUCT SALES REPORT - 2026");
      System.out.println("(*****************************");
      
      
     printer.PrintTotalSales(productObj);
     printer.PrintAverageSales(productObj);
     printer.PrintMostPopular(productObj);
     
    }
}
 

