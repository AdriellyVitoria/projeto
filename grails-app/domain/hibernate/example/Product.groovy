package hibernate.example

class Product {
    String nome
    Double preco

    static constrains = {
        nome blank:false
        preco range:0.0..1000.00
    }
}
