package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductAccountHolderListNode extends SelectAccountHolderListNode<ProductDescriptionNode> {

    private ProductAccountHolderListNodeComponent component;

    @Inject
    public ProductAccountHolderListNode(@Owner ProductDescriptionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductAccountHolderListNode.class;
    }

    @Inject
    void createComponent(ProductAccountHolderListNodeComponent.Builder builder) {
        this.component = builder.setProductAccountHolderListNodeModule(new ProductAccountHolderListNodeModule(this)).build();
    }

    private RuleProvider<ProductAccountHolderListNode> getRuleProvider() {
        return component.getProductAccountHolderListNodeRuleProvider();
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

    private RuleProvider<ProductAccountHolderListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
