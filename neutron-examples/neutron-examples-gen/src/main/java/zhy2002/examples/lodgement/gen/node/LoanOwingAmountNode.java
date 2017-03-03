package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class LoanOwingAmountNode extends BaseCurrencyNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanOwingAmountNode.class;
    }

    private LoanOwingAmountNodeComponent component;

    @Inject
    void createComponent(LoanOwingAmountNodeComponent.Builder builder) {
        this.component = builder.setLoanOwingAmountNodeModule(new LoanOwingAmountNodeModule(this)).build();
    }

    @Override
    protected LoanOwingAmountNodeRuleProvider getRuleProvider() {
        return component.getLoanOwingAmountNodeRuleProvider();
    }

    public LoanOwingAmountNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}