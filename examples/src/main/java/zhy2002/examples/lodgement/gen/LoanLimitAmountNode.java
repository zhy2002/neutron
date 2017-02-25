package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class LoanLimitAmountNode extends BaseCurrencyNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanLimitAmountNode.class;
    }

    private LoanLimitAmountNodeComponent component;

    @Inject
    void createComponent(LoanLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setLoanLimitAmountNodeModule(new LoanLimitAmountNodeModule(this)).build();
    }

    @Override
    protected LoanLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getLoanLimitAmountNodeRuleProvider();
    }

    public LoanLimitAmountNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}
