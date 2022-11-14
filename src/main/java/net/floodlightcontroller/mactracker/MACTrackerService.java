package net.floodlightcontroller.mactracker;

import net.floodlightcontroller.core.module.IFloodlightService;

import java.util.Set;

public interface MACTrackerService extends IFloodlightService {
    public Set<Long> getMacAddresses();
}
