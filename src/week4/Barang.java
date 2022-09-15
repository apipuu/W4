package week4;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	public int getStok() {
		return stok;
	}
	
	public Barang(String kode, String nama, int stk) { 
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public void addStok(int stok) {
		this.stok+=stok;
	}
	
}


