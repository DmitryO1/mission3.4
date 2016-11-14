import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by Dmitry on 11.11.2016.
 */
public class InsertionSortTest {
    InsertionSort insertionSort = new InsertionSort();
    @Test//Positive #1
    public void InsertionSortUnsortedList(){
    assertArrayEquals(new int[]{0,1,2,3,4}, insertionSort.insertSort(new int[]{4,3,2,1,0}));
        System.out.println("Positive test has been passed '#1'");
    }
    @Test//Positive #2
    public void InsertionSortSortedList(){
        assertArrayEquals(new int[]{0,1,2,3,4}, insertionSort.insertSort(new int[]{0,1,2,3,4}));
        System.out.println("Positive test has been passed '#2'");
    }
    @Test(expected = AssertionError.class)//Negative #1
    public void InsertionSortFromLength(){
        assertArrayEquals(new int[]{0,1,2,3,4}, insertionSort.insertSort(new int[]{0,1,2,3,4,5}));
    }
    @Test(expected = AssertionError.class)//Negative #2
    public void InsertionSortWithNull(){
        assertArrayEquals(new int[]{0,1,2,3,4}, insertionSort.insertSort(new int[]{}));
    }


}
/////////////////////
