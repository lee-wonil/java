// 최대값, 최소값찾기
package javaBaekjoon0917;

import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		int arr[] = new int[num];
		arr[0]=sc.nextInt();
		int min = arr[0];
		int max = arr[0];
		for(int i=1;i<num;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) max = arr[i];
			if(arr[i]<min) min = arr[i];
		}
		System.out.println(min+" "+max);
		sc.close();
	}
}
