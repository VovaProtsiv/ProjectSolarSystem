package org.solarsystem.web.view;

import java.time.LocalDate;
import java.util.List;

public class DateMinIntervalView {

    public String getDateMinInterval(List<String> planetNames, String theBestDay, String distance){
        IndexSingleton indexSingleton = IndexSingleton.getInstance();
        String message = "";
        if (theBestDay !=null){
            message = "<p><font color=\"white\">This the best date: "+theBestDay+"</p>"+
            "<p>This is distance: "+distance+" Astronomical unit</font></p>";
        }

        StringBuilder listPlanet = new StringBuilder();
        for (String s: planetNames
        ) {
            listPlanet.append("<option value=\""+s+"\">"+s+"</option>\n");
        }
        String page = "  <form id=\"dmi\" method=\"post\" action=\"/DateMinInterval\">\n" +
                "    <div class=\"form-row align-items-center\">\n" +
                "      <div class=\"col-auto my-1\">\n" +
                "        <label class=\"mr-sm-2 sr-only\" for=\"inlineFormCustomSelect\">From this planet</label>\n" +
                "        <select class=\"custom-select mr-sm-2\" id=\"inlineFormCustomSelect\" name=\"FromPlanet\" required>\n" +
                "          <option selected>Choose...</option>\n" +listPlanet+
                "        </select>\n" +
                "      </div>\n" +
                "      <br>\n" +
                "      <div class=\"col-auto my-1\">\n" +
                "        <label class=\"mr-sm-2 sr-only\" for=\"inlineFormCustomSelect2\">To this planet</label>\n" +
                "        <select class=\"custom-select mr-sm-2\" id=\"inlineFormCustomSelect2\" name=\"ToPlanet\" required>\n" +
                "          <option selected>Choose...</option>\n" +listPlanet+
                "        </select>\n" +
                "      </div>\n" +
                "      <br>\n" +
                "      <label for=\"startDate\">From Date:</label>\n" +
                "      <input type=\"date\" id=\"startDate\" name=\"dateStart\" value=\"2020-02-27\" min=\"2000-02-27\" max=\"5020-02-27\">\n" +
                "      <br>\n" +
                "      <label for=\"finishDate\">To Date:</label>\n" +
                "      <input type=\"date\" id=\"finishDate\" name=\"dateFinish\" value=\"2020-02-27\" min=\"2000-02-27\" max=\"5020-02-27\">\n" +
                "      <br>\n" +
                "      <div class=\"col-auto my-1\">\n" +
                "        <button type=\"submit\" class=\"btn btn-primary\">I want to know the best day and distance</button>\n" +
                "      </div>\n" +
                "      <br>\n" +
                "      <div class=\"\">\n" +
                "        <p>"+message+"</p>\n" +
                "      </div>\n" +
                "      <br>\n" +
                "    </div>\n" +
                "  </form>\n";

        return indexSingleton.getIndex().replace("<!--DateMinInterval-->",page);
    }

}
