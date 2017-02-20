package HW3;

public class HW3 {
	public static void main(String[] args) {
		myFor for1 = new myFor();
		System.out.println("---作業3-2:99乘法表--");
		System.out.println("--FOR--");
		for1.testFor2();
		System.out.println("--WHILE--");
		for1.testWhile2();
		System.out.println("---作業3-1:星星---");
		for1.testStar();
		System.out.println("---3-3作業:---潤月");
		System.out.println("潤月如下:");
		for1.testMonth();
	}
}

class myFor {
int[] testArray = new int[10];
int[] testArray1 = new int[10];

//3-2-------------------------------------
public int[] testFor2() {
	// 初始值;TRUE OR FALSE;變數值加或減
	for (int index = 1; index < testArray.length;index++) {
		testArray[index] = index;
		for (int index1 = 1; index1 < testArray1.length; index1++) {
			testArray1[index1] = index1;
			System.out.println(
					testArray[index] + "*" + testArray1[index1] + "=" + testArray[index] * testArray1[index1]);
		}
//		return testArray;
	}
	return testArray1;
}

public int[] testWhile2() {
	int index=1;
	while(index<testArray.length){
		int index1=1;
		while(index1 < testArray1.length){
			System.out.println(
					testArray[index] + "*" + testArray1[index1] + "=" + testArray[index] * testArray1[index1]);
			index1++;
		}
		index++;
	}
	return testArray1;
}

//3-1-----------------------------------
public int[] testStar() {
	for (int index = 0; index < 5;index++) {
		for (int index1 = 1; index1 <= index+1; index1++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	for (int index = 0; index < 4;index++) {
		for (int index1 = 1; index1 <= 4-index; index1++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	return testArray1;
}
//3-3------------------------------------------------------------------
public int[] testMonth() {
	for (int index1 = 1900; index1 <= 2017; index1++) {
		if ((index1%400==0) || (index1%4==0 && index1%100!=0)){
		System.out.println(index1);
	    }
	}
	return testArray1;
}
}


