package stack;
import java.util.Stack;

public class IsPopStack {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        // 栈的深度
        int size = pushA.length;
        // 空栈
        Stack<Integer> stack = new Stack<>();
        // index出栈的标记，出几个了
        int index_pop = 0;
        // 外层入栈，内层判断是否出栈
        for(int i=0;i<size;i++){
            stack.push(pushA[i]);
            while(!stack.empty() && stack.peek() == popA[index_pop]){
                index_pop++;
                stack.pop();
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};
        System.out.println(IsPopOrder(a,b));
    }
}
