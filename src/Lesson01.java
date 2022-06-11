import java.util.Scanner;

public class Lesson01 {
	public static void main(String[] args) {
		Scanner lp = new Scanner(System.in);
		while(true) {
		int number = lp.nextInt() ;
		if(hamKiemTra(number) == true){
			System.out.println(number + " is number 5");
		} else {
			System.out.println(number + " is not number 5");
		}
			
		}
		
	}
	
	public static boolean hamKiemTra(int aNumber) {
		if(aNumber == 5) {
			return true;
		} else {
			return false;
		}
		
	}
}
