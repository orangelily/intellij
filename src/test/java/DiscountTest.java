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
    public void print_product_when_contains_discount_with_price_lower_100(){
        Product product =new Product("Item001","basketball","个","球类","篮球",79.0);
        Double price = product.getPrice();
        System.out.println("名称:"+product.getName()+" 数量:1,单价:"+product.getPrice()+",小计:"+product.getPrice());
    }

    @Test
    public void print_product_when_contains_discount_with_price_higher_100(){
        Product product =new Product("Item001","basketball","个","球类","篮球",189.0);
        Double price = product.getPrice();
        if (price.compareTo(100.0)>0){
            product.setPrice(price-100);
        }
        System.out.println("名称:"+product.getName()+" 数量:1,单价:"+product.getPrice()+",小计:"+product.getPrice());
    }

    @Test
    public void print_product_when_no_discount_with_price(){
        Product product =new Product("Item001","basketball","个","球类","篮球",289.0);
        Double price = product.getPrice();

        System.out.println("名称:"+product.getName()+" 数量:1,单价:"+product.getPrice()+",小计:"+product.getPrice());
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
