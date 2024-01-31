public class ButtonTestDrive {
    public static void main(String[] args) {
        Button b = new Button("Press","Red");
        System.out.println(b.getColour() + " " + b.getLabel());
        b.setColour("Green");
        System.out.println(b.getColour() + " " + b.getLabel());
        b.setLabel("Hold");
        System.out.println(b.getColour() + " " + b.getLabel());
        b.dePress();
        b.unDepress();
    }
}
