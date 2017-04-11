
package Class6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HomeWork6 {
	public static void main(String[] args) {
		new Q6_1().doHashMap1();
		new Q6_2().doArrayList();
		new Q6_3().randomSet();
		//new Q6_4().doHashMap2();
		Map<String,Order> map=new Q6_4().doHashMap2();
		//Map<String,String> customers = new Q6_4().doHashMap2();
		for(String key:map.keySet()){
			//System.out.println("key="+key);
			Order order=map.get(key);
			System.out.println(order.getCus_no()+' '+order.getOrder_no()+' '+order.getItem()+' '+order.getAmt());
		}
	}
}

/**
 * <pre>
 *
 * �Шϥ�Map����A�B�z�H�U���D
 *
 * �|�����
 * �s��  �m�W
 * C1	�Ŧ�
 * C2	��ۣ
 * C3	�p��
 *
 * 1.�|���s��C1���m�W��令����A�æL�X�e��ק諸���e
 * 2.�|���s��C2�w�Q����ϥΡA�s�W�@�ӷs���|�����
 *   �s��:C4 ,  �m�W: �ѤѡA�æL�X����|�����
 *
 * </pre>
 */
class Q6_1{
	public void doHashMap1(){
		System.out.println("-------------Q6_1--------------------");
	Map<String, String> myMap1 = new HashMap<String, String>();
	myMap1.put("C1","�Ŧ�");
	myMap1.put("C2","��ۣ");
	myMap1.put("C3", "�p��");
	for (String key : myMap1.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + myMap1.get(key));
		}
	System.out.println("-------------printChangeName--------------------");
	myMap1.put("C1","����");
	for (String key : myMap1.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + myMap1.get(key));
		}
	System.out.println("-------------printDeleteAndNewMember--------------------");
	myMap1.remove("C2");
	myMap1.put("C4","�Ѥ�");
	for (String key : myMap1.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + myMap1.get(key));
		}
	System.out.println("---------------------------------");
	

}
}

/**
 * <pre>
 * �Шϥ�List����A�B�z�H�U���D
 *
 * �|�����
 * �s��  �m�W
 * C1	�Ŧ�
 * C2	��ۣ
 * C3	�p��
 *
 * 1.�|���s��C1���m�W��令����A�æL�X�e��ק諸���e
 * 2.�|���s��C2�w�Q����ϥΡA�s�W�@�ӷs���|�����
 *   �s��:C4 ,  �m�W: �ѤѡA�æL�X����|�����
 *   
 * </pre>
 */
class Q6_2{
	public void doArrayList() {
		System.out.println("-------Q6_2---------");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("C1");
        list1.add("C2");
        list1.add("C3");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("�Ŧ�");
        list2.add("��ۣ");
        list2.add("�p��");
        for(int i=0;i<3;i++){
        System.out.println("key = " + list1.get(i) + " , value = " + list2.get(i));
}
        System.out.println("-------------printChangeName--------------------");
        list2.set(0, "����");
        for(int i=0;i<3;i++){
            System.out.println("key = " + list1.get(i) + " , value = " + list2.get(i));
    }
        System.out.println("-------------printDeleteAndNewMember--------------------");
        list1.remove(1);
        list2.remove(1);
        list1.add("C4");
        list2.add("�Ѥ�");
        for(int i=0;i<3;i++){
            System.out.println("key = " + list1.get(i) + " , value = " + list2.get(i));
    }

	}
}

/**
 * <pre>
 * �ϥ�Set����PRandom����f�t
 * ����10�դj�ֳz���X
 * </pre>
 */
class Q6_3{
	public void randomSet() {
		System.out.println("-------Q6_3---------");
		HashSet<Integer> hs1 = new HashSet<Integer>();
		Random ran = new Random();
		for(int b=1;b<=10;b++){
			hs1.clear();
			System.out.print("��"+b+"��");
		for (int a=1;a<=6;a++){
		hs1.add(ran.nextInt(42)+1);
	}
		System.out.println(hs1);
	}
	}
}

