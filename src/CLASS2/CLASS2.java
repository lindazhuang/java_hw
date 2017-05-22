package CLASS2;

import javax.print.attribute.standard.PrinterLocation;

public class CLASS2 {
    public static void main(String[] args) {
    	BasicType basicType = new BasicType();
    	System.out.println(" 1 + 1 ="+ basicType.b1());
		System.out.println(" 1 - 1 ="+ basicType.b2());
		System.out.println(" 1 / 1 ="+ basicType.b3());
		System.out.println(" 1 * 10 ="+ basicType.b4());
		System.out.println(" (1 + 1) / 1 ="+ basicType.b5());
//		System.out.println(" 10 * 1) / 0 ="+ basicType.b6());
		System.out.println(" int == float , 1 == 1 ="+ basicType.b7());
		System.out.println(" float == double , 1 == 1"+ basicType.b8());
		System.out.println(" int == double , 1 == 1.0 ="+ basicType.b9());
	
        Cat catOne = new Cat();
        catOne.name = "Tom";
        Cat catTwo = new Cat();
        catTwo.name = "Tom";
        System.out.println(catOne.name.equals(catTwo.name)); //equals是同時判別型別跟內容，若有一個不一致為false
        System.out.println(catOne.name==catTwo.name);
        //name如果內容一樣是存在同一個位置，但物件本身是存在不同位置
        catTwo = catOne;//讓物件位置一樣，同時也會改到物件本身的內容
        System.out.println(catOne.equals(catTwo)); //equals是同時判別型別跟內容，若有一個不一致為false
        System.out.println(catOne==catTwo);
        catTwo.name = "QQ";
        System.out.println(catOne.name);
    }
	// 基本資料型態 primitive data type
	
}

class BasicType {
	// 正整數
	int iAmInt;
	// 浮點數
	float iAmFloat;
	// 雙倍精度浮點數
	double iAmDouble;
	// 布林值
	boolean iAmBool;

	/** 1 + 1 */
	public int b1() {
		iAmInt = 1;
		return iAmInt + 1;
	}

	/** 1 - 1 */
    public int b2(){
    	iAmInt = 1;
    	return iAmInt - 1;
    }
	/** 1 / 1 */
    public int b3(){
    	iAmInt = 1;
    	return iAmInt / 1;
    }
	/** 1 * 10 */
    public int b4(){
    	iAmInt = 1;
    	return iAmInt * 10;
    }

	/** ( 1 + 1 ) / 1 */
    public int b5(){
    	iAmInt = 1;
    	return (iAmInt + 1) / 1;
    }
    
    
	/** 10 * 1 / 0 */
    public int b6(){
    	iAmInt = 10;
    	return iAmInt * 1 / 0;
    }
	/** int == float , 1 == 1 */
    public boolean b7(){
    	iAmInt = 1;
    	iAmFloat = 1;
    	return iAmInt == iAmFloat;
    }
	/** float == double , 1 == 1 */
    public boolean b8(){
    	iAmFloat = 1;
    	iAmDouble = 1;
    	return iAmDouble == iAmFloat;
    }
	/** int == double , 1 == 1.0 */
    public boolean b9(){
    	iAmInt = 1;
    	iAmDouble = 1;
    	return iAmDouble == iAmInt;
    }
}

// name => equals
// object => equals
// name => ==
// object => ==
class Cat {
	public String name;
}

// 區域與全域變數
class GlobalAndLocal {
	int a = 5; // 全域
    
	
	public int b() {
		int b = 10; // 區域//只能在這個區塊用
		return b;
	}
}

class myString{//FALSE 
	public boolean equalsString(){
		return new String("Tom") == new String("Tom");
	}
}

//public boolean equal
//return new String("Tom").equals(new String("Tom"));

class TheArray {
	// 一維陣列
	int[] oneArray;
	// 二維陣列
	int[][] twoArray;
}
