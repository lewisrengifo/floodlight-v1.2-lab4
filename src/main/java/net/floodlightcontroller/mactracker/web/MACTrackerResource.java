package net.floodlightcontroller.mactracker.web;

import net.floodlightcontroller.mactracker.MACTrackerService;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import java.util.ArrayList;
import java.util.List;

public class MACTrackerResource extends ServerResource {
    @Get("json")
    public List<Long> retrieve(){
        MACTrackerService pihr = (MACTrackerService)getContext().getAttributes().get(MACTrackerService.class.getCanonicalName());
        List<Long> l = new ArrayList<Long>();
        l.addAll(pihr.getMacAddresses());
        return l;

    }
}
