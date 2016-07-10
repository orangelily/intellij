/**
 * Created by orange on 16/7/3.
 */

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 优惠商品信息(条形码+优惠类型)
 */
public class DiscountTest {

    private Map<String,String> mapInDiscount = new HashMap<>();


    //
    @Test
    public void discount_product_when_contains_discount_with_price_lower_100(){
        Product product =new Product("Item001","basketball","个","球类","篮球",89.0);
        Double price = product.getPrice();

    }




    //
    @Test
   public void add_discount_product_into_discountMap(){
        Discount disc =new Discount("Item00001");

        mapInDiscount.put(disc.getBarcode(),disc.getType());

    }

    @Test
    public void remove_discount_product_from_discountMap(){
        Discount disc =new Discount("Item00001");
        mapInDiscount.remove(disc.getBarcode());
    }

    @Test
    public void justify_product_inDiscount_is_contained_inShop(){


    }



}
