package testProject;
import java.util.*;

public class Test_0728_for_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int nan, in, count = 0;

			System.out.print("난수를 입력하세요 : ");
			nan = sc.nextInt();
			
			while(true) {
				System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
				in = sc.nextInt();
				count++;
				
				if(nan == in) {
					System.out.print("정답입니다 !!");
					System.out.print(count + "회 만에 정답을 맞추셨습니다.");
					break;
				}else if (in < 1 || in > 100) {
					System.out.println("1~100 사이의 숫자를 입력해주세요.");
					count--;
				}else if (nan < in) {
					System.out.println("DOWN");
				}else if (nan > in) {
					System.out.println("UP");
				}
			
			}
			
	}
}