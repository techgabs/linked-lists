public class LinkedList<T> {

    private Node head;

    private void insertToBeginning(T data){
        Node<T> temp = new Node<T>(data);
        temp.setLink(head);
        head = temp;
    }
    private void insertToEnd(T data){

        Node<T> newNode = new Node<T>(data);
        if(head==null) { head = newNode;}
        else {
            Node temp = head;
            while (temp.getLink() != null) {
                temp = temp.getLink();
            }
            temp.setLink(newNode);
        }
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
        list.insertToEnd(2);
        list.insertToEnd(3);
        list.insertToEnd(6);
        list.insertToEnd(8);
        list.insertToEnd(9);

        list.print();

    }
}
