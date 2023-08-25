package testProject;
import java.util.*;

public class Test_0731_array_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		String str;
//		char[] st;
//		
//		System.out.print("주민등록번호(-포함) : ");
//		str = sc.next();
//		st = new char[str.length()];
//		
//		for(int i = 0; i < st.length; i++) {
//			if(i >= 8) {
//				st[i] = '*';
//				continue;
//			}
//			st[i] = str.charAt(i);
//		}
//		
//		for(int i = 0; i < st.length; i++) {
//			System.out.print(st[i]);
//		}
		

		char[] str = new char[14];
		str = sc.next().toCharArray();
		char[] st;
		
		System.out.print("주민등록번호(-포함) : ");
		str = sc.next().toCharArray();
		st = new char[str.length];
		
		for(int i = 0; i < st.length; i++) {
			if(i >= 8) {
				st[i] = '*';
				continue;
			}
			st[i] = str[i];
		}
		
		for(int i = 0; i < st.length; i++) {
			System.out.print(st[i]);
		}
	}
}

