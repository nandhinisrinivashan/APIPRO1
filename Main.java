//package DogCEO;
//import java.net.HttpURLConnection;
//import java.net.URL;
//public class Main {
//    public static void main(String[] args) {
//        // API:  https://dog.ceo/api/breeds/image/random
//        String apiurl="https://dog.ceo/api/breeds/image/random";
/// / try accessing the API
//        try{
//// there is url class
//            URL url1=new URL(apiurl);
//            //http connection class and creating object
//            HttpURLConnection connection=(HttpURLConnection)url1.openConnection();
//            // using connnection stablish get
//            connection.setRequestMethod("GET"); // this is http connection request
//
//            // creat variable to hold response code
//            int responseCode=connection.getResponseCode();
//            if(responseCode==200){
//                System.out.println("HTTP 200 OK - success response is returned");
//            }
//            else{
//                System.out.println("request failed");
//            }
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//}
//





//package org.example;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main
//{
//    public static void main(String[] args)
//    {
////        https://dog.ceo/api/breeds/image/random
//          String apiUrl="https://dog.ceo/api/breeds/image/random";
//try
//{
//    URL url = new URL(apiUrl);
//    HttpURLConnection connection=(HttpURLConnection) url.openConnection();
//    connection.setRequestMethod("GET");
//    int responseCode=connection.getResponseCode();
//    if(responseCode==200)
//    {
//   System.out.println("HTTP 200 OK-Success response is returned "+connection.getResponseMessage());
//    }
//    else
//    {
//    System.out.println("request failed ");
//    }
//
//}
//catch(Exception e){
//    System.out.println(e.getMessage());
//
//}
//    }
//    }






//buffered reader
//package org.example;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class Main {
//    private static String extractImageUrl(String json)
//    {
//        return null;
//    }
//    public static void main(String[] args) {
//        // API endpoint
//        String apiUrl = "https://dog.ceo/api/breeds/image/random";
//
//        try {
//            // Step 1: Create URL object
//            URL url = new URL(apiUrl);
//
//            // Step 2: Open connection
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//            // Step 3: Set request method to GET
//            connection.setRequestMethod("GET");
//
//            // Step 4: Get response code (200 means OK)
//            int responseCode = connection.getResponseCode();
//
//            if (responseCode == 200) {
//                // Step 5: Read the response
//                BufferedReader br = new BufferedReader(
//                        new InputStreamReader(connection.getInputStream()));
//
//                StringBuilder response = new StringBuilder();
//                String line;
//
//                while ((line = br.readLine()) != null) {
//                    response.append(line);
//                }
//
//                br.close();
//
//                String json=response.toString();
//                String imageUrl=extractImageUrl(json);
//                System.out.println("Dog image url"+imageUrl);
//                System.out.println("JSON"+json);
//
//                System.out.println("index"+json.indexOf("message"));
//                System.out.println("index"+json.indexOf("{"));
//            }
//            else
//            {
//                System.out.println("Request failed. " );
//            }
//
//            // Step 7: Disconnect after use
//            connection.disconnect();
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}




//package org.example;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class Main {
//    private static String extractImageUrl(String json)
//    {
//        int start = json.indexOf("{")+12;
//        int end = json.indexOf("\"", start);
//       if(start<12||end==-1)
//           return "could not parse this link...";
//       return json.substring(start, end).replace("\\/","/");
//    }
//    public static void main(String[] args) {
//        // API endpoint
//        String apiUrl = "https://dog.ceo/api/breeds/image/random";
//
//        try {
//            // Step 1: Create URL object
//            URL url = new URL(apiUrl);
//
//            // Step 2: Open connection
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//            // Step 3: Set request method to GET
//            connection.setRequestMethod("GET");
//
//            // Step 4: Get response code (200 means OK)
//            int responseCode = connection.getResponseCode();
//
//            if (responseCode == 200) {
//                // Step 5: Read the response
//                BufferedReader br = new BufferedReader(
//                        new InputStreamReader(connection.getInputStream()));
//
//                StringBuilder response = new StringBuilder();
//                String line;
//
//                while ((line = br.readLine()) != null) {
//                    response.append(line);
//                }
//
//                br.close();
//
//                String json=response.toString();
//                String imageUrl=extractImageUrl(json);
//                System.out.println("Dog image url"+imageUrl);
//                System.out.println("JSON"+json);
//
//                System.out.println("index"+json.indexOf("message"));
//                System.out.println("index"+json.indexOf("{"));
//            }
//            else
//            {
//                System.out.println("Request failed. " );
//            }
//
//            // Step 7: Disconnect after use
//            connection.disconnect();
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}





