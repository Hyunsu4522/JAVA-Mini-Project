package testProject;
import java.util.*;

public class Test_0727_for_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//숫자하나를 입력받은 수부터 ~ 1까지 순차적으로 출력해라
		int num = 0;
		
		while(num < 1) {// num이 1이상의 숫자가 나올때 까지 반복
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {
				int i = num;
				while(i >= 1) {
					System.out.print(i+ "");
					i--;
				}
			}
		}

	}
}