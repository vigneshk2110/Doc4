package Doc4;

public class DigitCount {

	public static void main(String[] args) {
		int num = 10;
		
		digitCount(num);

	}

	private static void digitCount(int num) {
		int count = 0;
		
		if (num == 0) {
			count = 1;
			System.out.println(count);
			return;
		}
		
		while(num>0) {
			count++;
			num = num/10;
		}
		System.out.println(count);
	}

}
