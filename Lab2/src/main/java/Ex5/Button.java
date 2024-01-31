public class Button {
    private String label;
    private String colour;

    public Button(String label, String colour) {
        this.label = label;
        this.colour = colour;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void dePress() {
        System.out.println("Depressed");
    }

    public void unDepress() {
        System.out.println("No longer depressed");
    }
}
