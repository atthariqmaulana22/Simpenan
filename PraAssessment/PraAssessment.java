import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PraAssessment {

    static LinkedList<Data> listComic = new LinkedList<>();

    public static void main(String[] args) {
        listComic.add(new Data(15,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new Data(10,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new Data(14,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new Data(5,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new Data(13,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new Data(7,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new Data(8,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new Data(6,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));

        int n = listComic.size();

        //Menampilkan data sebelum di Sortir
        for (int i = 0; i < n; i++) {
            Data data = listComic.get(i);
            System.out.println(data );
        }
        System.out.println("((===========================================================))");

        for(int passedNum = 1; passedNum < n; passedNum++){
            for(int f = 0; f < n - passedNum; f++){
                if (listComic.get(f).jilid > listComic.get(f+1).jilid){
                    Data sementara = listComic.get(f+1);
                    listComic.set(f+1, listComic.get(f));
                    listComic.set(f, sementara);
                }
            }
        }
        //Menampilkan data setelah di Sortir

        for (int i = 0; i < n; i++) {
            Data data = listComic.get(i);
            System.out.println(data );
        }
	}
}