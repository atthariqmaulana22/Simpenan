import java.util.*;

public class Jurnal04{
	
	
	static LinkedList<Music> listJudul = new LinkedList<>();

    static LinkedList<Iterator> Song = new LinkedList<>();
	
	public static void main(String[] args){
		
		listJudul.add(new Music("Fancy", "Twice"));
		listJudul.add(new Music("What Is Love", "Twice"));
		listJudul.add(new Music("I Fly", "Jihyo"));
		listJudul.add(new Music("I Cant Stop Me", "Twice"));
		listJudul.add(new Music("Case143", "Stray Kidz"));
		
		listJudul.removeLast();
		Scanner printInput = new Scanner(System.in);
        String judul = "";
        judul = printInput.nextLine();
		
		for (int i = 0; i < listJudul.size(); i++) {
            Music Music = listJudul.get(i);
            if (Music.Judul.equals(judul)) {
                listJudul.remove(listJudul.get(i));
            }
            System.out.println(Music);
			
			  Collections.reverse(listJudul);
        
			}
		}
	}
	
