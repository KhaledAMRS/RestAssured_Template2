package fakerestapiTests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payloads.CreateAuthorPayload;
import utils.ConfigurationReader;
import utils.RestAPIHelper;

import java.util.HashMap;
import java.util.Map;

public class fakerestapi {

    @Test
    public void createFakerest()
    {
        // This code of line means: check if the system property "env" is set (has value or is not null),
            // if yes then assign its value to the variable env.
            // If it is not set (i.e., null), it defaults to assigning the value "qa" to the variable env.
        String env = System.getProperty("env") == null ? ConfigurationReader.get("env") : System.getProperty("env");
        //Note: System.getProperty("env") will get the value from      mvn test -Denv=beta

        String base_url = null;
        if (env.equalsIgnoreCase("prod"))
        {
            base_url = "fakerestapi";
        }
        else if (env.equalsIgnoreCase("beta"))
        {
            base_url = "beta-fakerestapi";
        }

        String endPoint =  "https://"+base_url+".azurewebsites.net/api/v1/Authors";
        Map<String, Object> payload = CreateAuthorPayload.getCreateAuthorPayloadFromMap();

        Response response = RestAPIHelper.performPost(endPoint,payload, new HashMap<>());

        Assert.assertEquals(response.statusCode(),200);
    }


}
