package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LoanClearingFlagNode extends BooleanUiNode<LoanNode> {

    private LoanClearingFlagNodeComponent component;

    @Inject
    public LoanClearingFlagNode(@Owner LoanNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanClearingFlagNode.class;
    }

    @Inject
    void createComponent(LoanClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setLoanClearingFlagNodeModule(new LoanClearingFlagNodeModule(this)).build();
    }

    private RuleProvider<LoanClearingFlagNode> getRuleProvider() {
        return component.getLoanClearingFlagNodeRuleProvider();
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

    private RuleProvider<LoanClearingFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
