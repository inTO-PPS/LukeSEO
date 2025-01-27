import java.util.Stack;

class MyQueue {
    Stack<Integer> a;
    Stack<Integer> b;

    public MyQueue() {
        a=new Stack<>();
        b=new Stack<>();
    }

    public void push(int x) {
        while(!a.empty()){
            int t=a.pop();
            b.push(t);
        }
        a.push(x);
        while(!b.empty()){
            int t=b.pop();
            a.push(t);
        }
    }

    public int pop() {
        return a.pop();
    }

    public int peek() {
        return a.peek();
    }

    public boolean empty() {
        return a.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */