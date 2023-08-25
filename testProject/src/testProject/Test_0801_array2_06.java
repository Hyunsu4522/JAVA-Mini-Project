package testProject;
import java.util.*;
import java.math.*;

public class Test_0801_array2_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] strArr = new String[][] {{"이", "까", "왔","앞", "힘"}, 
			{"차", "자", "습", "으", "냅"}, {"원", "열", "니", "로", "사"}, 
			{"배", "심", "다", "좀", "다"}, {"열", "히", "!", "더", "!! "}};
			
			
			for(int i = 0; i < strArr[i].length; i++) {
				for(int j = 0; j < strArr.length; j++) {
					System.out.print(strArr[i][j] + " ");
				}
				System.out.println();
			}

		
		}
	}
	


