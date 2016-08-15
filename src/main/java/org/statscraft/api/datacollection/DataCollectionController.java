package org.statscraft.api.datacollection;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataCollectionController {

    @RequestMapping(value = "/api/v1/server", method = RequestMethod.POST)
    public String onServerReport(@RequestBody ServerReport report) {
        System.out.println("ServerReport = " + report);
        return "OK";
    }

    @RequestMapping(value = "/api/v1/plugin", method = RequestMethod.POST)
    public String onPluginReport(@RequestBody PluginReport report) {
        System.out.println("PluginReport = " + report);
        return "OK";
    }

    @RequestMapping(value = "/api/v1/update", method = RequestMethod.POST)
    public ServerUpdateReport onServerUpdateReport(@RequestBody ServerUpdateReport report) {
        System.out.println("ServerUpdateReport = " + report);
        return null;
    }

    @ExceptionHandler
    public String onException(Exception ex) {
        ex.printStackTrace();
        return "ERR:" + ex.getMessage();
    }
}
