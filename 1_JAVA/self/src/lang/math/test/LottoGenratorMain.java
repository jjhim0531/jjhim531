package lang.math.test;

public class LottoGenratorMain {

	public static void main(String[] args) {
		LottoGenerator generator = new LottoGenerator();
		int[] lottoNumbers = generator.generate();

		System.out.print("로또번호 : ");

		for (int lottoNumber : lottoNumbers) {
			System.out.print(lottoNumber + " ");
		}

	}

}
