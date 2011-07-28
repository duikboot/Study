/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arjend
 */
package memory;


public final class Person {

    private String personId;
    private String dateOfBirth;
    private String gender;
    private String[] person = new String[3];

    public Person(String pid) {
        this.setPersonID(pid);
    }

    public Person(String pid, String gender) {
        this.setPersonID(pid);
        this.setGender(gender);
    }


    public Person(String pid, String dateOfBirth, String gender) {
        this.setPersonID(pid);
        this.setDateOfBirth(dateOfBirth);
        this.setGender(gender);
    }

    public void setPersonID(String id) {
        this.personId = id;
        this.person[0] = this.personId;
    }

    public String getPersonID(){
        return this.personId;
    }

    public void setDateOfBirth(String date) {
        this.dateOfBirth = date;
        this.person[1] = this.dateOfBirth;
//        this.dateOfBirth.set(1978, 2, 26);

    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
        this.person[2] = this.gender;
    }

    public String getGender() {
        return this.gender;
    }

    public String[] getPersonArray(String id){
        return this.person;

    }
    //afnamedatum
}
