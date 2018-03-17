package Sort;

import java.util.ArrayList;

public class SelectSort {

    public static void selectSort(ArrayList<Integer> tab){

        for(int i = 0; i<tab.size(); i++){
            int min = i;
            for(int j = min+1; j<tab.size(); j++){
                if(tab.get(j)<tab.get(min)){
                    min = j;
                }
            }
            int temp = tab.get(i);
            tab.set(i, tab.get(min));
            tab.set(min, temp);
        }

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
