
public class Latihan2 {
	public static void main(String[] args) {
		int c, k;
		float r;
		
		c = 90;
		
		k = (c + 273);
		
		CelciusToFahrenheit();
		r = CelciusToRheamur();
		k = CelciusToKelvin(c);
		System.out.println("r = " + r);
		System.out.println("k = " + k);
		
	}
	
	static void CelciusToFahrenheit() {
		int c = 90;
		int f = (9/5 * c) + 32;
		System.out.println("c = " + c);
		System.out.println("f = " + f);
	}
	
	static float CelciusToRheamur() {
		int c = 90;
		int r = (5/4 * c);
		return r;
	}
	
	static int CelciusToKelvin(int c) {
		int k = (c+ 273);
		return k;
		
	}
}
