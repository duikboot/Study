/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arjend
 */


public final class Person {

    private String personId;
    private String dateOfBirth;
    private char gender;

    public Person(String pid) {
        this.setPersonID(pid);
    }

    public Person(String pid, String dateOfBirth, char gender) {
        this.setPersonID(pid);
        this.setDateOfBirth(dateOfBirth);
        this.setGender(gender);
    }

    public void setPersonID(String id) {
        this.personId = id;
    }
    
    public String getPersonID(){
        return this.personId;
    }

    public void setDateOfBirth(String date) {
        this.dateOfBirth = date;
//        this.dateOfBirth.set(1978, 2, 26);

    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return this.gender;
    }

    //afnamedatum
}
