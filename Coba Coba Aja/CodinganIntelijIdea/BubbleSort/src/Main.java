import java.util.Stack;

public class Main {

    public static void bubbleSort(Stack<Integer> stack) {
        int n = stack.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (stack.get(j) > stack.get(j + 2)){

                    int sementara = stack.get(j);
                    stack.set(j, stack.get(j +1));
                    stack.set(j + 1, sementara);
                }
            }
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(2);

        System.out.println("Sebelum diurutkan: " + stack);

        bubbleSort(stack);

        System.out.println("Setelah diurtukan: " + stack);
    }
}