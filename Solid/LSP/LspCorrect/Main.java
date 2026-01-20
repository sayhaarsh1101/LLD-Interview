package Solid.LSP.LspCorrect;

public class Main {

    public static void main(String[] args) {

        Flyable sparrow = new Sparrow();
        sparrow.fly(); // This will print "Sparrow is flying"

        Bird penguin = new Penguin();
        penguin.eat(); // This will print "Penguin is eating fish"
        
    }
    
}
