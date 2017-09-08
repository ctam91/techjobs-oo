package org.launchcode.models;

/**
 * Created by LaunchCode
 */
public enum JobFieldType {

    // Create constants and their instantiated names (using a Constructor)
    EMPLOYER ("Employer"),
    LOCATION ("Location"),
    CORE_COMPETENCY ("Skill"),
    POSITION_TYPE ("Position Type"),
    ALL ("All");

    private final String name;

    JobFieldType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
