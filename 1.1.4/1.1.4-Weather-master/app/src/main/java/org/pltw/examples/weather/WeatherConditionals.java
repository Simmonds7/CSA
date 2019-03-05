package org.pltw.examples.weather;

/**
 * Created by wdumas on 3/3/16.
 */
public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;
        if (description.indexOf("windy") >= 0)
        {
            windy = true;
        }
        if (temperature <= -1 && temperature >= -54)
        {
            return "You may be in Iowa... I would choose somewhere warmer.";
        }
        if (temperature > 100 && description.indexOf("snow") >= 0)
        {
            return("FaKe NeWs");
        }
        else if (!windy && (temperature > 30))
        {
            return("It's quite pleasant outside at the present moment: " + temperature + " degrees and " + description + ".");
        }
        else
            return "Too windy or cold, please remain indoors.";
    }
}
