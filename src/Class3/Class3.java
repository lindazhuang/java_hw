
package Class3;


public class Class3 {
	public static void main(String[] args) {
		myIfElseIfElse isD = new myIfElseIfElse();
		System.out.println(3 / 10);
		System.out.println(isD.isDivideBy235(30));
		myFor for1 = new myFor();
		for1.testFor();
		for1.testFor1();
		for1.testFor2();
		MyDoWhile qq = new MyDoWhile();
		qq.testDoWhile2();
		new MyArray().initTwoArray();
		new MyArray().initTwoArraytest();
	}
}

class myIfElseIfElse {
	public boolean isDivideBy2(int num) {
		if ((num % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isDivideBy235(int num) {
		if ((num % 2) == 0 && (num % 3) == 0 && (num % 5) == 0) {
			return true;
		} else {
			return false;
		}
	}
}

class myFor {
	int[] testArray = new int[10];
	int[] testArray1 = new int[10];

	public int[] testFor() {
		// 初始值;TRUE OR FALSE;變數值加或減
		for (int index = 0; index < testArray.length; index++) {
			testArray[index] = index;
			System.out.println("index=" + index + ",testArray =" + testArray[index]);
		}
		return testArray;
	}

	// 1*1=1,1*2=2.....1*9=9
	public int[] testFor1() {
		// 初始值;TRUE OR FALSE;變數值加或減
		int num1 = 1;
		for (int index = 0; index < testArray.length; index++) {
			testArray[index] = index;
			System.out.println(num1 + "*" + testArray[index] + "=" + num1 * testArray[index]);
		}
		return testArray;
	}

	public int[] testFor2() {
		// 初始值;TRUE OR FALSE;變數值加或減
		for (int index = 0; index < testArray.length; index++) {
			testArray[index] = index;
			for (int index1 = 0; index1 < testArray1.length; index1++) {
				testArray1[index1] = index;
				System.out.println(
						testArray[index1] + "*" + testArray[index] + "=" + testArray[index1] * testArray[index]);
			}
			return testArray;
		}
		return testArray1;
	}

	class myWhile {
		public void testWhile() {
			int i = 1;
			while (i < 10) {
				System.out.println("i*" + i + "=" + 1 * i);
				if (i < 9) {
					System.out.println(",");
				}
			}
		}
	}


	public int[] testWhile2() {
		int index = 1;
		while (index < testArray.length) {
			int index1 = 1;
			while (index1 < testArray1.length) {
				System.out.println(
						testArray[index] + "*" + testArray1[index1] + "=" + testArray[index] * testArray1[index1]);
				index1++;
			}
			index++;
		}
		return testArray1;
	}

	
}

class MyDoWhile {
	public void testDoWhile() {
		System.out.println("題目 :　1*1=1 , 1*2=2 ...... 1*9=9");
		int i = 1;
		do {
			System.out.print("1*" + i + "=" + 1 * i);
			if (i < 9) {
				System.out.print(",");
			}
			i++; // => i = i + 1;
		} while (i < 10);
		System.out.println();
	}

	// 練習 : 請用 do while 寫九九乘法表

	public void testDoWhile2() {
		System.out.println("題目 :　1*1=1 , 1*2=2 ...... 1*9=9");

		int j = 1;
		do {
			int i = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				i++; // => i = i + 1;
			} while (i < 10);
			j++;
			System.out.println();
		} while (j < 10);

	}

	// 練習 : 請用 do while 寫九九乘法表

}


class MyArray {
	int[] oneArray;
	int[][] twoArray;

	String[] oneStringArray;
	String[][] twoStringArray;

	public void initOneArray(int size) {
		oneArray = new int[size];
		for (int i = 0; i < size; i++) {
			oneArray[i] = i;
		}
	}

	// 練習1 : 請使用雙層迴圈，把1~9放到二維陣列
    public void initTwoArray(){
    	twoArray = new int [9][9];
    	for (int i = 1; i < twoArray.length+1; i++) {
			for (int j = 1; j < twoArray[i-1].length+1; j++) {
				twoArray[i-1][i-1] = j;
				System.out.print(twoArray[i-1][i-1] + "\t");
			}
			System.out.println();
		}
    }
	// 練習2 : 二維陣列初始完畢，請陣列內的數字
	// 印出九九乘法表
    public void initTwoArraytest(){
    	twoArray = new int [9][9];
    	for (int i = 1; i < twoArray.length+1; i++) {
			for (int j = 1; j < twoArray[i-1].length+1; j++) {
				twoArray[i-1][i-1] = i*j;
				System.out.print(twoArray[i-1][i-1] + "\t");
			}
			System.out.println();
		}
    }
	// 花色
	public void initOneStringArray() {
		oneStringArray = new String[4];
		oneStringArray[0] = "梅花";
		oneStringArray[1] = "方塊";
		oneStringArray[2] = "愛心";
		oneStringArray[3] = "黑桃";
	}

	// 練習3 : 請練習發初始二維陣列，放入52張牌

}