//it will open the image
//package org.example;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//public class Main {
//    // act as staff
//    private static String extractImageUrl(String json) {
//        int start= json.indexOf("{") + 12;
//        int end= json.indexOf("\"", start);
//
//        if(start<12 || end == -1)
//            return "could not parse this link..";
//
//        return json.substring( start,end).replace("\\/","/");
////System.out.println("end" + end);
////        return null;
//    }
//    public static void main(String[] args) {
//
//        // API:  https://dog.ceo/api/breeds/image/random
//        String apiurl="https://dog.ceo/api/breeds/image/random";
//// try accessing the API
//        try{
//// there is url class
//            URL url1=new URL(apiurl);
//            //http connection class and creating object
//            HttpURLConnection connection=(HttpURLConnection)url1.openConnection();
//            // using connnection stablish get
//            connection.setRequestMethod("GET"); // this is http connection request
//
//            // creat variable to hold response code
//            int responseCode=connection.getResponseCode();
//            if(responseCode==200){
////                System.out.println("HTTP 200 OK - success response is returned" + connection.getResponseMessage());
////                System.out.println("HTTP 200 OK - success response is returned" + connection.getInputStream());
//                // read
//                BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                // read full entire json
//                StringBuilder response=new StringBuilder();
//                String line;
//                while((line=reader.readLine())!=null){
//                    response.append(line);
//                }
//                reader.close();
//
////System.out.println(response.toString());
//                String json=response.toString();
//                // extracting the url
//                String imageURL= extractImageUrl(json);
//                System.out.println("dog image url :" +imageURL);
//                System.out.println(" json  message index"+ json.indexOf(" \" " ));
//
//
//            }
//            else{
//                System.out.println("request failed");
//            }
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//}

//package org.example;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import org.json.JSONObject;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    private static String extractimageurl(String json){
//        int start = json.indexOf("{") + 12;
//        int end = json.indexOf("/", start);
//
//        if(start < 12 || end == -1)
//            return "Could not parse this link....";
//
//
//
//        return json.substring(start, end).replaceAll("\"", "");
//    }
//    static void main() {
//        // https://dog.ceo/api/breeds/image/random
//        String apiurl = "https://dog.ceo/api/breeds/image/random";
//        try{
//            URL urlObj = new URL(apiurl);
//            HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
//            con.setRequestMethod("GET");
//
//            int responseCode = con.getResponseCode();
//            if(responseCode == 200){
//                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//                StringBuilder response = new StringBuilder();
//                String line;
//                while ((line = in.readLine()) != null) {
//                    response.append(line);
//                }
//                in.close();
//
//                JSONObject obj = new JSONObject(response.toString());
//                String imageurl = obj.getString("message");
//
//                System.out.println("Random Dog Image:" +imageurl);
//
//            }
//            else{
//                System.out.println("HTTP 200 NOT OK - failure Response is returned");
//            }
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//}


//// Main class
//package org.example;
//import com.google.gson.Gson;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//// Class to map JSON response
//class DogResponse {
//    String message;
//    String status;
//}
//
//// Class to fetch random dog image
//class FetchMultipleDogImages {
//    private String url = "https://dog.ceo/api/breeds/image/random";
//    private Gson gson = new Gson();
//
//    // Method to fetch random dog image URL
//    public String fetchRandomImage() {
//        try {
//            URL urlObj = new URL(this.url);
//            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
//            connection.setRequestMethod("GET");
//            connection.setConnectTimeout(5000);
//            connection.setReadTimeout(5000);
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder response = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//
//            // Parse JSON response using Gson
//            DogResponse dogData = gson.fromJson(response.toString(), DogResponse.class);
//            return dogData.message;
//
//        } catch (Exception e) {
//            System.out.println("Error fetching image: " + e.getMessage());
//            return null;
//        }
//    }
//}
//
//// Main class
//public class Main {
//    public static void main(String[] args) {
//        FetchMultipleDogImages fetcher = new FetchMultipleDogImages();
//
//        for (int i = 1; i <= 5; i++) {
//            String imageUrl = fetcher.fetchRandomImage();
//            if (imageUrl != null) {
//                System.out.println("Image " + i + ": " + imageUrl);
//            } else {
//                System.out.println("Image " + i + ": cannot be fetched");
//            }
//        }
//    }
//}
//
//
