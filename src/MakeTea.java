import javax.swing.JOptionPane;

public class MakeTea {
	/* Figure out how to make a cup of tea using the classes below */
	public static void main(String[] args) {
		String flavor1 = JOptionPane.showInputDialog("What kind of tea would you like?");
		TeaBag tea = new TeaBag(flavor1);
		System.out.println("The flavor is " + tea.getFlavor());
		Kettle k1 = new Kettle();
		k1.boil();
		Cup cup1 = new Cup();
		cup1.makeTea(tea, k1.getWater());
	}
}
class TeaBag {
	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";
	private String flavor;
	TeaBag(String flavor) {
		this.flavor = flavor;
	}
	String getFlavor() {
		return flavor;
	}
}
class Kettle {
	
	private Water water = new Water();
	Water getWater() {
		return water;
	}
	void boil() {
		this.water.setIsHot(true);
	}
}

class Water {
	private boolean isHot = false;
	public boolean isHot() {
		return this.isHot;
	}
	public void setIsHot(boolean isHot) {
		this.isHot = true;
	}
}

class Cup {
	private TeaBag teabag;
	void makeTea(TeaBag teabag, Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}
}

