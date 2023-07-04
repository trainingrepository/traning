package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=9;
		int c=0;
		for (int i = 1; i <=a; i++) {
			if(a%i==0) {
				c++;
			}
		}
		if(c>2) {
			System.out.println(a + " is not a prime number");
		}
		else {
			System.out.println(a + " is a prime number");
		}
	}

}
