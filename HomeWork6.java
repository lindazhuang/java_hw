
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
 * 請使用Map物件，處理以下問題
 *
 * 會員資料
 * 編號  姓名
 * C1	藍色
 * C2	香菇
 * C3	小草
 *
 * 1.會員編號C1的姓名更改成紅色，並印出前後修改的內容
 * 2.會員編號C2已被停止使用，新增一個新的會員資料
 *   編號:C4 ,  姓名: 天天，並印出整體會員資料
 *
 * </pre>
 */
class Q6_1{
	public void doHashMap1(){
		System.out.println("-------------Q6_1--------------------");
	Map<String, String> myMap1 = new HashMap<String, String>();
	myMap1.put("C1","藍色");
	myMap1.put("C2","香菇");
	myMap1.put("C3", "小草");
	for (String key : myMap1.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + myMap1.get(key));
		}
	System.out.println("-------------printChangeName--------------------");
	myMap1.put("C1","紅色");
	for (String key : myMap1.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + myMap1.get(key));
		}
	System.out.println("-------------printDeleteAndNewMember--------------------");
	myMap1.remove("C2");
	myMap1.put("C4","天天");
	for (String key : myMap1.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + myMap1.get(key));
		}
	System.out.println("---------------------------------");
	

}
}

/**
 * <pre>
 * 請使用List物件，處理以下問題
 *
 * 會員資料
 * 編號  姓名
 * C1	藍色
 * C2	香菇
 * C3	小草
 *
 * 1.會員編號C1的姓名更改成紅色，並印出前後修改的內容
 * 2.會員編號C2已被停止使用，新增一個新的會員資料
 *   編號:C4 ,  姓名: 天天，並印出整體會員資料
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
		list2.add("藍色");
        list2.add("香菇");
        list2.add("小草");
        for(int i=0;i<3;i++){
        System.out.println("key = " + list1.get(i) + " , value = " + list2.get(i));
}
        System.out.println("-------------printChangeName--------------------");
        list2.set(0, "紅色");
        for(int i=0;i<3;i++){
            System.out.println("key = " + list1.get(i) + " , value = " + list2.get(i));
    }
        System.out.println("-------------printDeleteAndNewMember--------------------");
        list1.remove(1);
        list2.remove(1);
        list1.add("C4");
        list2.add("天天");
        for(int i=0;i<3;i++){
            System.out.println("key = " + list1.get(i) + " , value = " + list2.get(i));
    }

	}
}

/**
 * <pre>
 * 使用Set物件與Random物件搭配
 * 產生10組大樂透號碼
 * </pre>
 */
class Q6_3{
	public void randomSet() {
		System.out.println("-------Q6_3---------");
		HashSet<Integer> hs1 = new HashSet<Integer>();
		Random ran = new Random();
		for(int b=1;b<=10;b++){
			hs1.clear();
			System.out.print("第"+b+"組");
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
 * 以下請使用Map物件儲存以下資訊
 * 並解決四個問題
 *
 * 會員資料
 * 編號  姓名
 * C1	小Q
 * C2	小咪
 * C3	查理
 *
 * 訂單資料
 * 訂單 會員編號  訂購內容 	金額
 * O001 	C1  	衣服    	789
 * O002 	C1    	3C   	1999
 * O003 	C2  	遊戲   	1899
 * O004 	C2	保養品   	3300
 * O005 	C3	攝影機  	14999
 *
 * 請用新增會員與訂單類別(Class)
 * 設定每位會員資料以及訂單資料後
 *
 * 1.用會員編號查詢會員買的商品
 *   輸出格式 => 編號 姓名 訂單 訂購內容 金額
 *   
 * 2.算出每位會員的平均消費金額
 *   輸出格式 => 編號 姓名 平均金額
 *   
 * 3.依照消費總金額高到低排序
 *   輸出格式 => 編號 姓名 消費總金額
 *   
 * 4.依照消費總金額低到高排序
 *   輸出格式 => 編號 姓名 消費總金額
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
	c1.name="小Q";
	c2.name="小咪";
	c3.name="查理";*/
	customers.put("C1","小Q");
	customers.put("C2","小咪");
	customers.put("C3","查理");
	/*for (String key : customers.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + customers.get(key));
		}*/
    Map<String, Order> order = new HashMap<String, Order>();
	order.put("O001",new Order("O001","C1","衣服",789));
	order.put("O002",new Order("O002","C1","3C",1999));
	order.put("O003",new Order("O003","C2","遊戲",1899));
	order.put("O004",new Order("O004","C2","保養品",3300));
	order.put("O005",new Order("O005","C2","攝影機",14999));
	/*for (String key : order.keySet()) {  //foreach
	  	System.out.println("key = " + key + " , value = " + order.get(key));
		}*/
	return order;
	}
}

/**
 * <pre>
 *
 * 以下請使用List物件儲存以下資訊
 * 並解決四個問題
 *
 * 會員資料
 * 編號  姓名
 * C1	小Q
 * C2	小咪
 * C3	查理
 *
 * 訂單資料
 * 訂單 會員編號  訂購內容 	金額
 * O001 	C1  	衣服    	789
 * O002 	C1    	3C   	1999
 * O003 	C2  	遊戲   	1899
 * O004 	C2	保養品   	3300
 * O005 	C3	攝影機  	14999
 *
 * 請用新增會員與訂單類別(Class)
 * 設定每位會員資料以及訂單資料後
 *
 * 1.用會員編號找出會員買的商品
 *   輸出格式 => 編號 姓名 訂單 訂購內容 金額
 *   
 * 2.算出每位會員的平均消費金額
 *   輸出格式 => 編號 姓名 平均金額
 *   
 * 3.依照消費總金額高到低排序
 *   輸出格式 => 編號 姓名 消費總金額
 *   
 * 4.依照消費總金額低到高排序
 *   輸出格式 => 編號 姓名 消費總金額
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
		list2.add("小Q");
        list2.add("小咪");
        list2.add("查理");
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





