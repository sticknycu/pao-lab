package org.example;

import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        Person person = new Person();

        person.getDriveLicenseInformation().ifPresent(object -> {
            object.getCreationDate();
        });

        if (person.getDriveLicenseInformation().isPresent()) {
            var object = person.getDriveLicenseInformation().get();

            object.getCreationDate();
        }

        Optional.of(new Person());

        Optional.ofNullable(null);

        Optional.empty();

        person.getDriveLicenseInformation().orElseGet(() -> new DriveLicenseInformation());

        person.getDriveLicenseInformation().orElse(new DriveLicenseInformation());
    }
}
