package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanMonthlyRepaymentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LoanMonthlyRepaymentNode extends BaseCurrencyNode<LoanNode> {

    @Inject
    protected LoanMonthlyRepaymentNode(@Owner LoanNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanMonthlyRepaymentNode.class;
    }

    protected final LoanMonthlyRepaymentNodeComponent getComponent() {
        return component;
    }


    private LoanMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(LoanMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setLoanMonthlyRepaymentNodeModule(new LoanMonthlyRepaymentNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
