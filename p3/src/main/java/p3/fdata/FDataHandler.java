package p3.fdata;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FDataHandler {
    private ArrayList<FDataDTO> reader() {
        ArrayList<FDataDTO> fDataDTOS = new ArrayList<>();

        try {
            File file = new File("file.json");
            Scanner reader = new Scanner(file);
            String jsonString = "";

            while(reader.hasNextLine()) {
                jsonString = jsonString + reader.nextLine();
            }

            JSONArray jsonArray = new JSONArray(jsonString);

            for (int i = 0; i< jsonArray.length(); i++) {
                JSONObject jo = (JSONObject) jsonArray.get(i);
                FDataDTO fDataDTO = new FDataDTO(jo.get("key").toString(), jo.get("val").toString());
                fDataDTOS.add(fDataDTO);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return fDataDTOS;
    }

    public String getKey(String key) {
        ArrayList<FDataDTO> fDataDTOS = this.reader();

        for (FDataDTO fDataDTO : fDataDTOS) {
            if (fDataDTO.key.equals(key)) {
                return fDataDTO.value;
            }
        }

        return "";
    }


}
