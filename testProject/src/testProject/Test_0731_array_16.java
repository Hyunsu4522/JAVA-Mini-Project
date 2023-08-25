package testProject;
import java.util.*;
import java.math.*;

public class Test_0731_array_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String[] strArray1, strArray2;
		
		System.out.print("배열의 크기를 입력하세요 :");
		num = sc.nextInt();
		sc.nextLine();
		
		strArray1 = new String[num];
		int i = 0;
		while(true) {
			// 문자열을 입력받는 부분
			for (; i < strArray1.length; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				strArray1[i] = sc.nextLine();
			}
			
			//더 입력할지 안할지 확인부분
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			
			// 더 입력하겠다.
			if ('Y' == sc.next().charAt(0)) {
				System.out.print("더 입력하고 싶은 개수 :");
				num = sc.nextInt();
				sc.nextLine();
				strArray2 = new String[strArray1.length + num];
				
				for (i = 0; i < strArray1.length; i++) {
					strArray2[i] = strArray1[i];
				}
				strArray1 = strArray2;
				// 배열 추가로 크게 생성해주고
				//복제
			} else { // 그만입력하겠다.
				System.out.print("[");
				for (i = 0; i < strArray1.length; i++) {
					if (i == strArray1.length - 1)
						System.out.print(strArray1[i] + "] ");
					else 
						System.out.print(strArray1[i] + ", ");
				}
				break;
			}
		}
		
	}
}

