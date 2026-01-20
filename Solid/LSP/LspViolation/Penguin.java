package Solid.LSP.LspViolation;

public class Penguin extends Bird {
    // Penguins cannot fly, violating LSP if treated as a Bird

    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
