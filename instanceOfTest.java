public class instanceOfTest {
	//构造方法
	public instanceOfTest () {}

	 //设置接口A
	 interface A{}
	 
	 //类B 实现 接口A
	 class B implements A {
	  
	 }
	 //类C 继承 类B
	 class C extends B {
	  
	 }
	 
	  public static void main(String[] args){
		 //新建类的方法不对
	     A a=null;
	     B b=null;
	     boolean res; 
	     
	     System.out.println("instanceoftest test case 1: ------------------");
	     res = a instanceof A; 
	     System.out.println("a instanceof A: " + res);
	       
	     res = b instanceof B;
	     System.out.println("b instanceof B: " + res);
		 

	     System.out.println("/ninstanceoftest test case 2: ------------------");   
	     //新建类
	     a = new instanceOfTest().new B();
	     b = new instanceOfTest().new B();
	     
	     //实例a是接口A的是个实例化
	     res = a instanceof A; 
	     System.out.println("a instanceof A: " + res);
	     //实例a是类B的是个实例化
	     res = a instanceof B;
	     System.out.println("a instanceof B: " + res);
	     //实例B是接口A的是个实例化
	     res = b instanceof A;
	     System.out.println("b instanceof A: " + res);
	     //实例b是类B的一个实例化
	     res = b instanceof B;
	     System.out.println("b instanceof B: " + res);
	    
	     System.out.println("/ninstanceoftest test case 3: ------------------");
	     //新建类C 的实例化b2  它继承类B
	     B b2=new instanceOfTest().new C();
	     //继承类的实例化也是其父类和对应接口的实例
	     res = b2 instanceof A;
	     System.out.println("b2 instanceof A: " + res);
	     
	     res = b2 instanceof B;
	     System.out.println("b2 instanceof B: " + res);
	     
	     res = b2 instanceof C;
	     System.out.println("b2 instanceof C: " + res);
	  }


}
