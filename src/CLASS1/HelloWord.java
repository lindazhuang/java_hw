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
//		Bc bc = null //�٤��Q�n�ϥΨ�
		Bc bc = new Bc();//�ߺD���O�򪫥�W�٬ۦP //�@�w�nnew�~�i�H�Q�ϥ�
		bc.setWeight(100);
		bc.setName("Linda"); //�r��""���޸�
		System.out.println(bc.getWeight());
		System.out.println(bc.toString());
	}
}

class Bc {
	  private int weight;//�ݩ�
	  public String name;
//int�w�]��0�Astring�w�]null

	public int getWeight() {//��kmethod
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) { //void���^�ǥ�����
		this.name = name; //this�ݩ�
	}
	
	public String toString(){
	    return "this bc's weight = "+  weight +",name="+name;
//	    return "this bc's name = " + name + ", weight = " + weight;
//toString�O�Ӧܩ�java.lang.Object����k
//�p�G�ڭ̹��o�Ӥ�k�A�ݭn�ﵽ�٬O���g�ɡA
//�ڭ̥i�H�мg(��g)�ڭ̷Q�n�����G
	    
	  }
	}