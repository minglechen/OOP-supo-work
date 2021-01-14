package supo3.Question64;

public class Rule {

    private Character frame;

    public Rule(Character frame){
        this.frame = frame;
    }

    public static Rule xFrame(){
        return new Rule('x');
    }

    public static Rule plusFrame(){
        return new Rule('+');
    }

    public static Rule noFrame(){
        return new Rule(null);
    }

    public Character getFrame() {
        return frame;
    }
}
