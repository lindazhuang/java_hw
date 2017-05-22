package CLASS1;
import java.lang.Object;

public class HelloWord {

/*	public static void main(String[] args) {
		System.out.print("Hi,");
		System.out.print("Linda,");
		System.out.println("HelloWorld,");
		System.out.print("YA!");
		// TODO Auto-generated method stub
	}
*/
	public static void main(String[] args) {  
//		Bc bc = null //還不想要使用到
		Bc bc = new Bc();//習慣類別跟物件名稱相同 //一定要new才可以被使用
		bc.setWeight(100);
		bc.setName("Linda"); //字串""雙引號
		System.out.println(bc.getWeight());
		System.out.println(bc.toString());
	}
}

class Bc {
	  private int weight;//屬性
	  public String name;
//int預設給0，string預設null

	public int getWeight() {//方法method
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) { //void不回傳任何資料
		this.name = name; //this屬性
	}
	
	public String toString(){
	    return "this bc's weight = "+  weight +",name="+name;
//	    return "this bc's name = " + name + ", weight = " + weight;
//toString是來至於java.lang.Object的方法
//如果我們對於這個方法，需要改善還是重寫時，
//我們可以覆寫(改寫)我們想要的結果
	    
	  }
	}