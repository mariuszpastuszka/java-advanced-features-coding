package com.sda.sql_mapping;

import java.util.Collections;
import java.util.List;

public class DbOperations {

    // CRUD

    // Read all / Select
    public List<PersonEntity> readAllPersons() {
        // TODO
        return Collections.emptyList();
    }

    // Read by id / Select
    public PersonEntity readById(Long personId) {
        // TODO
        return null;
    }

    // Create / Insert clause
    public PersonEntity savePerson(PersonEntity personToSave) {
        // personToSave without id

        // return person with updated id
        // TODO
        return null;
    }

    // Delete / Delete clause
    public boolean deletePersonById(Long id) {
        // id of person to delete
        // return:
        // true - object was deleted
        // false - object wasn't deleted
        // TODO
        return false;
    }

    // Update / Update clause
    public PersonEntity updatePerson(PersonEntity toUpdate) {
        // TODO
        return null;
    }
}
