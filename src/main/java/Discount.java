import java.util.ArrayList;
import java.util.List;

/**
 * Created by orange on 16/7/3.
 */
public class Discount {
//    private String[] barcodes;//优惠商品条形码
//    private List<String> barcodes = new ArrayList<String>();
    private String barcode;
    private String type="SINGLE_ITEM_BUY_HUNDRED_DISCOUNT_TEN";//优惠类型

    public Discount() {
    }
    public Discount(String barcode) {
        this.barcode = barcode;
        
    }


//    public String[] getBarcodes() {
//        return barcodes;
//    }
//
//    public void setBarcodes(String[] barcodes) {
//        this.barcodes = barcodes;
//    }

//    public List<String> getBarcodes() {
//        return barcodes;
//    }
//
//    public void setBarcodes(List<String> barcodes) {
//        this.barcodes = barcodes;
//    }

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

//
//    public Discount(List<String> barcodes, String type) {
//        this.barcodes = barcodes;
//        this.type = type;
//    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

}
