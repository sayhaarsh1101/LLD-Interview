package Solid.LSP.LspCorrect;

public class Sparrow extends Bird implements Flyable {
    @Override
    void eat() {
        System.out.println("Sparrow is eating seeds");
    }
    @Override
    public void fly() {
        System.out.println("Sparrow is flying"); 
    }
    
}
