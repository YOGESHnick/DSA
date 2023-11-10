import java.util.*;
class Main
{
    Node head = null;
    Node temp = null;
    class Node{
        int data;
        Node next;
        Node(int n){
            this.data = n;
            this.next = null;
        }
        
    }
    void push(int n){
        Node nn = new Node(n);
        if(head == null){
            head = nn;
            temp = nn;
        }
        else{
            temp.next = nn;
            temp = nn;
        }
    }
    void pop(){
        Node curr=head.next;
        Node prev=head;
        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        System.out.println(curr.data);
    }
    void display(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    void size(){
        int s = 0;
        Node temp = head;
        while(temp!=null){
            s= s+1;
            temp = temp.next;
        }
        System.out.println(s);
    }
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		Main obj = new Main();
	    while(true)
	    {
	            String s = sc.nextLine();
	            if(s.equals("push"))
	            {
	                int e = sc.nextInt();
	                obj.push(e);
	            }
	            else if(s.equals("pop"))
	            {
	                obj.pop();   
	           
	            }
	            else if(s.equals("exit"))
	            {
	                break;
	            }
	            
	        
	    }
	    obj.display();
	    obj.size();
	    
	}
}
