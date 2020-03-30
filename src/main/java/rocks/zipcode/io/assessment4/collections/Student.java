package rocks.zipcode.io.assessment4.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private String labName;
    private LabStatus labStatus;
//    private String lab;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
    }

    public Lab getLab(String labName) {
return null;

    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        this.labStatus = labStatus;

    }

    public void forkLab(Lab lab) {
        setLabStatus(labName, LabStatus.PENDING);

//            this.labStatus = labStatus;
//        } ( UnsupportedOperationException exception) {


        }

    public LabStatus getLabStatus(String labName) {
        return labStatus;
    }
}
