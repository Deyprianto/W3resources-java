
/*
90. Environment Variables
Write a Java program to get the value of environment variables PATH, TEMP, USERNAME.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("TEMP"));
        System.out.println(System.getenv("USERNAME"));

    }
}
