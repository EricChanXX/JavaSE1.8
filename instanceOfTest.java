public class instanceOfTest {
	//���췽��
	public instanceOfTest () {}

	 //���ýӿ�A
	 interface A{}
	 
	 //��B ʵ�� �ӿ�A
	 class B implements A {
	  
	 }
	 //��C �̳� ��B
	 class C extends B {
	  
	 }
	 
	  public static void main(String[] args){
		 //�½���ķ�������
	     A a=null;
	     B b=null;
	     boolean res; 
	     
	     System.out.println("instanceoftest test case 1: ------------------");
	     res = a instanceof A; 
	     System.out.println("a instanceof A: " + res);
	       
	     res = b instanceof B;
	     System.out.println("b instanceof B: " + res);
		 

	     System.out.println("/ninstanceoftest test case 2: ------------------");   
	     //�½���
	     a = new instanceOfTest().new B();
	     b = new instanceOfTest().new B();
	     
	     //ʵ��a�ǽӿ�A���Ǹ�ʵ����
	     res = a instanceof A; 
	     System.out.println("a instanceof A: " + res);
	     //ʵ��a����B���Ǹ�ʵ����
	     res = a instanceof B;
	     System.out.println("a instanceof B: " + res);
	     //ʵ��B�ǽӿ�A���Ǹ�ʵ����
	     res = b instanceof A;
	     System.out.println("b instanceof A: " + res);
	     //ʵ��b����B��һ��ʵ����
	     res = b instanceof B;
	     System.out.println("b instanceof B: " + res);
	    
	     System.out.println("/ninstanceoftest test case 3: ------------------");
	     //�½���C ��ʵ����b2  ���̳���B
	     B b2=new instanceOfTest().new C();
	     //�̳����ʵ����Ҳ���丸��Ͷ�Ӧ�ӿڵ�ʵ��
	     res = b2 instanceof A;
	     System.out.println("b2 instanceof A: " + res);
	     
	     res = b2 instanceof B;
	     System.out.println("b2 instanceof B: " + res);
	     
	     res = b2 instanceof C;
	     System.out.println("b2 instanceof C: " + res);
	  }


}
