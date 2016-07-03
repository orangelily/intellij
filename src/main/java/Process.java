import java.util.Map;

/**
 * Created by orange on 16/7/3.
 * 保存购买的商品信息
 */
public class Process {
//    private String barcode;
//    private Integer productNum;
    private Map<String,Integer> productMap;


    public Map<String, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<String, Integer> productMap) {
        this.productMap = productMap;
    }

    public boolean containedInMap(String barcode){
       Integer items = productMap.get(barcode);

        return true;
    }
}
