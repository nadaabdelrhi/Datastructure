
public class BST_code{

    class node{
        int value;
        node left,right;
        node(int key){
            value =key;
        }
    }
    node root;
    BST_code(){
        root=null;
    }
    node insert(node root,int data){
    if(root==null) return new node(data);
        if(data<root.value) root.left=insert(root.left,data);
        else root.right=insert(root.right,data);
        return root;
    }
    boolean search(node root,int data){
        if(root==null) return false;
        if(root.value==data) return true;
        if(data<root.value) return search(root.left,data);
        else return search(root.right,data);
    }
    void preorder(node root){
        if(root==null) return;
        System.out.print(root.value);
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.value);
        inorder(root.right);
    }
    void postorder(node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value);
    }
    node min(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    node delete(node root,int data){
        if(root==null) return null;
        if(data <root.value) root.left=delete(root.left,data);
        else if(data> root.value) root.right=delete(root.right,data);
        else{
            if(root.right==null && root.left==null) return null;
            else if(root.right==null) return root.left;
            else if(root.left ==null) return root.right;
            else{
                node temp=min(root.right);
                root.value=temp.value;
                root.right=delete(root.right,temp.value);
            }
        }
        return root;
    }
}