package org.example.composite.pattern;


public class Main {
    public static void main(String[] args) {
        Product cd = new SimpleProduct("CD de Rock", 30.0);
        Product livro = new SimpleProduct("Livro Java", 50.0);
        Product fone = new SimpleProduct("Fone de Ouvido", 80.0);

        ProductPackage pacote1 = new ProductPackage("Pacote Estudo");
        pacote1.addProduct(livro);
        pacote1.addProduct(cd);

        ProductPackage pacote2 = new ProductPackage("Pacote Completo");
        pacote2.addProduct(pacote1);
        pacote2.addProduct(fone);

        System.out.println(pacote1.getName() + " custa R$ " + pacote1.getPrice());
        System.out.println(pacote2.getName() + " custa R$ " + pacote2.getPrice());
    }
}
