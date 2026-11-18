/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author AGOBOKOE DINGAAN ST10522758
 */
public class Product {
   private String[] productNames;

    private int[][] sales;



    public Product(String[] productNames, int[][] sales)

    {

        this.productNames = productNames;

        this.sales = sales;

    }



    public int GetTotalProductsSold()

    {

        int total = 0;



        for(int row = 0; row < sales.length; row++)

        {

            for(int col = 0; col < sales[row].length; col++)

            {

                total += sales[row][col];

            }

        }



        return total;

    }



    public double GetAverageProductSold()

    {

        int total = GetTotalProductsSold();



        int count = sales.length * sales[0].length;



        return (double) total / count;

    }



    public String GetMostPopularProduct()

    {

        int highestTotal = 0;

        String popularProduct = "";



        for(int row = 0; row < sales.length; row++)

        {

            int productTotal = 0;



            for(int col = 0; col < sales[row].length; col++)

            {

                productTotal += sales[row][col];

            }



            if(productTotal > highestTotal)

            {

                highestTotal = productTotal;

                popularProduct = productNames[row];

            }

        }



        return popularProduct + " (" + highestTotal + ")";

    }


}
