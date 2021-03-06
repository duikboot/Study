/**
 *
 * @author arjend
 */
package memory;


public final class Person {

    private String personId;
    private String dateOfBirth;
    private String gender;
    // Put everything in an array to 
    private String[] person = new String[3];

    public Person(String pid) {
        this.setPersonID(pid);
    }

    public Person(String pid, String gender) {
        // Id and gender is the minimum.
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
        // TODO: make it a real date in stead of a String
        // but it's not nessecary. 
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

    public String[] getPersonArray(){
        return this.person;

    }
}
