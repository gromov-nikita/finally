package Filter;
import java.util.LinkedList;
import java.util.List;

public class Filter<T> {
    public T[] filter(T[] arr, IFilter filt) {
        List<T> newArray = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            if(filt.filter(arr[i])) {
                newArray.add(arr[i]);
            }
        }
        return (T[]) newArray.toArray();
    }
}
