package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected ApprovalInPrincipleFlagNodeRuleProvider getRuleProvider() {
        return component.getApprovalInPrincipleFlagNodeRuleProvider();
    }

    public ApprovalInPrincipleFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

}
