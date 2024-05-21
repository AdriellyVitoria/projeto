package hibernate.example

interface ProductService {
    Product get(Serializable id)
    List<Product> list(Map args)
    Product buscaPorNome(String nome)
    Long count()
    Product delete(Serializable id)
    Product save(Product product)
}