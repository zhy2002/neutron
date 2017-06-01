package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PrimarySecurityFlagNode extends BooleanUiNode<UsageNode> {

    private PrimarySecurityFlagNodeComponent component;

    @Inject
    public PrimarySecurityFlagNode(@Owner UsageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PrimarySecurityFlagNode.class;
    }

    @Inject
    void createComponent(PrimarySecurityFlagNodeComponent.Builder builder) {
        this.component = builder.setPrimarySecurityFlagNodeModule(new PrimarySecurityFlagNodeModule(this)).build();
    }

    private RuleProvider<PrimarySecurityFlagNode> getRuleProvider() {
        return component.getPrimarySecurityFlagNodeRuleProvider();
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

    private RuleProvider<PrimarySecurityFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
