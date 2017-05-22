
package HW7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Homework7 {
	public static void main(String[] args) {
		new Q7_1().exec();
	}
       
}

/**
 * <pre>
 *
 *  ���ѦU��n�ǳƶ}�@�a���Ʃ�
 *  �ШϥΪ���ɦV�覡
 *  �]�p�X�H�U�X�����O�H��²�䪺�I�\�t��
 *  
 *  1.�I�\�t��
 *  2.�q��d��
 *  3.���ƺ��@   (�i��)
 *  4.���Ʋέp   (�i��)
 *  5.�I�\�ק�   (�i��)
 *  
 *  ���� : �n��"�򥻻���"�A"����"�A"�e�q"�A"�d����"�P"����"
 *  
 *  ���ƽվ�覡 : ���ư򥻤W�|��"�B��"�A"����"�A"�j�M���M"
 *            	���վ�A�Ы�Ҥ@�U�A�p��f�t�������O�h��@?
 *           	 
 *  ��� : �̭��ݭn�]�t�@�ǰ򥻶���
 *     	(��ĳ�@�}�l�A�ۤv��l�ƣ��Ƕ���)
 *  
 *  �I�\�t�� : 1.�ϥΪ̰���o�ӵ{����
 *          	�ݨ�@��²�檺���ƲM��
 *      	 
 *        	2.�ϥΪ̶}�l�I�\�A�ݭn�O���ϥΪ��I�F�ƻ򶼮�
 *          	�٦��B���A�}�סA����
 *     	 
 *        	3.�I�\�����A��ܨϥΪ��I�������G   
 *           	 
 *  �q��d�� : �ڭ̻ݭn�@�ӭq��d�ߨt��
 *        	�ڭ̻ݭn���ͭq�渹�X�A�ϥΪ̪��m�W�P�q��
 *        	�ì����I�F�h�ֶ���
 *  
 *  -----------------------------------------------
 *  
 *  �i���D
 *  ���Ʋέp : �C���I�\��������A�i�H�ھڥ\��ﶵ
 *        	�ݨ��`�@��X�h�ֶ��ơA���O�`���B
 *        	�H�βέp�C�M�����I���ƶq       	 
 *  
 *  ���ƺ��@  : �i�H�b���@�����s�W���ƻP�ק�
 *
 *  �I�\�ק� : �i�H�b�o�ӿﶵ�̡A�s�W�B�ק�B�R���ȤH���q��
 *  
 *  Hit : �ݭn�ݨ��~�ӡA�h���A�ʸ˳o�T�ت���ɦV��¦�����O�]�p
 * </pre>
 */
