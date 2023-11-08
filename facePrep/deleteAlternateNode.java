import java.util.*;
class Main
{
  Node head=null;
  Node temp=null;
  class Node{
    int data;
    Node next;
    Node(int n){
      this.data=n;
      this.next=null;
    }
  }
  void insert(int n)
  {
    Node nn=new Node(n);
    if(head==null)
    {
      head=nn;
      temp=nn;
    }
    else
    {
      temp.next=nn;
      temp=nn;
    }
  }
  void display(){
   Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
  void deleteAlternate()
  {
      Node prev=head;
      Node curr=head.next;
      while(prev.next != null && curr.next != null )
      {
          prev.next=curr.next;
          prev=curr.next;
          curr=prev.next;
      }if(curr.next==null){prev.next=null;}
  }
  public static void main(String args[])
  {
    Main o = new Main();
    Scanner sc = new Scanner(System.in);
    while(true)
    {
      int n = sc.nextInt();
      if(n<0)
        break;
        o.insert(n);

    }
    o.display();
    System.out.println("After alternate deletion:");
    o.deleteAlternate();
    o.display();
  }
}
