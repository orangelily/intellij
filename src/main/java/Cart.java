/**
 * Created by orange on 16/7/3.
 */
public class Cart {
    //条形码，数量
    private String barcode;

    private Integer count;

    public Cart() {
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
