package Server021221;

import org.json.simple.JSONArray;

import java.io.*;
import java.util.Scanner;

/**
 * This class handles server.Matrix-related tasks
 */
public class JsonHandler implements IHandler {
    private volatile boolean doWork = true;

    @Override
    public void resetMembers() {
        this.doWork = true;
    }

    @Override
    public void handle(InputStream fromClient, OutputStream toClient) throws IOException, ClassNotFoundException {
        /*
        Send data as bytes.
        Read data as bytes then transform to meaningful data
        ObjectInputStream and ObjectOutputStream can read and write both primitives and objects
         */
        ObjectInputStream objectInputStream = new ObjectInputStream(fromClient);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(toClient);

        boolean doWork = true;
        // handle client's tasks as long as doWork = true
        while (doWork) {
            JSONArray jsonTransferred = (JSONArray) objectInputStream.readObject();
            Scanner in = new Scanner(System.in);
            System.out.println(jsonTransferred.toJSONString()); // Prints Json to the console
            doWork = false;
        }
    }


}
