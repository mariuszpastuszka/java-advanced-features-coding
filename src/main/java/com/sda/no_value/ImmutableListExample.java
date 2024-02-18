package com.sda.no_value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExample {

    public static void main(String[] args) {
        System.out.println("Immutable list example");

        PersonWithSecrets person = new PersonWithSecrets();
        List<String> secrets =  person.getMySecrets();

        System.out.println(secrets);
        secrets.add("hahaha");

        System.out.println("Secrets after modification: " + secrets);

        System.out.println("Now with immutable collection");
        List<String> immutableSecrets = person.getMySecretsAsImmutableList();
        // not going to happen:)
        immutableSecrets.add("not going to happen");
    }
}

class PersonWithSecrets {
    private List<String> mySecrets = new ArrayList<>();

    PersonWithSecrets() {
        mySecrets.add("secret 1");
        mySecrets.add("secret 2");
    }

    public List<String> getMySecrets() {
        return mySecrets;
    }

    public List<String> getCopyOfSecrets() {
        return new ArrayList<>(mySecrets);
    }
    public List<String> getMySecretsAsImmutableList() {
        return Collections.unmodifiableList(mySecrets);
    }
}