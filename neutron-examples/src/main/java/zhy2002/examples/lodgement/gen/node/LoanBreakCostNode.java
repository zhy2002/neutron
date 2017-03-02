package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected LoanBreakCostNodeRuleProvider getRuleProvider() {
        return component.getLoanBreakCostNodeRuleProvider();
    }

    public LoanBreakCostNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}