class Q7_1 {
	Map<String, Drink> menus;
	public void exec(){
		//menus=new GenDrinkmenu().exec();
		//for (String key:menus.keySet()) {
			//System.out.println(menus.get(key).toString());
		//}
		genDefaultOrders();
		genOrderSystem();
	}
	// �إ߭q����
	  LinkedList<Order> orders;
	  private void genDefaultOrders() {
			orders = new LinkedList<Order>();
		  }
	private void genOrderSystem(){
		boolean system = true;
	    
		while(system){
	  	System.out.println("--------------------");
	  	System.out.println("�����I�\�t��");
	  	Scanner scanner = new Scanner(System.in);
	  	System.out.println("1.�I�\�t�ΡA�Ы�1");
	  	System.out.println("2.�q��d�ߡA�Ы�2");
	  	System.out.println("0.�����\��A�Ы�0");
	  	System.out.print("�п�J�n���檺�\��:");
	  	if(!scanner.hasNextInt()){
	    	System.out.println("��J���~�A���s�}�l\n");
	    	continue;
	  	}
	  	int functionFlag = Integer.parseInt(scanner.next());
	  	System.out.println("--------------------");
	  	switch(functionFlag){
	    	case 1:
	      	orderDrink();
	      	break;
	    	case 2:
	      	orderQuery();
	      	break;
	    	case 0:
	      	system = false;
	      	System.out.println("�����I�\�t�ε���");
	      	break;
	    	default:
	      	System.out.println("�z�|����������\��A�Э��s�}�l");
	      	break;
	  	}
		}

	}



private void orderDrink() {
		// TODO Auto-generated method stub
	System.out.println("--����menu--");
	Order order = new Order();
	List<Drink> drinks = new LinkedList<Drink>();
	Scanner scanner = new Scanner(System.in);
	menus=new GenDrinkmenu().exec();
	for (String key:menus.keySet()) {
		System.out.println(menus.get(key).toString());
	}
	System.out.println("�п�J���ƽs��:");
	String input = scanner.next();
	//input = scanner.next();
	boolean isTheProdNumber = false;
	for(String key : menus.keySet()){
      	if(input.equals(key)){
        	isTheProdNumber = true;
        	break;
      	}
    	}
	System.out.print("�}��(���}:1�A�C���}:2�A�����}:3�A�T���}:4�A�L�}:5)");
	String sugar = scanner.next();
	System.out.print("�B��(���`:1�A�֦B:2�A�h�B:3)");
	String ice = scanner.next();
	System.out.print("�N��(�N:1�A��:2):");
	String hot = scanner.next();
	System.out.print("�M��:");
	String number = scanner.next();
	order.setDrinks(drinks);
  	orders.add(order);
  	System.out.println("(�I�\����)");
  	//System.out.println(order.toString());
  //	settingDrinkSystem = false;
  	//orderDrinkSystem = false;
	}
private void orderQuery(){
	boolean isQuery = true;
	while(isQuery){
  	for(Order data : orders){
    	System.out.println(data.toString());
  	}
  	Scanner scanner = new Scanner(System.in);
  	System.out.print("�O�_�n�~��d��(1:�~�� , 0:���}):");
  	if("0".equals(scanner.next())){
    	System.out.println("2.1 �d�ߵ���");
    	System.out.println("-------------------");
    	isQuery = false;
    	break;
  	}
	}
  }
}
interface DrinkAction{
	public void setDrinkMix(String ice ,boolean hot, String sugar , int number);

}
abstract class Food {
	private String desc;
	private String name;
    public Food(String desc,String name){
    	this.desc = desc;
    	this.name = name;
    }
	// �ʸ�name(�W�r)�ت��O�A���i�H���~���H�N���W�r
	// �H�K�Q�������~�Хܤ��W
	public String getDesc() {
		return desc;
		
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Drink extends Food implements DrinkAction{
	public Drink(String prodno,String desc, String name,String raw,String ml,String kcal,String bigSmall,int price) {
		super(desc, name);
		this.prodno=prodno;
		this.raw = raw;
    	this.ml = ml;
    	this.kcal = kcal;
    	this.price = price;
    	this.bigSmall=bigSmall;
		// TODO Auto-generated constructor stub
	}
	//"����"�A"�e�q"�A"�d����"�P"����"
	private String raw;
	private String ml;
	private String kcal;
	private int price;
	private String prodno;
	
	private String ice;
	private String sugar;
	private boolean hot;
	private int number;
	private String bigSmall;
	
	public String getProdno() {
		return prodno;
	}
	public void setProdno(String prodno) {
		this.prodno = prodno;
	}
	
	public void setIce(String ice) {
		this.ice = ice;
	}
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
	public void setBigSmall(String bigSmall) {
		this.bigSmall = bigSmall;
	}
	public boolean isHot() {
		return hot;
	}
	public void setHot(boolean hot) {
		this.hot = hot;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getRaw() {
		return raw;
	}
	public void setRaw(String raw) {
		this.raw = raw;
	}
	public String getMl() {
		return ml;
	}
	public void setMl(String ml) {
		this.ml = ml;
	}
	public String getKcal() {
		return kcal;
	}
	public void setKcal(String kcal) {
		this.kcal = kcal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    public String toString(){
    	return "���~�s�� ="+getProdno()+
    			",desc = "+getDesc()+
    		   ",�W�� = "+getName()+
    		   ",���a = "+getRaw()+
    		   ",�e�q = "+getMl()+
    		   ",�d���� = "+getKcal()+
    		   ",�j�p = "+getBigSmall()+
    		   ",���� = "+getPrice();
    	//	   ",�B�� = "+getIce()+
    	//	   ",���� = "+getSugar()+
    	//	   ",�ƶq = "+getNumber();
    }
	public String getIce() {
		return ice;
	}
	public String getSugar() {
		return sugar;
	}

	public String getBigSmall() {
		return bigSmall;
	}
	
	@Override
	public void setDrinkMix(String ice, boolean hot, String sugar, int number) {
		// TODO Auto-generated method stub
		this.sugar=sugar;
		this.hot =hot;
		setIce(ice);
		this.number=number;
		
	}
	public String printDrink(){
		return "���� : " + getName() + " ���� : " + getPrice()
	        	+ " �j�p : " + getBigSmall() + " �}�q : " + getSugar() + " �N�� : " + isHot()
	        	+ " �B�q : " + getIce() + " �M�� : " + getNumber();
	  }
	
}	

class Order{
	private String cusName;
	private String cusTel;
	private String address;
	private boolean toGo;
	private List<Drink> drinks;
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusTel() {
		return cusTel;
	}
	public void setCusTel(String cusTel) {
		this.cusTel = cusTel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isToGo() {
		return toGo;
	}
	public void setToGo(boolean toGo) {
		this.toGo = toGo;
	}
	public List<Drink> getDrinks() {
		return drinks;
	}
	public void setDrinks(List<Drink> drinks) {
		this.drinks = drinks;
	}
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("-------------------");
		builder.append("\n�q�ʸ�T");
		
		if(getDrinks()!=null){
	  	builder.append("\n���ƲM��");
	  	for(Drink data : getDrinks()){
	    	builder.append("\n" + data.printDrink());
	  	}
		} else {
	  	builder.append("\n�|���]�w����");
		}
		builder.append("\n-------------------");
		return builder.toString();
	  }
	
}

class GenDrinkmenu{
	public Map<String, Drink> exec(){
		Map<String, Drink> drinkdata=new HashMap<String, Drink>();
		drinkdata.put("1",new Drink("1","�x�W","�j���������K","�L��","500","140","L",50));
		drinkdata.put("2",new Drink("2","�x�W","������K","�V�n","500","120","L",45));
		drinkdata.put("3",new Drink("3","�x�W","�Q�s���K","�x�W","500","140","L",50));
		drinkdata.put("4",new Drink("4","�x�W","�Q�s���K","�x�W","500","140","M",45));
		return drinkdata;
	}
}







