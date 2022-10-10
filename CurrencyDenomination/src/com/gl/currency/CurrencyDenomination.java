package com.gl.currency;

import java.util.Scanner;

public class CurrencyDenomination {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the size of currency denomination \n");

		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.print("Enter the currency denominatios values \n");

		for (int i = 0; i < size; i++){
			a[i] = sc.nextInt();
		}

		for (int i = 0; i<size-1; i++){

			for(int j = 0; j < size-1-i; j++){

				if(a[j]<a[j+1]){

					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		System.out.print("Enter the amount you want to pay ");

		int amt = sc.nextInt();

		System.out.println("\nPayment approach in order to give minimun number of notes will be ");

		for(int i = 0; i < size; i++){

			int no = amt/a[i];
			if (no !=0) {
				System.out.println(a[i]+" : "+ (amt/a[i]));
			}
			amt = amt%a[i];

		}

		sc.close();

	}
	

}
