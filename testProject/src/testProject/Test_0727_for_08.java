package testProject;
import java.util.*;

public class Test_0727_for_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("숫자 : ");
		dan = sc.nextInt();
		System.out.println("==== "+ dan+ "단" + " ====");

	
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
}