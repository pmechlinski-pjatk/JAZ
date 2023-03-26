package pl.pjatk.pawmec;

public class PlainClass {
    private int integer = 0;

    public String invokePrompt () {
        this.integer = this.integer + 1;
        return "To jest zwykła klasa";
    }
}
