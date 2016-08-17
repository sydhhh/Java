package test;

public class A{  
    public A(){  
       System.out.println("调用了A的无参构造函数");  
    }  
    public A(String mess){  
       System.out.println("调用了A的有参的构造函数\n"+  
          "参数内容为："+mess);  
   }  
}  

