package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AverageFlagNode extends BooleanUiNode<OwnershipNode> {

    private AverageFlagNodeComponent component;

    @Inject
    public AverageFlagNode(@Owner OwnershipNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AverageFlagNode.class;
    }

    @Inject
    void createComponent(AverageFlagNodeComponent.Builder builder) {
        this.component = builder.setAverageFlagNodeModule(new AverageFlagNodeModule(this)).build();
    }

    private RuleProvider<AverageFlagNode> getRuleProvider() {
        return component.getAverageFlagNodeRuleProvider();
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

    private RuleProvider<AverageFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
