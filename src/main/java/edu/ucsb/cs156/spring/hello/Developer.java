package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "John V.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "jjohnvu";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-01");
        team.addMember("Nathan N.");
        team.addMember("John V.");
        team.addMember("Noah L.");
        team.addMember("Nic S.");
        team.addMember("William C.");
        team.addMember("Yi L.");
        return team;
    }
}
