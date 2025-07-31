package Commerce;
import java.util.*;

public class Commercecontroller {
	private final List<Commercemodel> commerces;
	private final Commerceview commerceView;
	public Commercecontroller() {
	commerces=new ArrayList<>();
	commerceView=new Commerceview();
	}
	public void addCommerce(Commercemodel student) {
	commerces.add(student);
	}
	public void displayCommerce() {
	commerceView.displayCommerce(commerces);
	}
	public void createcommerce() {
	Commercemodel commerce=commerceView.createcommerce();
	addCommerce(commerce);
	System.out.println("E-commerce list added successfully");
	}
	public void updateCommerce() {
	if (commerces.isEmpty()) {
	System.out.println("No items available to update.");
	return;
	}
	commerceView.updateCommerce(commerces);
	}
}
