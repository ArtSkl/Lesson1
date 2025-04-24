package korona.bk.mentoring.oop;

public class Predator extends  Animal {
    private boolean isPredator;

    public Predator(int age, String type, boolean isPredator) {
        super(age, type);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }

    //@Override
    public void makeSoundPredator(){
        System.out.println("Predator Sound");
    }

}
