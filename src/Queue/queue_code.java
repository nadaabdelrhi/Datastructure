package Queue;

public class queue_code {
    int [] queue;
    int first;
    int last;
    int maxsize;

    queue_code(int size){
        maxsize=size;
        first=last=-1;
        queue=new int [maxsize];
    }
    boolean isempty(){
        return (last==-1);
    }
    boolean isfull(){
        return last==maxsize-1;
    }

    void enqueue(int value){
        if(isfull()){
            return;
        }
        else{
            queue[++last]=value;
        }
        
    }
    void enqueue_circular(int value){
        if(last == maxsize-1 && first != -1){
            last=(last+1)%maxsize;
            queue[last]=value;
        }
        last++;
    }
    void dequeue(){
       
        if(first == last && first != -1 && last !=-1){
            first= -1;
            last=-1;

            return;
        }
        first++;
    }

}
