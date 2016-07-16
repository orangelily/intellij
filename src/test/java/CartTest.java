/**
 * Created by orange on 16/7/3.
 */

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 购物车商品信息(条形码+数量)
 */
public class CartTest {
    private Map<String,Integer> mapInCart = new HashMap<String,Integer>();
    private Map<String,Double> map_priceInCart = new HashMap<String,Double>();
//
    @Test
   public void add_product_into_cart_without_count(){
        Cart cart =new Cart();
        cart.setBarcode("Item00001");
        mapInCart.put("Item00001",1);

    }

    @Test
    public void remove_product_from_cart_without_count(){
        Cart cart =new Cart();
        cart.setBarcode("Item00001");
        mapInCart.remove("Item00001");
    }

    @Test
    public void add_product_into_cart_with_count(){
        Cart cart =new Cart();
        cart.setBarcode("Item00001");
        //购物车
        if(mapInCart.containsKey("Item00001")){
            int count = mapInCart.get("Item00001");
            mapInCart.put("Item00001",count++);
        }else {
            mapInCart.put("Item00001",1);
        }

    }

    @Test
    public void remove_product_from_cart_with_count(){
        Cart cart =new Cart();
        cart.setBarcode("Item00001");
        //购物车
        if(mapInCart.containsKey("Item00001")){
            int count = mapInCart.get("Item00001");
            if (count>1)
                 mapInCart.put("Item00001",--count);
            else mapInCart.remove("Item00001");
        }else {
        }
    }
}
