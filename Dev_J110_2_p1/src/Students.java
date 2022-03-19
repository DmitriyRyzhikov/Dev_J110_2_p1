
public class Students extends PersonAbstract {
    
    private int courseNumber;    // номер курса 
    private Stage stage;         //ступень обучения 

    public Students(String name, Gender gender, String department, Stage stage, int courseNumber) {
        super(name, gender, department);
        setCourseNumber(courseNumber);
        setStage(stage);
    }
    public int getCourseNumber() {
        return courseNumber;
    }
    public final void setCourseNumber(int courseNumber) {
        if(courseNumber <= 0)
            throw new IllegalArgumentException("Номер курса указан неверно.");
        
        this.courseNumber = courseNumber;
    }
    public Stage getStage() {
        return stage;
    }
    public final void setStage(Stage stage) {
        if(stage == null)
            throw new IllegalArgumentException("Ступень обучения студента указана неверно.");
        
        this.stage = stage;
    }   
    @Override
    public void print() {
        
        String first = "This is " + super.getName() + ". ";
        if(super.getGender() == Gender.M)
           System.out.println(first + "He studies " + super.getDepartment() + ". " + "He is " + this.courseNumber + "‘th year " + stage.getStageString() + " student.");  
        else
           System.out.println(first + "She studies " + super.getDepartment() + ". " + "She is " + this.courseNumber + "‘th year " + stage.getStageString() + " student.");   
    } 
}
