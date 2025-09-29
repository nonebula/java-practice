package lesson13StringMethods;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Joe Higgs";
        int length = name.length();
        System.out.printf("The length of the name (with spaces) is %d\n", length);

        char letter = name.charAt(0);
        System.out.printf("The letter of the name (with spaces) is %c\n", letter);

        int index = name.indexOf("g");
        System.out.printf("The index of 'g' in the name is %d\n", index);

        int lastIndex = name.lastIndexOf("g");
        System.out.printf("The last index of 'g' in the name is %d\n", lastIndex);

        name = name.toUpperCase();
        System.out.printf("The uppercase version of the name is %s\n", name);

        name = name.toLowerCase();
        System.out.printf("The lowercase version of the name is %s\n", name);

        String name2 = "    Bob Merkie    ";
        name2 = name2.trim();
        System.out.printf("The name is %s\n", name2);

        name2 = name2.replace("o", "i");
        System.out.printf("The name is %s\n", name2);

        if(name.isEmpty()) {
            System.out.println("The name is empty");
        } else {
            System.out.println("The name isn't empty");
        }

        if(name.contains(" ")){
            System.out.println("The name contains spaces");
        } else  {
            System.out.println("The name doesn't contain spaces");
        }

        //doesn't apply to case sensitivity. equalsIgnoreCase will.
        if(name.equals("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello, " + name);
        }
    }
}
