package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductConstructionApplicationFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductConstructionApplicationFlagNode.class;
    }

    private ProductConstructionApplicationFlagNodeComponent component;

    @Inject
    void createComponent(ProductConstructionApplicationFlagNodeComponent.Builder builder) {
        this.component = builder.setProductConstructionApplicationFlagNodeModule(new ProductConstructionApplicationFlagNodeModule(this)).build();
    }

    private ProductConstructionApplicationFlagNodeRuleProvider getRuleProvider() {
        return component.getProductConstructionApplicationFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductConstructionApplicationFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
