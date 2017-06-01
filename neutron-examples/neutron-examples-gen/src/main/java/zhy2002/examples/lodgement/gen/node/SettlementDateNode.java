package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SettlementDateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SettlementDateNode extends StringUiNode<ProductsNode> {

    @Inject
    public SettlementDateNode(@Owner ProductsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SettlementDateNode.class;
    }

    protected final SettlementDateNodeComponent getComponent() {
        return component;
    }


    private SettlementDateNodeComponent component;

    @Inject
    void createComponent(SettlementDateNodeComponent.Builder builder) {
        this.component = builder.setSettlementDateNodeModule(new SettlementDateNodeModule(this)).build();
    }

    private RuleProvider<SettlementDateNode> getRuleProvider() {
        return component.getSettlementDateNodeRuleProvider();
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

    private RuleProvider<SettlementDateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
