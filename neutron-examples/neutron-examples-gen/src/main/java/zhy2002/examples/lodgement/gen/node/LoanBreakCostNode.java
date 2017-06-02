package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanBreakCostNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LoanBreakCostNode extends BaseCurrencyNode<LoanNode> {

    @Inject
    protected LoanBreakCostNode(@Owner LoanNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanBreakCostNode.class;
    }

    protected final LoanBreakCostNodeComponent getComponent() {
        return component;
    }


    private LoanBreakCostNodeComponent component;

    @Inject
    void createComponent(LoanBreakCostNodeComponent.Builder builder) {
        this.component = builder.setLoanBreakCostNodeModule(new LoanBreakCostNodeModule(this)).build();
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
