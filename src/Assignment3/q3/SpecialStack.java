package Assignment3.q3;

import java.util.Stack;

class SpecialStack{
    Stack<Integer> mainStack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    int size;

    SpecialStack(int size){
        this.size=size;
    }
    boolean isEmpty(){
        return mainStack.isEmpty();
    }
    boolean isFull(){
        return mainStack.size()==size;
    }
    void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        mainStack.push(x);
        if(minStack.isEmpty()||x<=minStack.peek()){
            minStack.push(x);
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int removed=mainStack.pop();
        if(removed==minStack.peek()){
            minStack.pop();
        }
        return removed;
    }
    int getMin(){
        if(minStack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack.peek();
    }
    public static void main(String[]args){
        SpecialStack s=new SpecialStack(5);
        s.push(10);
        s.push(20);
        s.push(5);
        s.push(8);

        System.out.println("Minimum: "+s.getMin());
        s.pop();
        s.pop();
        System.out.println("Minimum: "+s.getMin());
    }
}
