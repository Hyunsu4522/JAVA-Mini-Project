package testProject;
import java.util.*;

public class Test_0727_for_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("숫자 : ");
		dan = sc.nextInt();
		
		
		if(dan < 10) {
			System.out.print("9이하의 숫자만 입력하세요.");
		}
		for (int j = dan; j < 10; j++) {
			
			System.out.println("\n==== "+ j+ "단" + " ====");
			
			for(int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
		}
		
		
	}
}