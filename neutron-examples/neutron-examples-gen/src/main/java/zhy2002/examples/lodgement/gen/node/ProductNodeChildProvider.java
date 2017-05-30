package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface ProductNodeChildFactory {
    ProductDescriptionNode createProductDescriptionNode();
    ProductFeaturesNode createProductFeaturesNode();
}

@Singleton
public class ProductNodeChildProvider {
    @Inject
    MembersInjector<ProductDescriptionNode> productDescriptionNodeInjector;
    @Inject
    MembersInjector<ProductFeaturesNode> productFeaturesNodeInjector;

    @Inject
    protected ProductNodeChildProvider () {}

    protected MembersInjector<ProductDescriptionNode> getProductDescriptionNodeInjector() {
        return this.productDescriptionNodeInjector;
    }

    protected MembersInjector<ProductFeaturesNode> getProductFeaturesNodeInjector() {
        return this.productFeaturesNodeInjector;
    }

    protected ProductDescriptionNode newProductDescriptionNode(
        ProductNode parent,
        String name
    ) {
        return new ProductDescriptionNode(parent, name);
    }

    protected void configureProductDescriptionNode(ProductDescriptionNode node) {
    }

    @ProductDescriptionNodeScope
    public static class ProductDescriptionNodeRuleProvider implements RuleProvider<ProductDescriptionNode> {

        @Inject
        public ProductDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductFeaturesNode newProductFeaturesNode(
        ProductNode parent,
        String name
    ) {
        return new ProductFeaturesNode(parent, name);
    }

    protected void configureProductFeaturesNode(ProductFeaturesNode node) {
    }

    @ProductFeaturesNodeScope
    public static class ProductFeaturesNodeRuleProvider implements RuleProvider<ProductFeaturesNode> {

        @Inject
        public ProductFeaturesNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductFeaturesNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    ProductNodeChildFactory createFactory(ProductNode parent) {
        return new ProductNodeChildFactoryImpl(parent);
    }

    private class ProductNodeChildFactoryImpl implements ProductNodeChildFactory {

        private final ProductNode parent;
        
        private ProductNodeChildFactoryImpl(ProductNode parent) {
            this.parent = parent;
        }

        @Override
        public ProductDescriptionNode createProductDescriptionNode() {
            ProductDescriptionNode node = newProductDescriptionNode(parent, "productDescriptionNode");
            productDescriptionNodeInjector.injectMembers(node);
            configureProductDescriptionNode(node);
            return node;
        }

        @Override
        public ProductFeaturesNode createProductFeaturesNode() {
            ProductFeaturesNode node = newProductFeaturesNode(parent, "productFeaturesNode");
            productFeaturesNodeInjector.injectMembers(node);
            configureProductFeaturesNode(node);
            return node;
        }

    }
}
