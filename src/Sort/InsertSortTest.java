package Sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static Sort.InsertSort.check;
import static Sort.InsertSort.insertSort;
import static org.junit.Assert.*;

public class InsertSortTest {

    int [] tab;

    @Before
    public void setUp() throws Exception {
        tab = new int[111];
        Random rand = new Random();
        for(int i = 0; i<tab.length; i++){
            tab[i] = rand.nextInt(200);
        }
    }

    @Test
    public void insertSortTest() {
        for(int i = 0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
        System.out.println("=============================");
        tab = insertSort(tab);
        for(int i = 0; i<tab.length; i++){
            System.out.println(tab[i]);
        }

        assertTrue(check(tab));
    }
}