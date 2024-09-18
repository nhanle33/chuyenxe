package module03_Bai01;

public class XeNgoaiThanh extends CongTyDL {
	private String noiden;
	private int songaydiduoc;
	public XeNgoaiThanh() {
		super();
		this.noiden="";
		this.songaydiduoc=0;
	}
	public XeNgoaiThanh(String maso,String hoten, String soxe, double doanhthu, String noiden, int songaydi) {
		super( maso, hoten, soxe, doanhthu);
		this.noiden=noiden;
		this.songaydiduoc=songaydi;
	}
	//set
	public void setNoiDen(String nd) {
		this.noiden=nd;
	}
	public void setSoNgay(int sn) {
		this.songaydiduoc=sn;
	}
	//get
	public String getNoiDen() {
		return noiden;
	}
	public int getSoNgay() {
		return songaydiduoc;
	}
	//toString
	public String toString() {
		return "CX Ngoai thanh: "+super.toString()+
				", noi den: "+this.noiden +
				", so ngay di duoc: "+this.songaydiduoc;
	}

}
