package mukemmelSayi;

public class Main {

	public static void main(String[] args) {

		// 6 ===> 1,2,3
		// 28 ===> 1,2,4,7,14
		// tam b�len say�lar�n toplam� kendisine e�itse m�kemmel say�d�r

		int number = 5;
		int total = 0;
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println(number + ": M�kemmel say�d�r.");
		} else {
			System.out.println(number + ": M�kemmel say� de�ildir.");
		}

	}

}