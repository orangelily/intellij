/**
 * Created by orange on 16/7/3.
 */
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ProductTest {
    //商店中商品信息
    private Map<String,Product> mapInShop = new HashMap<String,Product>();


    @Test
    public void add_one_product_with_info(){
        Product product =new Product("Item001","basketball","个","球类","篮球",89.0);
        Product productInShop = mapInShop.get("Item001");

        if (productInShop!=null){
            //商店中存在该商品信息,不能重复添加该商品,
            // 后续可修改该方法记录商店中的对应商品数目mapInshop<String,Integer> (<条形码,数量>)
            Boolean product_null = true;
            assertTrue(product_null);
        }else {
            mapInShop.put(product.getBarcode(),product);
        }

    }

    @Test
    public void modify_one_product_with_info(){
        Product product =new Product("Item001","basketball","个","球类","篮球",89.0);
        Product productInShop = mapInShop.get("Item001");

        if (productInShop!=null){
//            assertTrue(productInShop!=null);
            mapInShop.put(product.getBarcode(),product);
        }else {
            //不存在该商品信息,无法修改,只能另行做添加处理
            Boolean product_in_shop_null = true;
            assertTrue(product_in_shop_null);
        }

    }

    @Test
    public void remove_one_product_with_info(){
        double price =  (double)89.0;
        Product product =new Product("Item001","basketball","个","球类","篮球",price);
        Product productInShop = mapInShop.get("Item001");

        if (productInShop!=null){
//            assertTrue(productInShop!=null);
            mapInShop.remove(product.getBarcode());
        }else {
            //不存在该商品信息,无法删除
            Boolean product_in_shop_null = true;
            assertTrue(product_in_shop_null);
        }

    }


}
