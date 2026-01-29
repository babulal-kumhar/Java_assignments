package Assignment3.q1;
import java.util.*;

class ListSum{
    public static void main(String[]args){
        List<Float> list=new ArrayList<>();

        list.add(2.5f);
        list.add(4.0f);
        list.add(3.5f);
        list.add(1.5f);
        list.add(6.0f);

        Iterator<Float> it=list.iterator();
        float sum=0;

        while(it.hasNext()){
            sum+=it.next();
        }

        System.out.println("Sum of elements: "+sum);
    }
}
