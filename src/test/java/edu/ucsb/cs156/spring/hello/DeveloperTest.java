package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("John V.", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco liSne coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("jjohnvu", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-01", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Nathan N."),"Team should contain Nathan N.");
        assertTrue(t.getMembers().contains("John V."),"Team should contain John V.");
        assertTrue(t.getMembers().contains("Noah L."),"Team should contain Noah L.");
        assertTrue(t.getMembers().contains("Nic S."),"Team should contain Nic S.");
        assertTrue(t.getMembers().contains("William C."),"Team should contain William C.");
        assertTrue(t.getMembers().contains("Yi L."),"Team should contain Yi L.");
    }

}
