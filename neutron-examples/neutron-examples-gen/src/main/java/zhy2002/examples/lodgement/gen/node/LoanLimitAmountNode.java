package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private LoanLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getLoanLimitAmountNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public LoanLimitAmountNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}
