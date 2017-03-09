package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ApprovalInPrincipleFlagNode extends BooleanUiNode<UsageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ApprovalInPrincipleFlagNode.class;
    }

    private ApprovalInPrincipleFlagNodeComponent component;

    @Inject
    void createComponent(ApprovalInPrincipleFlagNodeComponent.Builder builder) {
        this.component = builder.setApprovalInPrincipleFlagNodeModule(new ApprovalInPrincipleFlagNodeModule(this)).build();
    }

    private ApprovalInPrincipleFlagNodeRuleProvider getRuleProvider() {
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

    public ApprovalInPrincipleFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

}
