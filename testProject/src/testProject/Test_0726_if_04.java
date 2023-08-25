package testProject;
import java.util.*;

public class Test_0726_if_04 {
	public static void main(String[] args) {

		int man, number;
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수:");
		man = sc.nextInt();	
		System.out.print("사탕 개수:");
		number = sc.nextInt();
		
		System.out.println("\n1인당 사탕 개수 : " + (100 / 29));
		System.out.print("사탕 개수 : " + (100 % 29));
	} 
}
