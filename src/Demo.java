public class Demo {


    private  String name = "小明";



    public  static void  m1(){

        System.out.println("你好");

    }


    public  void m2(){

        Demo.m1();

        System.out.println(name);

    }

}
