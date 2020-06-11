package CustomException;

public class Main {
    public static void main(String[] args) throws CustomException {
            firstMethod("tesnnnnt");
    }

    static void firstMethod(String message) throws CustomException {
        if (message.equalsIgnoreCase("test"))
            System.out.println("success");
         else
            throw new CustomException("Finally the class will be over!");
    }
}
