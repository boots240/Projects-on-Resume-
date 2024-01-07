package emergencyroomdemo;

import java.util.Comparator;
import java.util.Random;


public class HeapDemo 
{
    public static void main(String[] args) 
    {
       Comparator<Integer> integerComparator = Comparator.naturalOrder();

      Heap<Integer> Heap = new Heap<>(integerComparator);
        for (int i = 0; i < 20; i++) 
        {
            int num = new Random().nextInt(100);
            System.out.print(num + " ");
            Heap.add(num);
        }
        
        System.out.println();

        for (Integer num = Heap.remove(); num != null; num = Heap.remove()) 
        {
          System.out.print(num + " ");
        }
    }


    
}
