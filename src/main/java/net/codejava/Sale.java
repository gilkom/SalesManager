package net.codejava;

public class Sale {
	private int id;
	private String item;
	private int quantity;
	private float amount;
	
	protected Sale() {
	}
	protected Sale(String item, int quantity, float amount) {
		this.setItem(item);
		this.setQuantity(quantity);
		this.setAmount(amount);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
