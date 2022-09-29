package Doc4;

public class MagicalString {

	public static void main(String[] args) {
		System.out.println(magicalString(15));

	}

	public static int magicalString(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n <= 3) {
			return 1;
		}
		int[] data = new int[n+2];
		data[0] = 1;
		data[1] = 2;
		data[2] = 2;

		int i = 2, j = 2;
		int count = 1;
		int num = 1;
		while (i < n) {
			for (int k = 0; k < data[j]; k ++) {
				data[++i] = num;
				if (num == 1 && i < n) {
					count ++;
				}
			}
			j ++;
			num = num ^ 3;
		}
		for (int k = 0; k < data.length-2; k++) {
			System.out.print(data[k]);
		}
		System.out.println();
		return count;
	}
}



