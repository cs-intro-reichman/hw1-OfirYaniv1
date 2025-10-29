// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int num1 = (int) (Math.random() * range);
		int num2 = (int) (Math.random() * range);
		int num3 = (int) (Math.random() * range);
		System.out.println(num1 + " " + num2 + " " + num3);

		int small = Math.min(num1,num2);
		small = Math.min(small,num3);

		int big = Math.max(num1,num2);
		big = Math.max(big,num3);

		int medium = num1 + num2 + num3 - big - small;


		System.out.println(small + " " + medium + " " + big);
	}
}
