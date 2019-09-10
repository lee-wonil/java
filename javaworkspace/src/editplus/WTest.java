package editplus;

import java.util.*;

class WTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n1 = sc.nextInt();
		System.out.print("정수를 입력하시오 : ");
		int n2 = sc.nextInt();
		System.out.print("정수를 입력하시오 : ");
		int n3 = sc.nextInt();
		if(n1>n2){
			if(n2>n3){
				System.out.println("정렬된 숫자"+n1+" "+n2+" "+n3);
			}
			else{
				if(n1>n3){
					System.out.println("정렬된 숫자"+n1+" "+n3+" "+n2);
				}
				else{
					System.out.println("정렬된 숫자"+n3+" "+n1+" "+n2);
				}
			}
		
		}
		else{
			if(n2>n3){
				if(n1>n3){
					System.out.println("정렬된 숫자"+n2+" "+n1+" "+n3);
				}
				else{
					System.out.println("정렬된 숫자"+n2+" "+n3+" "+n1);
				}
			}
			else{
				System.out.println("정렬된 숫자"+n3+" "+n2+" "+n1);
			}
			
		}


	}
}
