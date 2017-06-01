package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanLimitAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LoanLimitAmountNode extends BaseCurrencyNode<LoanNode> {

    @Inject
    public LoanLimitAmountNode(@Owner LoanNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanLimitAmountNode.class;
    }

    protected final LoanLimitAmountNodeComponent getComponent() {
        return component;
    }


    private LoanLimitAmountNodeComponent component;

    @Inject
    void createComponent(LoanLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setLoanLimitAmountNodeModule(new LoanLimitAmountNodeModule(this)).build();
    }

    private RuleProvider<LoanLimitAmountNode> getRuleProvider() {
        return component.getLoanLimitAmountNodeRuleProvider();
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

    private RuleProvider<LoanLimitAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
