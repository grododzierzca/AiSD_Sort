package Sort;

import BinSearch.BinSearch;

import java.util.Random;


import static Sort.BucketSort.bucketSort;

public class Main {
    public static void main(String [] args){

        int [] tab = new int[5000000];
        Random rand = new Random();
        for(int i = 0; i<tab.length; i++){
            tab[i] = rand.nextInt(Integer.MAX_VALUE);
        }

        long startTime = System.currentTimeMillis();

        int [] tabs = bucketSort(tab);

        long stopTime = System.currentTimeMillis();
        long elapsed = stopTime - startTime;


        System.out.println("Sorting took: "+elapsed+"ms...");

        //for(int in: tabs){
        //    System.out.println(in);
        //}

        BinSearch bins = new BinSearch(tabs);

        for(int i = 0; i<1; i++){
            int num = rand.nextInt(Integer.MAX_VALUE);
            System.out.println("Does the list contain number: "+num+"? -> "+ bins.bins(num));
        }


    }
}
