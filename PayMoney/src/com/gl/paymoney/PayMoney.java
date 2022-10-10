package com.gl.paymoney;

import java.util.Scanner;

public class PayMoney {

	
		
		public void checkTarget(int targetValue,int size,int a[]){
			
			int sum = 0;
			for(int i = 0;i<size;i++) {
				sum = sum+a[i];
				if(sum>=targetValue) {
					System.out.println("Target achieved after "+(i+1)+" transactions");
				}
				else {
					System.out.println(" Target not achieved");
					break;
				}
			}
		}

		
		public static void main(String[] args) {
			
			PayMoney payMoney = new PayMoney();
			Scanner sc = new Scanner(System.in);
			boolean condition = true;
			
			while(condition) {
	
				System.out.println("Enter the size of transaction array");
				int size = sc.nextInt();
				int[] a = new int[size];

				System.out.println("Enter the values of array");

				for (int i = 0; i < size; i++) {
					a[i] = sc.nextInt();
				}

				System.out.println("Enter the total no of targets that needs to be achieved");
				int target = sc.nextInt();

				for (int i = 0; i < target; i++) {
					System.out.println("enter the value of target " +(i+1));
					int targetValue = sc.nextInt();
					payMoney.checkTarget(targetValue,size,a);
					}
				
				System.out.print("Press 1 to continue or press 0 to exit: ");

				int choice = sc.nextInt();
				switch(choice) {

				case 0:
					System.out.println("Thank You");
					condition = false;
					break;
				case 1:
					condition = true;
					break;
				}
			}
				
				sc.close();
			}

		}


