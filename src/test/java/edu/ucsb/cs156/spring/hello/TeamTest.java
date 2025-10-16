package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object() {
        Team t1 = new Team("team1");
        assertEquals(true, t1.equals(t1));
    }

    @Test
    public void equals_different_class() {
        Team t1 = new Team("team1");
        assertEquals(false, t1.equals(0));
    }

    @Test
    public void equals_same_different_name() {
        Team t1 = new Team("team1");
        Team t2 = new Team("team1");
        assertEquals(true, t1.equals(t2));
    }

    @Test
    public void test_equals_same_name_different_members() {
        Team t1 = new Team("gauchos");
        Team t2 = new Team("gauchos");

        t1.addMember("foo");
        t2.addMember("John");

        assertNotEquals(t1, t2);
    }

    @Test
    public void hashCode_test() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
}
