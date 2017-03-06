package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductGroupNode extends StringUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductGroupNode.class;
    }

    private ProductGroupNodeComponent component;

    @Inject
    void createComponent(ProductGroupNodeComponent.Builder builder) {
        this.component = builder.setProductGroupNodeModule(new ProductGroupNodeModule(this)).build();
    }

    private ProductGroupNodeRuleProvider getRuleProvider() {
        return component.getProductGroupNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductGroupNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
