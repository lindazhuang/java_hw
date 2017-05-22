
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
 *  今天各位要準備開一家飲料店
 *  請使用物件導向方式
 *  設計出以下幾個類別以及簡潔的點餐系統
 *  
 *  1.點餐系統
 *  2.訂單查詢
 *  3.飲料維護   (進階)
 *  4.飲料統計   (進階)
 *  5.點餐修改   (進階)
 *  
 *  飲料 : 要有"基本說明"，"材料"，"容量"，"卡洛里"與"價格"
 *  
 *  飲料調整方式 : 飲料基本上會有"冰塊"，"甜度"，"大杯中杯"
 *            	的調整，請思考一下，如何搭配飲料類別去實作?
 *           	 
 *  菜單 : 裡面需要包含一些基本飲料
 *     	(建議一開始，自己初始化ㄧ些飲料)
 *  
 *  點餐系統 : 1.使用者執行這個程式後
 *          	看到一個簡單的飲料清單
 *      	 
 *        	2.使用者開始點餐，需要記錄使用者點了甚麼飲料
 *          	還有冰塊，糖度，等等
 *     	 
 *        	3.點餐完畢，顯示使用者點完的結果   
 *           	 
 *  訂單查詢 : 我們需要一個訂單查詢系統
 *        	我們需要產生訂單號碼，使用者的姓名與電話
 *        	並紀錄點了多少飲料
 *  
 *  -----------------------------------------------
 *  
 *  進階題
 *  飲料統計 : 每次點餐完畢之後，可以根據功能選項
 *        	看到總共賣出多少飲料，消費總金額
 *        	以及統計每杯飲料點的數量       	 
 *  
 *  飲料維護  : 可以在維護介面新增飲料與修改
 *
 *  點餐修改 : 可以在這個選項裡，新增、修改、刪除客人的訂單
 *  
 *  Hit : 需要看到繼承，多型，封裝這三種物件導向基礎的類別設計
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
	// 建立訂單資料
	  LinkedList<Order> orders;
	  private void genDefaultOrders() {
			orders = new LinkedList<Order>();
		  }
	private void genOrderSystem(){
		boolean system = true;
	    
		while(system){
	  	System.out.println("--------------------");
	  	System.out.println("飲料點餐系統");
	  	Scanner scanner = new Scanner(System.in);
	  	System.out.println("1.點餐系統，請按1");
	  	System.out.println("2.訂單查詢，請按2");
	  	System.out.println("0.結束功能，請按0");
	  	System.out.print("請輸入要執行的功能:");
	  	if(!scanner.hasNextInt()){
	    	System.out.println("輸入錯誤，重新開始\n");
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
	      	System.out.println("飲料點餐系統結束");
	      	break;
	    	default:
	      	System.out.println("您尚未選取到任何功能，請重新開始");
	      	break;
	  	}
		}

	}



private void orderDrink() {
		// TODO Auto-generated method stub
	System.out.println("--飲料menu--");
	Order order = new Order();
	List<Drink> drinks = new LinkedList<Drink>();
	Scanner scanner = new Scanner(System.in);
	menus=new GenDrinkmenu().exec();
	for (String key:menus.keySet()) {
		System.out.println(menus.get(key).toString());
	}
	System.out.println("請輸入飲料編號:");
	String input = scanner.next();
	//input = scanner.next();
	boolean isTheProdNumber = false;
	for(String key : menus.keySet()){
      	if(input.equals(key)){
        	isTheProdNumber = true;
        	break;
      	}
    	}
	System.out.print("糖度(全糖:1，七分糖:2，五分糖:3，三分糖:4，無糖:5)");
	String sugar = scanner.next();
	System.out.print("冰塊(正常:1，少冰:2，去冰:3)");
	String ice = scanner.next();
	System.out.print("冷熱(冷:1，熱:2):");
	String hot = scanner.next();
	System.out.print("杯數:");
	String number = scanner.next();
	order.setDrinks(drinks);
  	orders.add(order);
  	System.out.println("(點餐完畢)");
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
  	System.out.print("是否要繼續查詢(1:繼續 , 0:離開):");
  	if("0".equals(scanner.next())){
    	System.out.println("2.1 查詢結束");
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
	// 封裝name(名字)目的是，不可以讓外界隨意更改名字
	// 以免被說成產品標示不名
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
	//"材料"，"容量"，"卡洛里"與"價格"
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
    	return "產品編號 ="+getProdno()+
    			",desc = "+getDesc()+
    		   ",名稱 = "+getName()+
    		   ",產地 = "+getRaw()+
    		   ",容量 = "+getMl()+
    		   ",卡路里 = "+getKcal()+
    		   ",大小 = "+getBigSmall()+
    		   ",價格 = "+getPrice();
    	//	   ",冰塊 = "+getIce()+
    	//	   ",甜度 = "+getSugar()+
    	//	   ",數量 = "+getNumber();
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
		return "飲料 : " + getName() + " 價格 : " + getPrice()
	        	+ " 大小 : " + getBigSmall() + " 糖量 : " + getSugar() + " 冷熱 : " + isHot()
	        	+ " 冰量 : " + getIce() + " 杯數 : " + getNumber();
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
		builder.append("\n訂購資訊");
		
		if(getDrinks()!=null){
	  	builder.append("\n飲料清單");
	  	for(Drink data : getDrinks()){
	    	builder.append("\n" + data.printDrink());
	  	}
		} else {
	  	builder.append("\n尚未設定飲料");
		}
		builder.append("\n-------------------");
		return builder.toString();
	  }
	
}

class GenDrinkmenu{
	public Map<String, Drink> exec(){
		Map<String, Drink> drinkdata=new HashMap<String, Drink>();
		drinkdata.put("1",new Drink("1","台灣","大正紅茶拿鐵","印度","500","140","L",50));
		drinkdata.put("2",new Drink("2","台灣","綠茶拿鐵","越南","500","120","L",45));
		drinkdata.put("3",new Drink("3","台灣","烏龍拿鐵","台灣","500","140","L",50));
		drinkdata.put("4",new Drink("4","台灣","烏龍拿鐵","台灣","500","140","M",45));
		return drinkdata;
	}
}







