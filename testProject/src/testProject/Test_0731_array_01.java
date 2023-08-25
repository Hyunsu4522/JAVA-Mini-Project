package testProject;
import java.util.*;

public class Test_0731_array_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 1; i <= 10; i++) {
			arr[i - 1] = i;
			System.out.println(i + "");
		}
		
//		int[] arr = new int[10];
//		for(int i = 0; i < 10; i++) {
//			arr[i] = i + 1;
//			System.out.println(arr[i] + "");
//		}
	}
}
