package week4;

public class Smartphone {
	private String brand;
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	private String model;
	private int harga;

	public Smartphone(String brand, String model, int harga){
		this.brand=brand;
		this.model=model;
		this.harga=harga;
	}
}
