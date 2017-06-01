package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanOwingAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LoanOwingAmountNode extends BaseCurrencyNode<LoanNode> {

    @Inject
    public LoanOwingAmountNode(@Owner LoanNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanOwingAmountNode.class;
    }

    protected final LoanOwingAmountNodeComponent getComponent() {
        return component;
    }


    private LoanOwingAmountNodeComponent component;

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
