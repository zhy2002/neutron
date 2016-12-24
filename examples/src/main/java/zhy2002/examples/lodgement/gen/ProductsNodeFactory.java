package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class ProductsNodeFactory implements ChildNodeFactory<ProductsNode, ApplicationNode> {

    @Override
    public ProductsNode create(ApplicationNode parent, String name) {
        return new ProductsNode(parent, name);
    }
}
