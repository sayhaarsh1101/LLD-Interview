package Solid.LSP.LspViolation;

public class Main {

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();

        makeBirdFly(sparrow); // This will print "Sparrow is flying"
        makeBirdFly(penguin);// This will throw an exception

    }
}