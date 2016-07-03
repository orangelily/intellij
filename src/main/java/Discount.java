import java.util.ArrayList;
import java.util.List;

/**
 * Created by orange on 16/7/3.
 */
public class Discount {
//    private String[] barcodes;//优惠商品条形码
    private List<String> barcodes = new ArrayList<String>();
    private String type;//优惠类型

    public Discount() {
    }

//    public String[] getBarcodes() {
//        return barcodes;
//    }
//
//    public void setBarcodes(String[] barcodes) {
//        this.barcodes = barcodes;
//    }

    public List<String> getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(List<String> barcodes) {
        this.barcodes = barcodes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public Discount(String[] barcodes, String type) {
//        this.barcodes = barcodes;
//        this.type = type;
//    }


    public Discount(List<String> barcodes, String type) {
        this.barcodes = barcodes;
        this.type = type;
    }

    public void addItem(String str){
        barcodes.add(str);
    }
    public boolean containsCodeInDiscount(String productcode) {
//        ArrayList<String> arr = this.getBarcodes();
//        for (int i = 0; i <this.getBarcodes().length ; i++) {
//
//        }
        int index = barcodes.indexOf(productcode);
        return index!=-1;
    }
}
