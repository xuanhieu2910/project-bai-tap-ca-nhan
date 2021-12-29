package xuanhieu.project.entity;

public class Exercise {

    private String title;
    private String dataInput;
    private String dataOutput;
    private boolean checkInput;

    public String getDataInput() {
        return dataInput;
    }

    public void setDataInput(String dataInput) {
        this.dataInput = dataInput;
    }

    public String getDataOutput() {
        return dataOutput;
    }

    public void setDataOutput(String dataOutput) {
        this.dataOutput = dataOutput;
    }

    public boolean isCheckInput() {
        return checkInput;
    }

    public void setCheckInput(boolean checkInput) {
        this.checkInput = checkInput;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
