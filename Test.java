/**
 * Created by user on 27/03/22.
 */
public class Test {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.push(12);
        ll.push(29);
        ll.push(10);
        ll.push(23);
        ll.push(7);
        System.out.println(ll.findSecondLastNode(ll.start));
    }
}
