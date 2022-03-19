

public enum Stage {
    
    BACHELOR("bachelor"),
    MASTER("master");
    
    private String stage;

    private Stage(String stage) {
        this.stage = stage;
    }
    public String getStageString() {
    return stage;
    }
}
