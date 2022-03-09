package Server021221;

import org.json.simple.JSONObject;

import java.io.File;

public class main {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        File f = new File("JSONtest.json");
        boolean is = f.canRead();

        System.out.println(is);
    }
}
