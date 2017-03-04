package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
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

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ApprovalInPrincipleFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setValue(null);
    }

}
