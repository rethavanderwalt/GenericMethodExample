
package genericmethodexample;


public class GenericMethodExample {

    public static void main(String[] args) {
        Integer[] ints = {10, 20, 30 , 40, 50 , 60 , 70, 80};
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", 
                                "Thursday", "Friday", "Saturday", "Sunday"};
    
        print(ints);
        print(daysOfTheWeek);
        System.out.println(countGreaterThan(ints, 50));
    }
    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem){
        int count = 0;
        for(T element:list){
            if (element.compareTo(elem) > 0){
                count++;
            }
        }
        return count;
    }
    
    public static <E> void print(E[] list) 
    {
        for(E element:list){
            System.out.print(element + " ");
        }
            System.out.println("");
    }
    
}
