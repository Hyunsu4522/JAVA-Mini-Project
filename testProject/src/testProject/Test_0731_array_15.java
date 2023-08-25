package testProject;
import java.util.*;
import java.math.*;

public class Test_0731_array_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		char[] strArray;
		
		System.out.print("문자열 : ");
		str = sc.next();
		
		strArray = new char[str.length()];
		
		int i = 0, j = 0;
		while(i < str.length()) {
			strArray[j] = str.charAt(i);
			//중복검사
			for(int k = 0; k < j; k++) {
				if(strArray[j] == strArray[k]) {
					j--;
					break;
				}
			}
			i++;
			j++;
		}
		
		System.out.print("문자열에 있는 문자 : ");
		for(int h = 0; h < strArray.length; h++) {
			if(h == (strArray.length - 1) || strArray[h + 1] == 0 ) {
				System.out.println(strArray[h]);
				System.out.print("문자 개수 : " + (h + 1));
				break;
			}else {
				System.out.print(strArray[h] + ", ");
			}
			
		}
	}
}

