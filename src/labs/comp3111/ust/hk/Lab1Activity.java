package labs.comp3111.ust.hk;

public class Lab1Activity {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int min, max;
		min = max = arr[0];
		// Write your code here..
		for (int value : arr) {
			sum += value;
			if (value < min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
		}
		System.out.println(String.format("Sum of the numbers is %d", sum));
		System.out.println(String.format("Min = %d; Max = %d", min, max));

	}
}
