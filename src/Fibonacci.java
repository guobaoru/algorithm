import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//斐波那契数列求青蛙跳阶问题
public class Fibonacci {
    //递归
    public static long fibo1(long a){
        if(a <= 0){
            return 0;
        }else if(a == 0){
            return 1;
        }else if(a == 1){
            return 1;
        }
        return fibo1(a-1)+fibo1(a-2);
    }
    //循环
    public static long fibo2(long n){
        long a = 0;
        long b = 1;
        long c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        System.out.println(fibo1(45));
        System.out.println("递归使用时间："+(System.currentTimeMillis()-t1)+"ms");
        long t2 = System.currentTimeMillis();
        System.out.println(fibo2(45));
        System.out.println("循环使用时间："+(System.currentTimeMillis()-t2)+"ms");
    }
}
