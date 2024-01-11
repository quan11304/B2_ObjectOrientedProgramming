public class NameCardTestDrive {
    public static void main(String[] args) {
        NameCard nc = new NameCard("Polly Morfism",
                "5550343", "pm@wikedlysmart");
        System.out.println("Name: " + nc.getName());
        System.out.println("Phone: " + nc.getPhone());
        System.out.println("Email: "+ nc.getEmail());
    }
}
