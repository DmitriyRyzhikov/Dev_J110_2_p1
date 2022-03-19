
public enum Gender {
    
    M("male"),
    F("female");
    
    private String gender;
    
    private Gender(String gender) {
        this.gender = gender;
    }
    public String getGenderString() {
        return gender;
    }
}
