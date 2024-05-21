import grails.gorm.services.Service
import hibernate.example.Product
import hibernate.example.ProductService

import javax.transaction.Transactional

@Service
@Transactional
class ProductServiceImpl implements ProductService {
    @Override
    Product get(Serializable id) {
        return null
    }

    @Override
    List<Product> list(Map args) {
        return Product.list()
    }

    @Override
    Product buscaPorNome(String nome) {
        println(nome)
        def prod = Product.findByNome(nome)
        println(prod.preco)
        return prod
    }

    @Override
    Long count() {
        return null
    }

    @Override
    Product delete(Serializable id) {
        return null
    }

    @Override
    Product save(Product product) {
        return product.save(flush: true)
    }
}
