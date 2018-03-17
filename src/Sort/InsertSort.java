package Sort;

import java.util.LinkedList;

public class InsertSort {

    public static int[] insertSort(int [] tab){
        LinkedList<Integer> newtab = new LinkedList<>();
        newtab.addFirst(tab[0]);
        for(int i =1; i<tab.length; i++){
            int j = 0;
            if(tab[i]>newtab.get(j)){
                while(j<newtab.size() && newtab.get(j)<tab[i]){
                    j++;
                }
                newtab.add(j, tab[i]);
            }else if(tab[i] <= newtab.iterator().next()){
                newtab.addFirst(tab[i]);
            }
        }
        int [] tab2 = new int[tab.length];
        for(int i = 0; i<tab2.length; i++){
            tab2[i] = newtab.get(i);
        }
        return tab2;
    }

    public static boolean check(int [] tab){
        for(int i = tab.length-1; i>1; --i){
            if(tab[i]<tab[i-1]){
                return false;
            }
        }
        return true;
    }


}
