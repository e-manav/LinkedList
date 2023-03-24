import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Shahdol");
        placesToVisit.add(0,"Barhi");
        addPlaces(placesToVisit);
        System.out.println(placesToVisit);
        getElement(placesToVisit);
}

    private static void addPlaces(LinkedList<String> list ){
        list.addFirst("Katni");
        list.addLast("Jagua");
        //Queue methods
        list.offer("Burhar");
        list.offerFirst("Oslo");
        list.offerLast("Denmark");
        //Stack methods
        list.push("Piparia");
    }

    private static void removePlaces(LinkedList<String> list){
        list.remove(4);
        list.remove("Katni");
        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " Is removed");
        String s2 = list.removeFirst();//removes first element
        System.out.println(s2 + " Is removed");
        String s3 = list.removeLast();//removes last element
        System.out.println(s3 + " Is removed");
        //Queue/dequeue or polls methods
        String p1 = list.poll();//removes first element
        System.out.println(p1 + " Is removed");
        String p2 = list.pollFirst();//removes first element
        System.out.println(p2 + " Is removed");
        String p3 = list.pollLast();//removes last element
        System.out.println(p3 + " Is removed");
        //Stack methods
        list.push("Shahdol");
        list.push("Burhar");
        list.push("Barhi");

        list.pop();
    }

    private static void getElement(LinkedList<String> list){
        System.out.println("5th Element = " + list.get(4) );
        System.out.println("1th Element = " + list.getFirst() );
        System.out.println("Last Element = " + list.getLast() );
        System.out.println("Index of  Shahdol = " + list.indexOf("Shahdol") );
        System.out.println("Index of  Denmark = " + list.lastIndexOf("Denmark") );
        //Queue retrieval methods
        System.out.println("Element from element() = "+list.element());
        //Stack retrieval methods
        System.out.println("Element form peak() = "+list.peek());
        System.out.println("Element form peakFirst()= "+list.peekFirst());
        System.out.println("Element form peakLast()= "+list.peekLast());
    }
}