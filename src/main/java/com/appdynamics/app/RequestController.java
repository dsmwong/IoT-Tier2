package com.appdynamics.app;

import com.fasterxml.jackson.databind.JsonNode;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Random;

@RestController
public class RequestController
{
    @RequestMapping("/temperature/{value}")
    public String handleTemperature(@PathVariable("value") String value) {

        Random r = new Random();

        try
        {
            Thread.sleep(r.nextInt(400 - 200 + 1) + 200);
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        return "\"Response\":\"SUCCESS\"";
    }

    @RequestMapping("/humidity/{value}")
    public String handleHumidity(@PathVariable("value") String value) {

        Random r = new Random();
        int randNum = r.nextInt(100 - 1 + 1) + 1;

        try
        {
            if(randNum <= 30)
            {
                Thread.sleep(r.nextInt(4000 - 2000 + 1) + 2000);
            }
            else
            {
                Thread.sleep(r.nextInt(1000 - 500 + 1) + 500);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        return "\"Response\":\"SUCCESS\"";
    }
}