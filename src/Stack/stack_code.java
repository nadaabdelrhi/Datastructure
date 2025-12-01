package Stack;

public class stack_code {
    int [] stack_arr;
    int top;
    int maxsize;

    stack_code(int size){
        maxsize=size;
        top=-1;
        stack_arr= new int [maxsize];

    }
    boolean isempty(){
        return (top ==-1);
    }
    boolean isfull(){
        return (top==stack_arr.length-1);
    }
    void push(int value){
        stack_arr[++top]=value;
        System.out.println(value + " pushed to stack");
        
        
    }
    int pop(){
        if(isempty()){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            int temp=stack_arr[top--];
            return temp;
        }
        
    }
    int top(){
        if(isempty()){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            return stack_arr[top];
        }
        
    }
    void display(){
        if(isempty()){
            System.out.println("stack is empty");
        }
        else{
            for ( int num:stack_arr){
            System.out.print(num +" ");
            }
        }
        
    }
}
