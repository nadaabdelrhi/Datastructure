package Linkedlist;
class Node{
        int item;
        Node next;
    }
public class Linkedlist_code {

    Node Head;
    Node Tail;
    int length;
    Linkedlist_code(){
        Head=Tail=null;
        length=0;
    }
    boolean isempty(){
        return length==0;
    }

    void insert_first(int value){
        Node new_node=new Node();
        new_node.item=value;
        if(isempty()){
            Head=Tail=new_node;
            new_node.next=null;
        }
        else{
            new_node.next=Head;
            Head=new_node;
        }
        length++;
    }
    void insert_last(int value){
        Node new_node=new Node();
        new_node.item=value;
        if(isempty()){
            Head=Tail=new_node;
            new_node.next=null;
        }
        else{
            Tail.next=new_node;
            new_node.next=null;
            Tail=new_node;
        }
        length++;
    }

    void traverse(){
        if(isempty()){
            System.out.println("linkedlist is empty ");
        }
        else{
            Node temp=Head;
            while(temp != null){
                System.out.print(temp.item +" ");
                temp=temp.next;
            }
        }
    }
    void insert_at_pos(int value ,int pos){
        Node new_node=new Node();
        new_node.item=value;
        Node temp=Head;
        if(pos<0 || pos>length){
            System.out.println("invalid position");
            return;
        }
        elseif(pos==0){
            insert_first(value);
        }
        elseif(pos == length){
            insert_last(value);
        }
        else{
            for(int i=0;i<pos-1;++i){
            temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
            length++;
        }
        

    }

    void delete(int value){
        if(isempty()){
            System.out.println("linkedlist is empty ");
            return;
        }
        elseif(Head.item==value){
            Head=Head.next;
            if(Head==null){
                Tail=null;
            }
        }
        else{
            Node temp=Head;
            while(temp.next.item != value){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(temp.next==null){
                Tail=temp;
            }
            
        }
    }



}
