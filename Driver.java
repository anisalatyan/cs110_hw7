import animals.Puppy;
import utils.Math;
import utils.ArrayUtils;
public class Driver {
	public static void main(String[] args) {
		Puppy p1 = new Puppy("Joey");
		System.out.println(p1.getName());
		Puppy p2 = new Puppy("Chandler");
		System.out.println(p2.getName());
		Puppy p3 = new Puppy("Ross");
		System.out.println(p3.getName());

		int[] arr = {9, 20, 3, 44, 88, 300};
		ArrayUtils.reverse(arr);
		System.out.println(ArrayUtils.stringifyArray(arr));
		double num = 15.4;
		System.out.println(Math.factorial((int) num));
	}
}