import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	private List<Product> productList = new ArrayList<>();
	int a=0;
	
	public ProductManager() {

	}  
	public ProductManager(List<Product> productList) {
		this.productList = productList;
	}
	public boolean isProduct(Product product){
		int index = productList.indexOf(product);
		return index!=-1;
	}
	public void addItem(Product product){
		productList.add(product);
	}
	public void removeItem(Product product){
		if(isProduct(product)){
			productList.remove(product);			
		}
	}
	public List<Product> getAll(){
		return productList;
	}
	
}
