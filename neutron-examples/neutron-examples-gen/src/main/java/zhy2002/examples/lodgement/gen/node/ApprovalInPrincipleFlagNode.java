package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ApprovalInPrincipleFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ApprovalInPrincipleFlagNode extends BooleanUiNode<UsageNode> {

    @Inject
    public ApprovalInPrincipleFlagNode(@Owner UsageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ApprovalInPrincipleFlagNode.class;
    }

    protected final ApprovalInPrincipleFlagNodeComponent getComponent() {
        return component;
    }


    private ApprovalInPrincipleFlagNodeComponent component;

    @Inject
    void createComponent(ApprovalInPrincipleFlagNodeComponent.Builder builder) {
        this.component = builder.setApprovalInPrincipleFlagNodeModule(new ApprovalInPrincipleFlagNodeModule(this)).build();
    }

    private RuleProvider<ApprovalInPrincipleFlagNode> getRuleProvider() {
        return component.getApprovalInPrincipleFlagNodeRuleProvider();
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

    private RuleProvider<ApprovalInPrincipleFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
