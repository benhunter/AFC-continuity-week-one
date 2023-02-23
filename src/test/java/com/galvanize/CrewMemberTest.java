package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrewMemberTest {

    @Test
    void createCrewMember() {
        String crewMemberName = "Bob";
        CrewMember crewMember = new CrewMember(crewMemberName);

        assertEquals(crewMemberName, crewMember.getName());
        assertEquals(100.0f, crewMember.getMorale());
    }

    @Test
    void reduceMorale() {
        float expected = 90f;
        String crewMemberName = "Bob";
        CrewMember crewMember = new CrewMember(crewMemberName);

        crewMember.decreaseMorale(10f);

        float actual = crewMember.getMorale();
        assertEquals(expected, actual);

    }

}