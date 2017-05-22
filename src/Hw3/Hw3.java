package Hw3;

public class Hw3 {
	public static void main(String[] args) {
		myFor for1 = new myFor();
		for1.testFor2();
		for1.testWhile2();
		for1.testStar();
	}
}

class myFor {
int[] testArray = new int[10];
int[] testArray1 = new int[10];

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
public int[] testStar() {
	for (int index = 0; index < 6;index++) {
		for (int index1 = 1; index1 < index; index1++) {
			System.out.println("*");
		}
	}
	return testArray1;
}
}


