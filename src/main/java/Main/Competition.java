package Main;

public abstract class Competition {

    double metric;
    String type;

    public String getType() {
        return type;
    }

    public Competition(double metric, String type){
        this.metric = metric;
        this.type = type;
    }

}
