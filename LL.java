class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
     // add node at first position
        public void addfirst(String data){
            Node newNode=new Node(data);       
        if(head==null){
        head=newNode;
        return;
        }
        newNode.next=head;
        head=newNode; 
    }
    // add node at the last position
    public void addlast(String data){
          Node newNode=new Node(data);       
        if(head==null){
        head=newNode;
        return;
        }
       Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print list
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    // delete the element at first
    public void delfirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
    }
    // delete the element at last
    public void dellast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next; 
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
           
        }
        secondLast.next=null;   
    }

    // main method
    public static void main(String args[]){
     LL list=new LL();
    list.addfirst("a");
    list.addfirst("is");
    list.printlist();
    list.addlast("list");
    list.printlist();
    list.addfirst("this");
    list.printlist();
    list.delfirst();
    list.printlist();
    list.dellast();
    list.printlist();
    }
    
}