package Sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static Sort.BucketSort.bucketSort;
import static Sort.BucketSort.check;
import static org.junit.Assert.*;

public class BucketSortTest {

    int [] tab;

    @Before
    public void setUp() throws Exception {
        tab = new int[100];
        Random rand = new Random();
        for(int i = 0; i<tab.length; i++){
            tab[i] = rand.nextInt(200);
        }
    }

    @Test
    public void bucketSortTest() {
        for(int i = 0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
        System.out.println("=============================");
        int [] tabs = bucketSort(tab);
        for(int i = 0; i<tabs.length; i++){
            System.out.println(tabs[i]);
        }
        assertTrue(check(tabs));
    }
}