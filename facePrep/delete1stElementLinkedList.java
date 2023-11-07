import java.util.*;
class Main
{
  Node head=null;
  Node temp=null;
  class Node{
    int data;
    Node next;
    Node(int n)
    {
      this.data=n;
      this.next=null;
    }
  }
  void ins(int n)
  {
    Node nn = new Node(n);
    if(head==null){
      head=nn;
      temp=nn;
    }
    else{
      temp.next=nn;
      temp=nn;
    }
  }
  void delete(){head=head.next;}
  void dis(){
    Node temp=head;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
  public static void main(String args[])
  {
    Main o = new Main();
    Scanner sc = new Scanner(System.in);
    while(true)
    {
      int n=sc.nextInt();
      if(n<0)
        break;
      else{
        o.ins(n);
      }
    }o.delete();
    o.dis();
  }
}
