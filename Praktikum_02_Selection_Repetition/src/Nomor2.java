import java.util.Scanner;
public class Nomor2 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int n, i;
	boolean angka_prima = true;
	
	System.out.println("Input NPM anda : ");
	n = input.nextInt();
	input.close();
	
	//0 dan 1 bukan angka prime
	if (n == 0 || n == 1) {
		angka_prima = false;
	}else {
		for (i = 2; i <= n / 2; i++) {
		 if (n % i == 0) {
		  angka_prima = false;
		  break;
		 }
	  }
	}
 
	if (angka_prima)
		System.out.println(n + "Termasuk bilangan prima");
	else
		System.out.println(n + "Bukan bilangan prima karena dapat dibagi dengan 2");
	}
}
