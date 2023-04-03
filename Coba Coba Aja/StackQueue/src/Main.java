import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner printInput = new Scanner(System.in);
        Queue<String> antri = new LinkedList<>();

        //Masukan Element Di Queue!
        antri.add("Ahmad");
        antri.add("Raffi");
        antri.add("Fikri");

        System.out.println("Antrean: " + antri);

        System.out.println("Ketik 1 untuk menghapus antrean terpilih n/" + "Ketik 2 untuk melihat antrian terdepan n/" + "Ketik 3 untuk menambahkan antrian n/" + "Ketik 4 untuk Menghapus Antrean" );

        int antrean = printInput.nextInt();
        switch (antrean){
            case 1 :  //Hapus Element bisa pake String XD
                System.out.println("HAPUS ANTREAN AWAL");

                antri.remove(printInput.next());
                System.out.println("Antrean yang dihapus: " + antri.remove());

                //Queue terbaru.
                System.out.println("Antrean terbaru: " + antri);
                break;

            case 2 : //Mengintip / memeriksa antrean terdepan.
                String monitor = antri.peek();
                System.out.println("Antrean yang paling depan: " + monitor);


                //Queue terbaru.
                System.out.println("Antrean terbaru: " + antri);
                break;

            case 3 :    //Menambahkan Element
              antri.add(printInput.next());

                //Queue terbaru.
                System.out.println("Antrean terbaru: " + antri);
                break;
            case 4 :    //Menghapus Element

                String hapus = antri.poll();
                System.out.println("Antrean yang dihapus: " + hapus);
                //Queue terbaru.
                System.out.println("Antrean terbaru: " + antri);
                break;

            default : //Input tidak sesuai.
                System.out.println("Input tidak sesuai");
                break;
        }
    }
}

public class MyStack {
    private int top;
    private int[] stackArray;
    private int maxSize;

    // constructor
    public MyStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // push an element to the top of the stack
    public void push(int element) {
        if(isFull()) {
            System.out.println("Stack is full.");
            return;
        }
        top++;
        stackArray[top] = element;
        System.out.println(element + " is pushed to the stack.");
    }

    // pop an element from the top of the stack
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int temp = stackArray[top];
        top--;
        System.out.println(temp + " is popped from the stack.");
        return temp;
    }

    // check if the stack is full
    public boolean isFull() {
        return (top == maxSize-1);
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // peek the top element of the stack
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }
}
