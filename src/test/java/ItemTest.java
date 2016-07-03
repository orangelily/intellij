/**
 * Created by orange on 16/7/3.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ItemTest {

    @Test
   public void should_return_true_when_there_is_a_discount_for_basketball(){
        Product product =new Product("Item01","basketball","个","球类","篮球",89.0);
//        String[] str = {"Item02"};
//        Discount discount = new Discount(str,"SINGLE_ITEM_BUY_HUNDRED_DISCOUNT_TEN");
        Discount discount = new Discount();
        Boolean isDiscounted = discount.containsCodeInDiscount(product.getBarcode());
        assertFalse(isDiscounted);

    }

    @Test
    public void should_return_true_when_add_barcodes(){
        Discount discount = new Discount();
        discount.addItem("Item01");

        assertTrue(discount.containsCodeInDiscount("Item01"));

    }

//    @Test
////    public void  product_info_read(){
//        String proName = "Item01-10";
//        Process process =new Process(proName);
//
//        int indexOfLine = proName.indexOf("-");
//
//
//        assertTrue(process.contains("Item01"));
//        assertEquals(10,process.get("Item01"));
//    }


}
