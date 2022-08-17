package bolum01;

public class Soru13 {

	public static void main(String[] args) {

		double x = (((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));
		double y = (((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));
		double soru = ((3.4 * x) + (50.2 * y));
		double soru1 = ((2.1 * x) + (0.55 * y));

		System.out.println("X degeri  : " + x);
		System.out.println("Y degeri  : " + y);

	}

}
