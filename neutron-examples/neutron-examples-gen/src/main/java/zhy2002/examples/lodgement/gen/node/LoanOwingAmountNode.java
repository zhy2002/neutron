package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LoanOwingAmountNode extends BaseCurrencyNode<LoanNode> {
    private LoanOwingAmountNodeComponent component;

    public LoanOwingAmountNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return LoanOwingAmountNode.class;
    }

    @Inject
    void createComponent(LoanOwingAmountNodeComponent.Builder builder) {
        this.component = builder.setLoanOwingAmountNodeModule(new LoanOwingAmountNodeModule(this)).build();
    }

    private RuleProvider<LoanOwingAmountNode> getRuleProvider() {
        return component.getLoanOwingAmountNodeRuleProvider();
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

    private RuleProvider<LoanOwingAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