/**
 * <pre>
 *
 * �H�U�Шϥ�Map�����x�s�H�U��T
 * �øѨM�|�Ӱ��D
 *
 * �|�����
 * �s��  �m�W
 * C1	�pQ
 * C2	�p�}
 * C3	�d�z
 *
 * �q����
 * �q�� �|���s��  �q�ʤ��e 	���B
 * O001 	C1  	��A    	789
 * O002 	C1    	3C   	1999
 * O003 	C2  	�C��   	1899
 * O004 	C2	�O�i�~   	3300
 * O005 	C3	��v��  	14999
 *
 * �Хηs�W�|���P�q�����O(Class)
 * �]�w�C��|����ƥH�έq���ƫ�
 *
 * 1.�η|���s���d�߷|���R���ӫ~
 *   ��X�榡 => �s�� �m�W �q�� �q�ʤ��e ���B
 *   
 * 2.��X�C��|�����������O���B
 *   ��X�榡 => �s�� �m�W �������B
 *   
 * 3.�̷Ӯ��O�`���B����C�Ƨ�
 *   ��X�榡 => �s�� �m�W ���O�`���B
 *   
 * 4.�̷Ӯ��O�`���B�C�찪�Ƨ�
 *   ��X�榡 => �s�� �m�W ���O�`���B
 *   
 * </pre>
 */
class Q6_4{
	public Map<String, Order> doHashMap2(){
		System.out.println("-------------Q6_4--------------------");
	Map<String, String> customers = new HashMap<String, String>();
	/*Customer c1=new Customer();
	Customer c2=new Customer();
	Customer c3=new Customer();
	c1.name="�pQ";
	c2.name="�p�}";
	c3.name="�d�z";*/
	customers.put("C1","�pQ");
	customers.put("C2","�p�}");
	customers.put("C3","�d�z");
	/*for (String key : customers.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + customers.get(key));
		}*/
    Map<String, Order> order = new HashMap<String, Order>();
	order.put("O001",new Order("O001","C1","��A",789));
	order.put("O002",new Order("O002","C1","3C",1999));
	order.put("O003",new Order("O003","C2","�C��",1899));
	order.put("O004",new Order("O004","C2","�O�i�~",3300));
	order.put("O005",new Order("O005","C2","��v��",14999));
	/*for (String key : order.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + order.get(key));
		}*/
	return order;
	}
}

/**
 * <pre>
 *
 * �H�U�Шϥ�List�����x�s�H�U��T
 * �øѨM�|�Ӱ��D
 *
 * �|�����
 * �s��  �m�W
 * C1	�pQ
 * C2	�p�}
 * C3	�d�z
 *
 * �q����
 * �q�� �|���s��  �q�ʤ��e 	���B
 * O001 	C1  	��A    	789
 * O002 	C1    	3C   	1999
 * O003 	C2  	�C��   	1899
 * O004 	C2	�O�i�~   	3300
 * O005 	C3	��v��  	14999
 *
 * �Хηs�W�|���P�q�����O(Class)
 * �]�w�C��|����ƥH�έq���ƫ�
 *
 * 1.�η|���s����X�|���R���ӫ~
 *   ��X�榡 => �s�� �m�W �q�� �q�ʤ��e ���B
 *   
 * 2.��X�C��|�����������O���B
 *   ��X�榡 => �s�� �m�W �������B
 *   
 * 3.�̷Ӯ��O�`���B����C�Ƨ�
 *   ��X�榡 => �s�� �m�W ���O�`���B
 *   
 * 4.�̷Ӯ��O�`���B�C�찪�Ƨ�
 *   ��X�榡 => �s�� �m�W ���O�`���B
 *   
 * </pre>
 */
class Q6_5{
	public void doArrayList() {
		System.out.println("-------Q6_5---------");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("C1");
        list1.add("C2");
        list1.add("C3");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("�pQ");
        list2.add("�p�}");
        list2.add("�d�z");
        for(int i=0;i<3;i++){
        System.out.println("key = " + list1.get(i) + " , value = " + list2.get(i));
        }
	}
}
/*
class Customer{
	public String name;
}*/
class Order{
	private String order_no;
	private String cus_no;
	private String item;
	private Integer amt;
	public Order(String order_no,String cus_no,String item,Integer amt){
		this.setOrder_no(order_no);
		this.setCus_no(cus_no);
		this.setItem(item);
		this.setAmt(amt);
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getCus_no() {
		return cus_no;
	}
	public void setCus_no(String cus_no) {
		this.cus_no = cus_no;
	}
	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
}





