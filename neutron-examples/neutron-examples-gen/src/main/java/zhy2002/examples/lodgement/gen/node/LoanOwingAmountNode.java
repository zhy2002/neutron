package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private LoanOwingAmountNodeRuleProvider getRuleProvider() {
        return component.getLoanOwingAmountNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public LoanOwingAmountNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}
