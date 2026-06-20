import data_types.wrapper_classes.Date.NewCalendarDateDemo;
import data_types.wrapper_classes.collections.CollectionsBasicDemo;
import data_types.wrapper_classes.collections.GenericListDemo;
import data_types.wrapper_classes.collections.MapDemo;
import data_types.wrapper_classes.collections.SetDemo;
import data_types.wrapper_classes.threads.ListJvmThreadsDemo;
import data_types.wrapper_classes.threads.MultipleUserThreadsDemo;


/*@FunctionalInterface
interface Operation {
    int execute(int a, int b);
}

class AdditionFunctionalInterfaceDemo implements Operation {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}*/


public class Main {
    public static void main(String[] args) {
        /*MusicianImpl moses = new MusicianImpl(
            "moses",
            30,
            1.75f,
            Gender.MALE,
            "Namasagali University",
            "Afrobeat",
            List.of("Song 1", "Song 2", "Song 3")
        );

        System.out.println(Arrays.toString(moses.getSongs().toArray()));*/

        //IO.println("The time to live is: " + moses.getTimeToLive());

       /* for (Gender value : Gender.values()) {
            IO.println(value.name() + ": " + value.getClass());
            System.out.println("\tcomment: " + value.comment());
        }*/

        /*if(moses.isCreative())
            moses.isCreative();

        HumanRecord john = new HumanRecord("John Myers", 47, 1.9f, Gender.FEMALE);

        System.out.println("John as string" + john);
        System.out.println("John's as hashcode" + john.hashCode());
        System.out.println("John's as name: " + john.name());
        System.out.println("John's as age: " + john.age());*/

        /**
         * Functional Interface Demo
         * *******************************************/
       /* AdditionFunctionalInterfaceDemo addition = new AdditionFunctionalInterfaceDemo();

        int result = addition.execute(5, 8);
        System.out.println("Result of addition: " + result);

        *//*Implement on the spot using a lambda expression*//*
        Operation addition2 = (a, b) -> a + b;
        int result2 = addition2.execute(10, 15);
        System.out.println("Result of addition using lambda: " + result2);*/


        /**
         * Generics
         * **************************************/
        //GenericsDemo.runGenericsDemo();

        /**
         * Data Types
         **********************************************/

        //AnotherPrimitiveDemo.runAnotherPrimitiveDemo();

        //IntContainerDemo.runIntContainerDemo();

        //ReferencesSwapDemo.runReferencesSwapDemo();

        // BooleanConvertProcessDemo.runBooleanConvertProcessDemo();

        //CharListerDemo.runCharListerDemo();
        //NumericDemo.runNumericDemo();

        //ArrayDemo.runArrays();

        // PerformerArrayDemo.runPerformerArrayDemo();
//        MatrixDemo.runMatrixDemo();
        //CubeDemo.runCubeDemo();

        // SimpleStringDemo.runSimpleStringDemo();

        //ArrayUtilitiesDemo.runArrayUtilitiesDemo();


        //PsuedoTemplatesDemo.runPsuedoTemplatesDemo();

        //WrapperDemo.runWrapperDemo();
        //DateDemo.runDateDemo();

        //PrintDateDemo.runPrintDateDemo();

        //CalendarDateDemo.runCalendarDateDemo();

        //NewCalendarDateDemo.runNewCalendarDateDemo();

        //CollectionsBasicDemo.runCollectionBasicDemo();

        //GenericListDemo.runGenericListDemo();

        //SetDemo.runSetDemo();

        //MapDemo.runMapDemo();

        //ListJvmThreadsDemo.runListJvmThreadsDemo();

        //MultipleUserThreadsDemo.main();

        
    }
}
