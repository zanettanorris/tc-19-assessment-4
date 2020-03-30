package rocks.zipcode.io.assessment4.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Integer counter = 0;
        for (int i = 0; i< array.length; i++)
            if ((getNumberOfOccurrences(array[i]))%2 ==1)
                return array[i];
        return null;}

    public SomeType findEvenOccurringValue() {
        Integer counter = 0;
        for (int i = 0; i< array.length; i++)
            if ((getNumberOfOccurrences(array[i]))%2 ==0)
        return array[i];
    return null;}


    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == valueToEvaluate){counter++;}
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
