package tree;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        Thread thread = new Thread(test1);
        Thread thread2 = new Thread(test2);
        thread.start();
        thread2.start();

    }


}
class Test1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(i);
        }
    }
}
class Test2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(i);
        }
    }
}
