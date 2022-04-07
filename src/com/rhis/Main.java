package com.rhis;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    final static String outputFilePath = "output/district-map.txt";

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();

        int key = 0;
        for (String data : DataSets.disitrictArray) {
            JSONObject innerJsonObject = new JSONObject();
            innerJsonObject.put("district_code", DataSets.districtMappingWithCode.get(data));
            innerJsonObject.put("district_name", data);
            innerJsonObject.put("district_server", DataSets.serverEndpoints.get(data));

            jsonObject.put(String.valueOf(key++), innerJsonObject);
        }

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsonObject);

        System.out.println(jsonArray);

        File file = new File(outputFilePath);
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {
            String data = Base64.getEncoder().encodeToString(jsonArray.toString().getBytes(StandardCharsets.UTF_8));
            data = "Jr0Hx5s" + data;
            bf.write(data);
            bf.flush();

            System.out.println("File Created/Updated Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*File myObj = new File("output/district-map.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(myObj));
            String data = br.readLine();
            data = data.replaceFirst("Jr0Hx5s", "");

            byte[] bytes = Base64.getDecoder().decode(data);
            data = new String(bytes, StandardCharsets.UTF_8);

            JSONArray jsonArray2 = new JSONArray(data);
            JSONObject jsonObject2 = jsonArray2.getJSONObject(0);

            for (int i = 0; i < jsonObject2.length(); i++) {
                JSONObject object = jsonObject2.getJSONObject(String.valueOf(i));
                System.out.println(object.get("district_name"));
                System.out.println(object.get("district_server"));
                System.out.println(object.get("district_code"));
            }

            System.out.println(jsonObject2.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
