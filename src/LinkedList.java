public class LinkedList<T> {

    private Node head;

    private void insert(T data){
        Node<T> temp = new Node<T>(data);
        temp.setLink(head);
        head = temp;
    }
    private void print(){
        Node<T> temp = head;
        while (temp!=null){
            System.out.print(temp.getData()+"->");
            temp = temp.getLink();
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(6);
        list.insert(8);
        list.insert(9);

        list.print();

    }
}
