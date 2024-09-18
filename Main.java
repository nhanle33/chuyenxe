package module03_Bai01;

public class Main {

	public static void main(String[] args) {
//		CongTyDL nt1= new XeNoiThanh("1","Trung Kien","111",10000,"123",100);
//		CongTyDL nt2= new XeNgoaiThanh("2", "Son Lang", "456", 15000, "Binh Duong", 5);
//		System.out.println(nt1);
//		System.out.println(nt2);
		
		CongTyDL[] arrCX= new CongTyDL[2];
		arrCX[0]=new XeNoiThanh("1","Trung Kien","111",10000,"123",100);
		arrCX[1]=new XeNgoaiThanh("2", "Son Lang", "456", 15000, "Binh Duong", 5);
		
		for(CongTyDL chuyenxe: arrCX) {
			System.out.println(chuyenxe);
		}
		double doanhthu=0;
		for(CongTyDL chuyenxe: arrCX) {
			doanhthu+=chuyenxe.getDoanhThu();
		}
		System.out.println("Doanh thu cua cac chuyen xe: "+doanhthu);
		

	}

}
