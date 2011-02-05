package org.netmelody.cii.domain;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public final class Target {

    private final String name;
    private final Status status;
    private final List<Build> builds = new ArrayList<Build>();
    
    public Target(String name) {
        this(name, Status.GREEN);
    }

    public Target(String name, Status status, Build... builds) {
        this.name = name;
        this.status = status;
        
        if (null != builds) {
            this.builds.addAll(asList(builds));
        }
    }

    public String name() {
        return name;
    }
    
    public Status status() {
        return status;
    }
}