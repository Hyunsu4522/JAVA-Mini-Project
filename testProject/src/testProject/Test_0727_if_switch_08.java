package testProject;
import java.util.*;

public class Test_0727_if_switch_08 {
	public static void main(String[] args) {

		int num1, num2;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		operator = sc.next().charAt(0);

		//if
		if(num1 > 0 && num2 > 0) {
			if(operator == '+') {
				System.out.print(num1 + "+" + num2 + "=" + (num1 + num2));
			}else if(operator == '-') {
				System.out.print(num1 + "-" + num2 + "=" + (num1 - num2));
			}else if(operator == '*') {
				System.out.print(num1 + "*" + num2 + "=" + (num1 * num2));
			}else if(operator == '/') {
				System.out.print(num1 + "/" + num2 + "=" + ((double)num1 / num2));
//				System.out.printf("%d %c %d = %.6f \n", num1, operator, num2, ((double)num1 / num2));
			}else if(operator == '%') {
				System.out.print(num1 + "%" + num2 + "=" + (num1 % num2));
			}else {
				System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		
		//switch
		if(num1 > 0 && num2 > 0) {
			switch(operator) {
				case '+':
					System.out.print(num1 + "+" + num2 + "=" + (num1 + num2));
					break;
				case '-':
					System.out.print(num1 + "-" + num2 + "=" + (num1 - num2));
					break;
				case '*':
					System.out.print(num1 + "*" + num2 + "=" + (num1 * num2));
					break;
				case '/':
					System.out.print(num1 + "/" + num2 + "=" + ((double)num1 / num2));
					break;
				case '%':
					System.out.print(num1 + "%" + num2 + "=" + (num1 % num2));
					break;
				default:
					System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}

	} 
}
