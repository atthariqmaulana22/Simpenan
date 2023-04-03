import java.util.LinkedList;
import java.util.Scanner;

public class Jurnal03 {
	public static void main(String[] args){
		Scanner printInput = new Scanner(System.in);

		Arloji2<DataPegawai> listArloji2 = new Arloji2<>();
	
		
		int choose;
		do{
			System.out.println("1. Input Data\n" + "2. Hapus Data\n" + "3. Cetak List Pegawai" + "4. Keluar");
			choose = printInput.nextInt();
		
		switch(choose){
			case 1 :
				System.out.println("Masukan Data");
				System.out.println("Tuliskan NIP, Nama, dan Divisi");
				listArloji2.tambahDepan(new DataPegawai(printInput.next(), printInput.next(), printInput.next()));
				break;
			case 2 :
				System.out.println("Masukan Data Yang Ingin Dihapus");
				listArloji2.hapusBelakang();
				break;
			case 3 :
				System.out.println("List Pegawai:");
				listArloji2.Traverse();
				break;
			case 4 :
				System.out.println("Thank You, Have a nice day");
				System.exit(0);
				break;
		}
		}while(true);
	}
}