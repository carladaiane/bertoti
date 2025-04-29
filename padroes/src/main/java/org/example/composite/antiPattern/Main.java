package org.example.composite.antiPattern;

public class Main {
    public static void main(String[] args) {
        Product cd = new SimpleProduct("CD de Rock", 30.0);
        Product livro = new SimpleProduct("Livro Java", 50.0);

        ProductPackage pacote1 = new ProductPackage("Pacote Estudo");
        pacote1.addProduct(cd);
        pacote1.addProduct(livro);

        Product fone = new SimpleProduct("Fone", 80.0);
        ProductPackage pacote2 = new ProductPackage("Pacote Completo");
        pacote2.addProduct(pacote1);
        pacote2.addProduct(fone);

        System.out.println(pacote2.getName() + " custa R$ " + pacote2.getPrice());
    }
}
