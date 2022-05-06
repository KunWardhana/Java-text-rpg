import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Player {
	protected String Location, Name;
	protected Map<String, Items> Inventory = new HashMap<String, Items>();
	protected int maxHP, atk, def, currHP, credit;
	protected List<Quest> questlog;
	
	protected void showsInventory() {
		for (Map.Entry<String, Items> elt : Inventory.entrySet()) {
			System.out.println(elt.getKey());
			System.out.println(elt.getValue().getDescription());
		}
	}
}
