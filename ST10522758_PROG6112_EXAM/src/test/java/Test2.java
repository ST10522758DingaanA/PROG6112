import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class Test2

{

    @Test

    public void GetAverageSales_WithValidData_ReturnsCorrectValue()

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



        double expected = 17.0;



        assertEquals(expected,

                     product.GetAverageProductSold(),

                     0.01);

    }
}