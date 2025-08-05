/*
TreeSet
Maintains natural sorted order (alphabetical, numeric)
Internally backed by Red-Black Tree
Implements NavigableSet, SortedSet 
*/
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args){
        Set<String> set = new TreeSet<>();

        //add
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Apple");
        System.out.println("Treeset elements : "+set);

        //navigation methods
        System.out.println("First: "+((TreeSet<String>) set).first());
        System.out.println("Last: "+((TreeSet<String>) set).last());

        //iterating
        System.out.println("Iterating set");
        for(String f:set){
            System.out.println(f);
        }
    }
}
