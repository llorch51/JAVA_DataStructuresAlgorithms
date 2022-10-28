package test;

public class Main {

	public static void main(String[] args) {
		
		Main sod = new Main();
		int result = sod.sumOfDigits(3115);
		System.out.println(result);

	}
	
	public int sumOfDigits(int n) {
		if(n < 0) {
			return 0;
		}
		if(n == 0) {
			return 0;
		}
		
		return n%10 + sumOfDigits(n/10);
	}

}
