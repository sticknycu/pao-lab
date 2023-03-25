package org.example;

import java.util.Date;
import java.util.Optional;

public class Person implements Comparable<Person> {

    private Integer age;

    private Optional<DriveLicenseInformation> driveLicenseInformation;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Optional<DriveLicenseInformation> getDriveLicenseInformation() {
        return driveLicenseInformation;
    }

    public void setDriveLicenseInformation(Optional<DriveLicenseInformation> driveLicenseInformation) {
        this.driveLicenseInformation = driveLicenseInformation;
    }

    @Override
    public int compareTo(Person o) {
        return o.getAge() - this.getAge();
    }
}

/*
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashcode
@ToString
*/
class DriveLicenseInformation {

    private Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
