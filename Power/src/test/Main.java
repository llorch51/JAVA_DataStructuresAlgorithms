package test;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		int result = main.power(2, 8);
		System.out.println(result);
		
	}
	
	public int power(int base, int exp) {
		if(exp == 0) {
			return 1;
		}
		return base * power(base, exp-1);
	}

}
