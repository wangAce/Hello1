import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("你好");

        list.add("哈哈");

        list.add("呵呵");

        for (int i = 0; i <list.size() ; i++) {

            System.out.println(list.get(i));
        }

         Demo demo = new Demo();

        demo.m2();

    }
}
