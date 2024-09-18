package module03_Bai01;

public class XeNoiThanh extends CongTyDL {
	private String sotuyen;
	private double soKM;
	public XeNoiThanh() {
		super();
	}
	public XeNoiThanh(String maso,String hoten, String soxe, double doanhthu, String sotuyen, double Sokm) {
		super(maso, hoten, soxe, doanhthu);
		this.sotuyen=sotuyen;
		this.soKM=Sokm;
		
	}
	//set
	public void setSoKm(double skm) {
		this.soKM=skm;
		
	}
	//get
	public double getSoKM() {
		return soKM;
	}
	//toString
	public String toString() {
		return "CX noi thanh: "+super.toString()+
				", so tuyen: "+this.sotuyen + 
				", so km di duoc: "+this.soKM;
	}


}
