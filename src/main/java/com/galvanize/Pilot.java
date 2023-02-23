package com.galvanize;

import jdk.internal.jshell.tool.StopDetectingInputStream;

public class Pilot extends CrewMember {
    public Pilot(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Pilot=>" + super.toString();
    }
}
