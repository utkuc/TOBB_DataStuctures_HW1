package project.utku;

public class Node {
	protected String model;
	protected String marka;
	protected int cikisYili;

	protected Node next;

	public Node(String marka, String model, int cikisYili) {
		this.model = model;
		this.marka = marka;
		this.cikisYili = cikisYili;
	}
	
	public String toString(){
		String s = "";
		s = "[" + "Model: " + getModel() +" Marka: " + getMarka() + " Cikis Yili:" + getCikisYili() + "]," ;
		return s;
	}

	public Node(Object o) {
		next = null;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getCikisYili() {
		return cikisYili;
	}

	public void setCikisYili(int cikisYili) {
		this.cikisYili = cikisYili;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
