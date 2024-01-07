package emergencyroomdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class Heap<T extends Comparable<T>> {
    private final List<T> arr = new ArrayList<>();
    private final Comparator<T> comparator;
    
    
    
    public Heap(Comparator<T> comparator) 
    {
	this.comparator = comparator;
    }

    private int left(int i) 
    {
    return 2 * i + 1;
    }
    
    private int right(int i) 
    {
    return 2 * i + 2;
    }
    
    private int parent(int i) 
    {
    return i == 0 ? 0 : (i - 1) / 2;
    }
    
    private void swap(int i, int j)
    {
    T tmp = arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, tmp);
    }
    
    public void add(T element) 
    {
        arr.add(element);

        for (int i = arr.size() - 1; i > 0; i = parent(i))
        {
            if (arr.get(i).compareTo(arr.get(parent(i))) < 0)
            {
                swap(i, parent(i));
            }
            else 
            {
                break;
            }
        
        }
    }

    public T remove() 
    {

        if (arr.isEmpty())
        {
            return null;
        }

        T ret = arr.get(0);

        arr.set(0, arr.get(arr.size() - 1));
        arr.remove(arr.size() - 1);


        for (int i = 0; left(i) < arr.size();) 
        {
            int leastIdx = left(i);
            if (right(i) < arr.size() &&
            arr.get(left(i)).compareTo(arr.get(right(i))) > 0)
            {
                leastIdx = right(i);
            }
            if (arr.get(i).compareTo(arr.get(leastIdx)) > 0)
            {
                swap(i, leastIdx);
                i = leastIdx;
            } 
            else 
            {
                break;
            }
        }
        return ret;
    }
}