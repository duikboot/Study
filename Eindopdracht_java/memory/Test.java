/**
 * Base class for creating tests
 * @author arjend
 */
package memory;
import interfaces.PathInterface;


public abstract class Test implements PathInterface {


    public int pauseTime;
    public int displayTime;
    public int rightAnswers;
    public int wrongAnswers;
    public String TestDate;

    public void startTest (){
    }

    /**
     * Returns the value of rightAnswers.
     * @return integer with number of right answers.
     */
    public int getRightAnswers(){
        return rightAnswers;
    }

    /**
     * Return the value of wrongAnswers.
     * @return integer with number of wrong answers.
     */
    public int getWrongAnswers(){
        return wrongAnswers;
    }

    /**
     * Return the date of the test.
     * @return string representing the date of the test.
     */
    public String getTestDate(){
        return TestDate;
    }
}
