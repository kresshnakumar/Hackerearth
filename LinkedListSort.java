import java.util.Scanner;

class Node {
    private int data;
    private Node node;
    public Node(data,node) {
        this.data = data;
        this.node = node;
    }
    public int getData() {
        return data;
    }
    public Node getNext() {
        return node;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setNext(Node node) {
        this.node = node;
    }
}
class LinkedList{
    private Node start;
    private Node end;
    private int size;
    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }
    public void insertElement(int element) {
        Node node = new Node(element,null);
        if(start == null) {
            start = node;
            end = start;
            size++;
        }
        else {
            end.setAddress(node);
            end = node;
            size++;
        }
    }
    public void sort() {
        if (start == null) {
            return;
        }
        else{
            int count = 1;
            Node temp = start;
            while (temp.getNext() != null) {
                count++;
                temp = temp.getNext();
            }
            int mid = count / 2;
            mergeSort(start , 1,mid);
            mergeSort()
        }
    }
}
public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner input = new Scanner(System.in);
        int len = Integer.parseInt(input.nextLine());
        for (int i = 0; i < len ;i++ ) {
            ll.insertElement(Integer.parseInt(input.nextLine()));
        }
        ll.sort();
    }
}