package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labName;
    private LabStatus labStatus;



    public Lab() {
        this(null);
    }

    public Lab(String labName) {
    }

    public String getName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public void setStatus(LabStatus labStatus) 
    { this.labStatus =labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
