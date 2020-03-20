package escuelaing.arep.spark;

import static spark.Spark.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Spark {

    public static void main(String[] args) {
       
        getPort();
        staticFiles.location("/public");
        get("/api/v1/math/square", (req, res) -> {
            String value = req.queryParams("value");
            String square = javaClient(value);
            return square;
        });

        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });
    }

    static String javaClient(String value) throws MalformedURLException {
        URL lambda = new URL("https://e4zmb8p2gj.execute-api.us-east-1.amazonaws.com/Beta?value=" + value);
        String inputLine = null;
        String res = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(lambda.openStream()))) {
            while ((inputLine = reader.readLine()) != null) {
                res += inputLine;
            }
        } catch (IOException ex) {
            Logger.getLogger(Spark.class.getName()).log(Level.SEVERE, "Not data get", ex);
            System.err.println(ex);
        }
        return res;
    }

    /**
     * @return retorna un puerto disponible para correr la aplicacion
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
