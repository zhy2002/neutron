package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductAccountHolderListNode extends SelectAccountHolderListNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductAccountHolderListNode.class;
    }

    private ProductAccountHolderListNodeComponent component;

    @Inject
    void createComponent(ProductAccountHolderListNodeComponent.Builder builder) {
        this.component = builder.setProductAccountHolderListNodeModule(new ProductAccountHolderListNodeModule(this)).build();
    }

    @Override
    protected ProductAccountHolderListNodeRuleProvider getRuleProvider() {
        return component.getProductAccountHolderListNodeRuleProvider();
    }

    public ProductAccountHolderListNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
