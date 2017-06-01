package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.UsedAsSecurityFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class UsedAsSecurityFlagNode extends BooleanUiNode<UsageNode> {

    @Inject
    public UsedAsSecurityFlagNode(@Owner UsageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UsedAsSecurityFlagNode.class;
    }

    protected final UsedAsSecurityFlagNodeComponent getComponent() {
        return component;
    }


    private UsedAsSecurityFlagNodeComponent component;

    @Inject
    void createComponent(UsedAsSecurityFlagNodeComponent.Builder builder) {
        this.component = builder.setUsedAsSecurityFlagNodeModule(new UsedAsSecurityFlagNodeModule(this)).build();
    }

    private RuleProvider<UsedAsSecurityFlagNode> getRuleProvider() {
        return component.getUsedAsSecurityFlagNodeRuleProvider();
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

    private RuleProvider<UsedAsSecurityFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
