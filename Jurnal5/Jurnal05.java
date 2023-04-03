import java.util.*;

public class Jurnal05{
	public static void main(String[]args){
		
		//NOMOR 2 TUGAS ROBERT.
		
	Scanner printInput = new Scanner(System.in);
	Queue<String> antre = new LinkedList<String>();
	
	System.out.println("]==========To===Do===List===========[");
	System.out.println("");
	System.out.println("");
	
	antre.add("StrukturData");
	antre.add("BasisData");
	antre.add("BahasaInggris");
				
				
	System.out.println(antre);
	System.out.println("");
	System.out.println("");
	
	System.out.println("Untuk menambahkan jadwal ketik 1 ");
	System.out.println("Untuk menghapus jadwal terbaru ketik 2 ");
	System.out.println("Untuk menghapus jadwal pilihan ketik 3 ");
	System.out.println("Untuk menampilkan tugas terbaru ketik 4 ");
	
	int menu = printInput.nextInt();
	
	switch(menu){
		case 1 :
		System.out.println("]=========SILAHKAN===MASUKAN===JADWAL===BARU!==========[");
		antre.add(printInput.next());
		System.out.println("]==========Setelah===Update==========[");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(antre);
		System.out.println("");
		System.out.println("");
		System.out.println("]==========SELAMAT===MENGERJAKAN!==========[");
		break;
		case 2 :
		antre.poll();
		System.out.println("]==========Setelah===Update==========[");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(antre);
		System.out.println("");
		System.out.println("");
		System.out.println("]==========SELAMAT===TUGAS===ANDA===TELAH===BERKURANG==========[");
		break;
		case 3 :
		System.out.println("]==========PILIH===JADWAL===YANG===AKAN===DIHAPUS==========[");
		System.out.println(antre);
		System.out.println("");
		System.out.println("");
		antre.remove(printInput.next());
		System.out.println(antre);
		break;
		case 4 :
		System.out.println("]==========TUGAS===PALING====UTAMA==========[");
		System.out.println("");
		System.out.println(antre.peek());
		break;
	}
	}
}