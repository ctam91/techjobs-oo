package org.launchcode.models;

import org.launchcode.models.data.JobData;
import org.launchcode.models.data.JobFieldData;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class Employer extends JobField {

    public Employer(String value) {
        //override superclass constructor with own class's value
        super(value);
    }

}
