package data_types.strings;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MultilineStringDemo {
    public static void runMultilineStringDemo() {
        //This statement extracts the newline characer specific to the operating system.
        String newLineCh = System.getProperty("line.separator");
        IO.println(newLineCh);

        // Method 1:
        String multiLineStr = "Line one of the text block" +
            newLineCh +
            "Line two the text block" +
            newLineCh +
            "last ine of the text block";

        //Method 2:
        multiLineStr = "Line oe of the text block"
            .concat(newLineCh)
            .concat("Line two of the text block")
            .concat(newLineCh)
            .concat("last ine of the text block");

        // Method 3: Using the String.join()
        multiLineStr = String.join("Line one of the textblock", newLineCh,"Line two of the textblock", newLineCh, "last ine of the textblock");

        //Method 4: Using StringBuffer
        multiLineStr = new StringBuffer("Line one of the text block")
            .append(newLineCh)
            .append("Line two of the text block")
            .append(newLineCh)
            .append("last ine of the text block")
            .toString();

        // Method 5: Using StringBuilder
        multiLineStr = new StringBuilder("Line one of the text block")
            .append(newLineCh)
            .append("Line two of the text block")
            .append(newLineCh)
            .append("last ine of the text block")
            .toString();


        // Method 6 : using a StringWriter instance
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("Line one of the text block");
        stringWriter.write(newLineCh);
        stringWriter.write("Line two of the text block");
        stringWriter.write(newLineCh);

        // Using string writer with printerWriter
        stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("Line one of the text block");
        printWriter.println("Line two of the text block");
        printWriter.println("last ine of the text block");
        multiLineStr = stringWriter.toString();

        String multilineStr = """
            Line one of the text block
            Line two of the text block
            last ine of the text block
        """;
    }

}
