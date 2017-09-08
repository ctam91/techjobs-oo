package org.launchcode.models.data;

import org.launchcode.models.Job;
import org.launchcode.models.JobField;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */

// This class contains data for JobFields
// T represents any object instances of classes that extend JobField

public class JobFieldData<T extends JobField> {

    // Create new ArrayList called allFields
    private ArrayList<T> allFields = new ArrayList<>();

    /**
     * findAll() returns a list of all JobFields
     * @return ArrayList of JobFields
     */
    public ArrayList<T> findAll() {
        return allFields;
    }

    /**
     * Find a job field based on it's id
     * @param id, the id of the JobField type that we are searching
     * @return item, the job field with an id matching the param. If no item is found, return null
     */
    public T findById(int id) {
        for (T item : allFields) {
            if (item.getId() == id)
                return item;
        }

        return null;
    }

    /**
     * Adds a job field to our ArrayList of JobFields
     * @param item the job field to add
     */
    public void add(T item) {
        allFields.add(item);
    }

    /**
     * Finds a field based on value
     * @param value the field to search for
     * @return item, the field that corresponds with the search value
     */
    T findByValue(String value) {
        for (T item : allFields) {
            if (item.contains(value))
                return item;
        }

        return null;
    }

}
