package Sort;

import java.util.Random;


import static Sort.BucketSort.bucketSort;

public class Main {
    public static void main(String [] args){

        int [] tab = new int[1000000];
        Random rand = new Random();
        for(int i = 0; i<tab.length; i++){
            tab[i] = rand.nextInt(Integer.MAX_VALUE);
        }


        int [] tabs = bucketSort(tab);


        //for(int in: tabs){
        //    System.out.println(in);
        //}

        for(int i = 0; i<1; i++){
            int num = rand.nextInt(Integer.MAX_VALUE);
            System.out.println("Does the list contain number: "+num+"? -> ");
        }


    }
}
