import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class TEST1

{

    @Test

    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue()

    {

        String[] products =

        {

            "Cozy Nights Monarch",

            "Restonic Barbados",

            "Sealy Phuket"

        };



        int[][] sales =

        {

            {25,18,20},

            {15,10,12},

            {18,15,20}

        };



        Product product = new Product(products, sales);



        assertEquals(153, product.GetTotalProductsSold());

    }

}

