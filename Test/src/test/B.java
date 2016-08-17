package test;

public class B extends A{  
	   public B(){  
	      System.out.println("调用了B的无参构造函数");  
	   }  
	   public B(String mess){  
	      super(mess);  
	      System.out.println("调用了B的有参构造函数\n"+  
	         "参数内容为："+mess);  
	   }  
} 
