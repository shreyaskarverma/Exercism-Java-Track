import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    private List<T> list;
    SimpleLinkedList() {
        list= new LinkedList<>();
    }

    SimpleLinkedList(T[] values) {
        list= new LinkedList<>();
        int size= values.length;
        for(int i=0;i< size ;i++) {
            list.add(values[i]);
        }
    }

    void push(T value) {
        list.add(value);
    }

    T pop() {
        if(list.isEmpty())
            throw new NoSuchElementException();
        return (list.remove(list.size()-1));
    }

    void reverse() {
        List<T> temp = new LinkedList<>();
        int size=list.size();
        while(size !=0)
        {
            temp.add(list.remove(size-1));
            size--;
        }
        list=temp;
    }

    T[] asArray(Class<T> clazz) {
        int size= list.size();
        Object arr= Array.newInstance(clazz,size);
        for(int i=0;i<size;i++)
        {
            Array.set(arr,i,list.get(size-i-1));
        }
        return (T[]) arr;
    }

    int size() {
        return list.size();
    }
}
