package testProject;
import java.util.*;

public class Test_0727_if_switch_06 {
	public static void main(String[] args) {
		
		String grade;
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		grade = sc.next();
		
		//if
		if(grade.equals("관리자")){
			System.out.print("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
		}else if(grade.equals("회원")) {
			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(grade.equals("비회원")) {
			System.out.print("게시글 조회");
		}else {
			System.out.print("잘못 입력하셨습니다.");
		}
		
		//switch
//		switch(grade) {
//			case "관리자" :
//				System.out.print("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
//				break;
//			case "회원" :
//				System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
//				break;
//			case "비회원" :
//				System.out.print("게시글 조회");
//				break;
//			default :
//				System.out.print("잘못 입력하셨습니다.");
//		}
	} 
		
}
