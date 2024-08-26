package b.opaerator;

public class Operator3 {
	/*
	 * 산술연산자 + - * / %
	 * 
	 * * / % > + - 복합 대입연산자 산술연산자와 대입연산자를 결합해서 사용할 수 있다.
	 * 
	 * += /= -= *= %=
	 * 
	 * a = a+3; -> a+=3;
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = (++a) + b;// a= 6, b=10, c=16
		int d = c / a;// d=2
		int e = c % a;// e=4
		int f = e++;// e= 4(5) f=4
		int g = (--b) + (d--);// b=9, d=2(1), g=11
		int h = 2;
		// a=6, b=9, c=16, d=1, e=5, f=4,g=11,h=2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		// a=6(7), b=9, c=15, d=1 e=6, f=4,g=11(10),h=2 i=6+/3*10%8=12
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(i);

	}

}
