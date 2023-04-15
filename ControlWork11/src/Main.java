import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> result = new ArrayList<>();
        Pattern p = Pattern.compile("\\b[0-9]+\\b");
        Matcher m;
        Scanner scan = new Scanner(new File("C:\\Java\\java\\ControlWork11\\src\\file1"));
        FileWriter writer = new FileWriter(new File("C:\\Java\\java\\ControlWork11\\src\\file2"));

        while (scan.hasNextLine()) {
            m = p.matcher(scan.nextLine());
            while (m.find()) {
                result.add(Integer.parseInt(m.group()));
            }
        }

        for (Integer item : result) {
            writer.write(item + " ");
        }
        writer.flush();

    }
}