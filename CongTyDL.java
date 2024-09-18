package module03_Bai01;

public class CongTyDL {
	private String maso,hoten,soxe;
	private double doanhthu;
	//constructor
	public CongTyDL() {
		this.maso="";
		this.hoten="";
		this.soxe="";
		this.doanhthu=0;
		
	}
	public CongTyDL(String maso,String hoten, String soxe, double doanhthu) {
		this.maso=maso;
		this.hoten=hoten;
		this.soxe=soxe;
		this.doanhthu=doanhthu;
	}
	//set
	public void setMaSoChuyen(String ms) {
		this.maso=ms;
	}
	public void setHoTen(String ht) {
		this.hoten=ht;
	}
	public void setSoXe(String sx) {
		this.soxe=sx;
	}
	public void setDoanhThu(double dt) {
		this.doanhthu=dt;
	}
	//get
	public String getMaSoChuyen() {
		return maso;
	}
	public String getHoTen() {
		return hoten;
	}
	public String getSoXe() {
		return soxe;
	}
	public double getDoanhThu() {
		return doanhthu;
	}
	//toString
	public String toString() {
		return "Ma so chuyen: "+this.maso +
				", ho ten tai xe: " + this.hoten +
				", so xe: "+this.soxe +
				", doanh thu: "+this.doanhthu;
	}
	

}
