package Hw4;

import java.util.*;
//import Class4.MyOtherIfElse;


public class Hw4 {
	public static void main(String[] args){
		//new MySwapNum().initNumberArray();
		//new MySwapNum().initNumberArray1();
		new MySwapNum().initNumberArray2();
	}
}


class MySwapNum{
	int[] NumberArray;

	public void initNumberArray() {
		int NumberArray[]={100,10,7,78,87,45,32,11,10};
		Arrays.sort(NumberArray);
		for(int i=0;i<NumberArray.length;i++){
			System.out.println(NumberArray[i]);
		}
	}
	
	public void initNumberArray1() {
		System.out.println("請輸入第一個數字");
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();		
		System.out.println("請輸入第二個數字");
		Scanner scanner1=new Scanner(System.in);
		int b = scanner1.nextInt();//hasnextInt()判斷是不是int
		System.out.println("請輸入運算子");
		Scanner scanner2=new Scanner(System.in);
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
		//scanner.close;
	}
	public void initNumberArray2() {
		for (int a=2007;a<=2017;a++){
		for (int b=1;b<=12;b++){
			System.out.println(a+"年"+b+"月");
		Calendar cal=new GregorianCalendar(a,b-1,1);
		int day=cal.getActualMaximum(Calendar.DATE);
		int day_of_month=cal.get(Calendar.DAY_OF_MONTH);
		for (day_of_month=1;day_of_month<=day;day_of_month++){
			System.out.print(day_of_month+" ");
		}
		System.out.println();
		}
		
		}
	}
}

