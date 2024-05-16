// WAP to find peak element {1} then 1,if {1,4} then 4,if {2,6,9,4,2,8,6} then 2,9,8 and so on.....
// means larger then left and right element if there any.

import java.util.Scanner;

class PeakElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size :");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Elements :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Peak Element :");
		if (size == 1)
			System.out.println(a[size - 1]);
		if (size == 2) {
			if (a[0] > a[1])
				System.out.println(a[0]);
			else
				System.out.println(a[1]);
		}
		if (size > 2) {
			if (a[0] > a[1]) {
				System.out.println(a[0]);
			}
			for (int i = 1; i <= size - 2; i++) {
				if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
					System.out.println(a[i]);
				}
			}
			if (a[size - 1] > a[size - 2]) {
				System.out.println(a[size - 1]);
			}
		}

	}

}