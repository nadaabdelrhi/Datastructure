public class Arraycode{
    int []arr_items;
    int counter;
    Arraycode(int size){
        arr_items=new int[size];
        counter=0;
    }

    boolean isempty(){
        return  counter==0;
    }

    boolean isfull(){
        return counter == arr_items.length;
    }
    
    void access_item(int index){
        if(index >= arr_items.length){
            System.out.println("invalid index");
        }
        else {
            System.out.println(arr_items[index]);
        }

    }

    void append (int item){
        if(isfull()){
            System.out.println("array is compleated");
            return;
        }
        else{
            //arr_items[counter]=item;
            //counter++;
            arr_items[counter++]=item;
        }
    }

    void traverse(){
        /*for(int i=0;i<counter;++i){
            System.out.print("item in index "+i+" is "+arr_items[i]);
            System.out.println();
        }*/
        for(int item:arr_items){
            System.out.println(item);

        }
    }
    void searchitem(int item){
        for(int i=0;i<counter;++i){
            if(item==arr_items[i]){
                System.out.print("item is found at index "+i);
                return;
            }
            
        }
        System.out.println("item is not founded");
    }
    boolean isfound(int item){
        for(int i:arr_items){
            if(i==item){
                return true;

            }
        }
        return false;
    }

    void insert(int index,int item){
        if(isfull()){
            System.out.println("Error , array is full ");
            return;
        }
        else{
            for(int i=counter;i>index;--i){
                arr_items[i]=arr_items[i-1];
            }
            arr_items[index]=item;
            counter++;
        }
    }

    void delete_last_item(){
        
        /*arr_items[counter-1]=0;
        counter--;
        دا لو عايزة امسح اخر عنصر والاراي تفضل بنفس ال length*/

        int []newarr=new int[counter-1];
        for(int i=0;i<counter-1;++i){
            newarr[i]=arr_items[i];
        }
        arr_items=newarr;
        counter--;
    }
    void delete_specific_item(int index){
        for(int i=index;i<counter-1;++i){
            arr_items[i]=arr_items[i+1];
        }
        arr_items[counter-1]=0;
        counter--;
    }

    void large_array(int size){


        
        int []newarr=new int[size];
        for(int i=0;i<counter;++i){
            newarr[i]=arr_items[i];
        }
        arr_items=newarr;
    }
}