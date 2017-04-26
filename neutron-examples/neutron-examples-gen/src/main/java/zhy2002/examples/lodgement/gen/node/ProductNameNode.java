package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductNameNode extends StringUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductNameNode.class;
    }

    private ProductNameNodeComponent component;

    @Inject
    void createComponent(ProductNameNodeComponent.Builder builder) {
        this.component = builder.setProductNameNodeModule(new ProductNameNodeModule(this)).build();
    }

    private RuleProvider<ProductNameNode> getRuleProvider() {
        return component.getProductNameNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<ProductNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public ProductNameNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
