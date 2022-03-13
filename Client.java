package Server021221;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        Socket socket = new Socket("127.0.0.1", 8010);
        System.out.println("client: Created Socket");

        ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream fromServer = new ObjectInputStream(socket.getInputStream());

        // Reads Json from file
        InputStream inputStream = new FileInputStream(new File("JSONtest.json"));

        // Parses the InputStream to JsonArray (Object)
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(
                new InputStreamReader(inputStream, "UTF-8"));

        // send the Json to server (over stream)
        toServer.writeObject(jsonArray);
    }

}

