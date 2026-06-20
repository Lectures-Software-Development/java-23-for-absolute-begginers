package data_types.wrapper_classes.collections;

import basics.Gender;
import basics.PerformerImpl;
import data_types.arrays.PerformerArrayDemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionsBasicDemo {
    public static void runCollectionBasicDemo() {
        List<PerformerImpl> objList = new ArrayList<>();
        /*objList.add("Temp");
        objList.add(Integer.valueOf(5));*/
        objList.add(new PerformerImpl("John", 50, 1.9f, Gender.MALE));
        objList.add(new PerformerImpl("Fred", 50, 1.9f, Gender.MALE));

        for(var obj : objList) {
            if(obj  instanceof PerformerImpl) {
                IO.println("Performer name: " + ((PerformerImpl) obj).getName());
            }else {
                System.out.println(obj);
            }
        }
/*
        for(PerformerImpl obj : objList){
            System.out.println(obj.getName());
        }*/
    }
}
