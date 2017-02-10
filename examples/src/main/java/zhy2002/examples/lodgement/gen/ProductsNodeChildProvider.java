package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ProductsNodeChildFactory {
}

@Singleton
public class ProductsNodeChildProvider {

    @Inject
    protected ProductsNodeChildProvider () {}

    ProductsNodeChildFactory createFactory(ProductsNode parent) {
        return new ProductsNodeChildFactoryImpl(parent);
    }

    private class ProductsNodeChildFactoryImpl implements ProductsNodeChildFactory {

        private final ProductsNode parent;
        
        private ProductsNodeChildFactoryImpl(ProductsNode parent) {
            this.parent = parent;
        }

    }
}
