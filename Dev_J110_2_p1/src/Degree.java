
public enum Degree {
    
    PHD("PhD"),
    MSC("MSc");
    
    private String degree;
    
    private Degree(String degree) {
    this.degree = degree;
    }
    public String getDegreeString() {
        return degree;
    }
}
