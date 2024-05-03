package Coding_ninjas.linkedlist;

import java.util.ArrayList;

public class arraylistdemo {
    public static void main(String[] args) {
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<String>list3=new ArrayList<>();
        list2.add(7);
        list2.add(4);
        list2.add(10);
        list2.add(6);
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+" ");
        }
        System.out.println();
        // adding element at particular index
        list2.set(1, 80);
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+" ");
        }
        System.out.println();
        for(int element:list2){
            System.out.print(element+" ");
        }
    }
    
}
