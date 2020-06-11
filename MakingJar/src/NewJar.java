public class NewJar {
    public static void main(String[] args) {
        System.out.println("it is a jar!");
        if (args.length > 0) {
            System.out.println("it has an argument!");
            for (String arg : args) System.out.println("one of the args: " + arg);
        } else System.out.println("it has no argument");
    }
}
