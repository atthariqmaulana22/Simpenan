import java.util.Scanner;
import java.util.Stack;

public class Jurnal05IP{
	public static void main(String[]args){
		
		Scanner printInput = new Scanner(System.in);
		Stack<Character> tumpukan = new Stack<>();
		StringBuilder Hasil = new StringBuilder();
		
		String input = printInput.next();
		
		for (int i = 0; i < input.length(); ++i) {
            char character = input.charAt(i);
			
			
			//KARAKTER(LETTER/DIGIT)PRIORITAS UTAMA
			
			if (Character.isLetterOrDigit(character)) {
				Hasil.append(character);
				
			}else if(character == '('){
				tumpukan.push(character); 	//SELURUH ABJAD DALAM KURUNG MERUPAKAN PRIORITY
				
			}else if(character == ')'){									
				while(!tumpukan.isEmpty() && tumpukan.peek() != '('){
					Hasil.append(tumpukan.peek());
					tumpukan.pop();
				}
				tumpukan.pop();
				
				
			//MENGOPERASIKAN PRIORITAS DARI OPERATOR
				
			}else{
				while(!tumpukan.isEmpty() && setPriority(character) <= setPriority(tumpukan.peek())){	
					Hasil.append(tumpukan.peek());
					tumpukan.pop();
				}
				tumpukan.push(character);
			}
		}
		
		//MENCETAK OUTPUT BERDASARKAN PRIORITY
		
		while(!tumpukan.isEmpty()){	
			if(tumpukan.peek() == '('){
				System.out.println("Kosong");
				return;
			}
			Hasil.append(tumpukan.peek());
			tumpukan.pop();
		}
		System.out.println(Hasil);
	}
	
	
	//TENTUKAN PRIORITAS DARI OPERATOR
	
	private static int setPriority(char priority){
		switch(priority){
			case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
		}
		return -1;
	}
}

