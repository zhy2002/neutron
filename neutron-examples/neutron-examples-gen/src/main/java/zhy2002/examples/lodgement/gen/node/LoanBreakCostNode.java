package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LoanBreakCostNode extends BaseCurrencyNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanBreakCostNode.class;
    }

    private LoanBreakCostNodeComponent component;

    @Inject
    void createComponent(LoanBreakCostNodeComponent.Builder builder) {
        this.component = builder.setLoanBreakCostNodeModule(new LoanBreakCostNodeModule(this)).build();
    }

    private RuleProvider<LoanBreakCostNode> getRuleProvider() {
        return component.getLoanBreakCostNodeRuleProvider();
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

    private RuleProvider<LoanBreakCostNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public LoanBreakCostNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}
