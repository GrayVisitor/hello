package 简单购物系统;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods go=new Goods();
		go.setId("5");
		go.setName("电动牙刷");
		go.setImg("A5.jpg");
		go.setPrice((float)2);
		go.savegoods();
		/*go.getId("1");
		go.getgoodsby("1");
		System.out.print(go.getName());
		System.out.print(go.getPrice());*/
	}

}
