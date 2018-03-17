package BinSearch;

import java.util.ArrayList;
import java.util.Arrays;

import static Sort.BucketSort.bucketSort;

public class BinSearch {

    private int [] list;
    private ArrayList<Integer> temps;

    public BinSearch(int [] list){
        this.list = list;
        this.temps = new ArrayList<>();
    }


    public boolean bins(int numb){

        int tabs[] = Arrays.copyOf(list, list.length+temps.size());
        int [] tab;
        if(temps.size()>0) {
            for (int i = list.length; i < list.length + temps.size(); i++) {
                tabs[i] = temps.get(0);
                temps.remove(0);
            }
            tab = bucketSort(tabs);
        }else{
            tab = tabs;
        }
        int mid = list[list.length/2];

        while(tab.length != 1 && mid != numb){
            if(numb>mid){
                tab = Arrays.copyOfRange(tab, tab.length/2, tab.length);
                mid = tab[(tab.length)/2];
            }
            if(numb<mid){
                tab = Arrays.copyOfRange(tab, 0, tab.length/2);
                mid = tab[(tab.length)/2];
            }
        }
        if(mid == numb) return true;
        else return false;
    }

    public void add(int a){
        temps.add(a);
    }


}
