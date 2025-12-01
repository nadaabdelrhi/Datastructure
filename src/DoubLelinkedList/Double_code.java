package DoubleLinkedList;

public class Double_code {
    class node{
        int value;
        node next;
        node prev;
        
        node(int v){
            value=v;
            next=prev=null;
            
        }
    }
    int len=0;
    node head,last;
    Double_code(){
        head=last=null;
    }
    
    void insert_first(int data){
        node newnode=new node(data);
        if(head==null){
            head=last=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
        len++;
    }
    void insert_last(int data){
        node newnode=new node(data);
        if(last==null) head=last=newnode;
        else{
            last.next=newnode;
            newnode.prev=last;
            last=newnode;
        }
        len++;
    }
    void insert_at_pos(int data,int pos){
        if(pos>len) return;
        if(pos==0) insert_first(data);
        else if(pos == len) insert_last(data);
        else{
            node newnode=new node(data);
            node temp=head;
            for(int i=0;i<pos-1;++i){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next.prev=newnode;
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
    void delete_first(){
        if(head==null) return;
        else if(head==last) {
            head=last=null;
            return;
        }
        else{
            head=head.next;
            head.prev=null;
            len--;
        }
    }
    void delete_last(){
        if(last==null) return;
        else if(last==head){
            last=head=null;
            len--;
        }
        else{
            last=last.prev;
            last.next=null;
            len--;
        }
        
    }

    void delete_at_pos(int pos){
        if(pos>=len) return;
        if(pos==0) delete_first();
        else if(pos ==len-1)delete_last();
        else{
            node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(temp.next.next != null ) temp.next.next.prev=temp;
            len--;
        }
    }
}
