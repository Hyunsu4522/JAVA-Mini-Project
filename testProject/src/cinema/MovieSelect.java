package cinema;

public class MovieSelect {
	int custmovie; //영화선택
	int moviecinema; //영화관
	
	public MovieSelect() {
		
	}
	
//	public MovieSelect(int movie, int moviecinema, char seatrow, int seatnumber) {
//		this.movie = movie;
//		this.moviecinema = moviecinema;
//		this.seatrow = seatrow;
//		this.seatnumber = seatnumber;
//	}
	
	public int Movie(int tMovie) {
		if(tMovie == 1) {
			moviecinema = 1;
			System.out.println("손님이 선택하신 영화는 밀수 입니다.");
			System.out.println(moviecinema + "관으로 가세요.");
		}else if (tMovie == 2){
			moviecinema = 2;
			System.out.println("손님이 선택하신 영화는 콘크리트 유토피아 입니다.");
			System.out.println(moviecinema + "관으로 가세요.");
		}
		else if (tMovie == 3){
			moviecinema = 3;
			System.out.println("손님이 선택하신 영화는 비공식작전 입니다.");
			System.out.println(moviecinema + "관으로 가세요.");
		}
		else if (tMovie == 4){
			moviecinema = 4;
			System.out.println("손님이 선택하신 영화는 엘리멘탈 입니다.");
			System.out.println(moviecinema + "관으로 가세요.");
		}else {
			System.out.println("잘못선택하셨습니다.");
		}return custmovie;
	}
	

	public void MovieSelect() {
		
		}

	}
