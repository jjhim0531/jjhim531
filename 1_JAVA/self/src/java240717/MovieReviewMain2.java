package java240717;

public class MovieReviewMain2 {

	public static void main(String[] args) {
		MovieReview[] movie = new MovieReview[2];

		MovieReview inception = new MovieReview();
		MovieReview aboutTime = new MovieReview();

		inception.title = "인셉션";
		inception.review = "인생은 무한 루프";
		movie[0] = inception;

		aboutTime.title = "인셉션";
		aboutTime.review = "인생은 무한 루프";
		movie[1] = aboutTime;

//				movie[0]= {"인셉션", "인생은 무한 루프"};
//				movie[1]= {"어바웃타임", "인생 시간 영화"};

		for (int i = 0; i < movie.length; i++) {
			System.out.println("영화제목 : " + movie[i].title + ", 리뷰 :" + movie[i].review);

		}
		System.out.println();
		for(MovieReview m : movie) {
			System.out.println("영화제목 : " + m.title + ", 리뷰 :" + m.review);

		}
	}

}
