package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OwnershipPercentageNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OwnershipPercentageNode extends BasePercentageNode<OwnershipNode> {

    @Inject
    public OwnershipPercentageNode(@Owner OwnershipNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwnershipPercentageNode.class;
    }

    protected final OwnershipPercentageNodeComponent getComponent() {
        return component;
    }


    private OwnershipPercentageNodeComponent component;

    @Inject
    void createComponent(OwnershipPercentageNodeComponent.Builder builder) {
        this.component = builder.setOwnershipPercentageNodeModule(new OwnershipPercentageNodeModule(this)).build();
    }

    private RuleProvider<OwnershipPercentageNode> getRuleProvider() {
        return component.getOwnershipPercentageNodeRuleProvider();
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

    private RuleProvider<OwnershipPercentageNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
