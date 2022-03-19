
/**
 *
 * @author dmitr
 */
public class Main {



    public static void main(String[] args) {
        
        PersonAbstract person1 = new Teachers("Ronald Turner", Gender.M, "Computer science", "Programming paradigms", Degree.PHD);
        PersonAbstract person2 = new Teachers("Ruth Hollings", Gender.F, "Jurisprudence", "Domestic arbitration", Degree.MSC);
        PersonAbstract person3 = new Students("Leo Wilkinson", Gender.M, "Computer science", Stage.BACHELOR, 3);
        PersonAbstract person4 = new Students("Anna Cunningham", Gender.F, "World economy", Stage.BACHELOR, 1);
        PersonAbstract person5 = new Students("Jill Lundqvist", Gender.F, "Jurisprudence", Stage.MASTER, 1);
        PersonAbstract person6 = new Aspirant("Ronald Correa", Gender.M, "Computer science", "Design of a functional programming language.");
        
        PersonAbstract[] persons = new PersonAbstract[]{person1, person2, person3, person4, person5, person6};
 
        for(PersonAbstract per : persons)
            per.print();
        
        System.out.println();
        
        PersonAbstract.printAll(persons);
        
        System.out.println();
    }
    
}
