

public class Teachers extends PersonAbstract {
    
    private String specialty; //название специальности
    private Degree degree;    //ученая степень

    public Teachers(String name, Gender gender, String department, String specialty, Degree degree) {
        super(name, gender, department);
        setSpecialty(specialty);
        setDegree(degree);
    }

    public String getSpecialty() {
        return specialty;
    }

    public final void setSpecialty(String specialty) {
        if(specialty == null)
            throw new IllegalArgumentException("Не указаны обязательные данные: специальность преподавателя");
        
        this.specialty = specialty;
    }

    public Degree getDegree() {
        return degree;
    }

    public final void setDegree(Degree degree) {
        if(degree == null)
            throw new IllegalArgumentException("Не указаны обязательные данные: ученая степень преподавателя");
        
        this.degree = degree;
    }

    @Override
    public void print() {
        
        String first = "This is " + super.getName() + ". ";
        if(super.getGender() == Gender.M)
           System.out.println(first + "He teaches " + super.getDepartment() + ". " + "He has " + degree.getDegreeString() + " degree in " + this.specialty + ".");  
        else
           System.out.println(first + "She teaches " + super.getDepartment() + ". " + "She has " + degree.getDegreeString() + " degree in " + this.specialty + ".");   
        
    }     
}
