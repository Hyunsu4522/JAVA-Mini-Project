package testProject;
import java.util.*;

public class Test_0731_array_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len, sum = 0;
		
		
		System.out.print("정수 : ");
		len = sc.nextInt();
		
		int[] arr = new int[len];
		
		
		for(int i = 0; i < len; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt(); //배열요소에 값을 입력받는다.
		}

		for(int i = 0; i < len; i++) {
			sum += arr[i]; //값을 다 더해준다
			System.out.print(arr[i] + " "); //배열의 값을 출력
		}
		
		System.out.print("\n총 합 : " + sum);
	}
}
