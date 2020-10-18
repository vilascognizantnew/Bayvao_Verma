
public class Question10 {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 6 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			if (arr[i] % 2 == 0)
				System.out.println(arr[i] + " is even");
			else
				System.out.println(arr[i] + " is odd");
		}
	}
}
