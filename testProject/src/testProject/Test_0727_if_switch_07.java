package testProject;
import java.util.*;

public class Test_0727_if_switch_07 {
	public static void main(String[] args) {

		double height, weight, bmi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키 (m)를 입력해 주세요 : ");
		height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		bmi = (weight / (height*height));
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.print("저체중");
		}else if (23 > bmi && bmi >= 18.5) {
			System.out.print("정상체중");
		}else if (25 > bmi && bmi >= 23) {
			System.out.print("과체중");
		}else if (30 > bmi && bmi >= 25) {
			System.out.print("과체중");
		}else {
			System.out.print("고도 비만");
		}

	} 
}
