package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductOptOutReasonNode extends StringUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductOptOutReasonNode.class;
    }

    private ProductOptOutReasonNodeComponent component;

    @Inject
    void createComponent(ProductOptOutReasonNodeComponent.Builder builder) {
        this.component = builder.setProductOptOutReasonNodeModule(new ProductOptOutReasonNodeModule(this)).build();
    }

    private ProductOptOutReasonNodeRuleProvider getRuleProvider() {
        return component.getProductOptOutReasonNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductOptOutReasonNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
