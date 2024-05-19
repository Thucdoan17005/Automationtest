package day7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class tinhtongmang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào số phần tử trong mảng: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] arr = new double[n];
		DecimalFormat format = new DecimalFormat("0.#");

		float total = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Nhập vào giá trị cho phần tử thứ " + (i + 1) + ": ");
			arr[i] = scanner.nextDouble();
		}

		for (int i = 0; i < arr.length; i++) {
			total = (float) (total + arr[i]);
		}
		System.out.println(format.format(total));

	}

}
