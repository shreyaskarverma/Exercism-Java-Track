public class Twofer {
    public String twofer(String name) {
        if(name == null || name== "") {
            return "One for you, one for me." ;
        }
        return "One for " + name + ", one for me.";
    }
}
