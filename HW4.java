package HW4;

import java.io.OutputStream;
import java.util.*; 

public class HW4 {
	public static void main(String[] args) {
		homework4 hw4=new homework4();
		hw4.hw4_1();
		//hw4.hw4_2();
		hw4.hw4_3();
	}
}

class homework4 {
	public void hw4_1(){
	int a[] = {100,10,7,78,87,45,32,11,10};
	Arrays.sort(a);
	for(int i = 0; i < a.length; i++) 
        System.out.print(a[i] + " ");
	}
	
	public void hw4_2(){
		System.out.println();
		System.out.println("請輸入第一個整數 ");
		Scanner scanner = new Scanner(System.in); 
		int a = scanner.nextInt(); 
		System.out.println("請輸入第二個整數 ");
		Scanner scanner1 = new Scanner(System.in); 
		int b = scanner1.nextInt(); 
		System.out.println("請輸入運算子(加減乘除) ");
		Scanner scanner2 = new Scanner(System.in); 
		String c = scanner2.next(); 
		switch (c){
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		}
		
	}
	public void hw4_3(){
		for(int a=2007;a<=2017;a++){
			for(int b=1;b<=12;b++){
				System.out.println();
				System.out.println(a+"年"+b+"月");
				int c=b-1;
				Calendar cal = new GregorianCalendar(a,c,1);
				int day = cal. getActualMaximum(Calendar.DATE);
				int day_of_month=cal.get(Calendar.DAY_OF_MONTH);
				for(day_of_month=1;day_of_month<=day;day_of_month++){
					System.out.print(day_of_month+" ");
				}
			}
		}
	}
}

