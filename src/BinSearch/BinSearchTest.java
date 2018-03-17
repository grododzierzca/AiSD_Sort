package BinSearch;

import org.junit.Before;
import org.junit.Test;
import BinSearch.*;

import static org.junit.Assert.*;

public class BinSearchTest {

    BinSearch bin1, bin2;

    int [] tab;
    int [] tabs;

    @Before
    public void setUp() throws Exception {
        tab = new int[10];
        for(int i = 0; i<10; i++){
            tab[i] = i;
        }
        tabs = new int[11];
        for(int i = 0; i<11; i++){
            tabs[i] = i;
        }
        bin1 = new BinSearch(tab);
        bin2 = new BinSearch(tabs);
    }

    @Test
    public void binstest() {
        assertTrue(bin1.bins(1));
        assertTrue(bin1.bins(9));
        assertFalse(bin1.bins(11));
        bin1.add(666);
        assertTrue(bin1.bins(666));

        assertTrue(bin2.bins(2));
        assertTrue(bin2.bins(5));
        assertFalse(bin2.bins(209));
        bin2.add(209);
        assertTrue(bin2.bins(209));
    }
}