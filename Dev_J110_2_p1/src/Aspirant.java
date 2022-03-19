
public class Aspirant extends PersonAbstract {
    
    private String thesisTitle;
    private static final String STUDIES = "studies ";

    public Aspirant(String name, Gender gender, String department, String thesisTitle) {
        
        super(name, gender, department);
        setThesisTitle(thesisTitle);
    }
    public String getThesisTitle() {
        return thesisTitle;
    }
    public final void setThesisTitle(String thesisTitle) {
        if(thesisTitle == null)
            throw new IllegalArgumentException("Необходимо указать тему диссертации.");
        
        this.thesisTitle = thesisTitle;
    }
    @Override
    public void print() {
        
        String first = "This is " + super.getName() + ". ";
        if(super.getGender() == Gender.M)
           System.out.println(first + "He " + STUDIES + super.getDepartment() + ". His thesis title is “" + thesisTitle + "“");  
        else
           System.out.println(first + "She " + STUDIES + super.getDepartment() + ". Her thesis title is “" + thesisTitle + "“");   
    }   
}
