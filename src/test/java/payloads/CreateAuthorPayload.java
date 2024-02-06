package payloads;

import utils.ConfigurationReader;
import utils.RandomDataGenerator;
import utils.RandomDataTypeNames;

import java.util.HashMap;
import java.util.Map;

public class CreateAuthorPayload {


    public static Map<String, Object> getCreateAuthorPayloadFromMap()
    {
      String id = String.valueOf(Integer.parseInt(ConfigurationReader.get("id"))+1);
      String idBook = String.valueOf(Integer.parseInt(ConfigurationReader.get("id"))+1);

        Map<String, Object> payload = new HashMap<>();
        payload.put("id", id);
        payload.put("idBook", idBook);
        payload.put("firstName", RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.FIRSTNAME));
        payload.put("lastName", RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.LASTNAME));

        ConfigurationReader.set("id",id);
        ConfigurationReader.set("idBook",idBook);

        return payload;
    }


}
