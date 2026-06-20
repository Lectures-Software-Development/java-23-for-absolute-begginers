package data_types.strings;

public class SimpleStringDemo2 {
    public static void runSimpleStringDemo() {
        String text1 = null;

        String text21 = "two";
        String text22 = "two";

        if(text21 == text22){
            IO.println("Equal References");
        }else {
            IO.println("Different References");
        }

        if(text21.equals(text22)){
            IO.println("Equal Objects");
        } else {
            IO.println("Different Objects");
        }
    }
}
