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
        System.out.println(catOne.name.equals(catTwo.name)); //equals�O�P�ɧP�O���O�򤺮e�A�Y���@�Ӥ��@�P��false
        System.out.println(catOne.name==catTwo.name);
        //name�p�G���e�@�ˬO�s�b�P�@�Ӧ�m�A�����󥻨��O�s�b���P��m
        catTwo = catOne;//�������m�@�ˡA�P�ɤ]�|��쪫�󥻨������e
        System.out.println(catOne.equals(catTwo)); //equals�O�P�ɧP�O���O�򤺮e�A�Y���@�Ӥ��@�P��false
        System.out.println(catOne==catTwo);
        catTwo.name = "QQ";
        System.out.println(catOne.name);
    }
	// �򥻸�ƫ��A primitive data type
	
}

class BasicType {
	// �����
	int iAmInt;
	// �B�I��
	float iAmFloat;
	// ������ׯB�I��
	double iAmDouble;
	// ���L��
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

// �ϰ�P�����ܼ�
class GlobalAndLocal {
	int a = 5; // ����
    
	
	public int b() {
		int b = 10; // �ϰ�//�u��b�o�Ӱ϶���
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
	// �@���}�C
	int[] oneArray;
	// �G���}�C
	int[][] twoArray;
}
