package corepackage;

public class Firstclass {
	
	int a =10;
	static int b= 20;
	
	public String getdata() {
		System.out.println("im in first method");
		return "getdata";
	}
	
	public static void main(String[] args) {
		Firstclass obj=new Firstclass();
		Secondclass obj1= new Secondclass();
	
		System.out.println(obj.a);
		System.out.println(b);
		obj.getdata();
		obj1.setdata();

	}

}
