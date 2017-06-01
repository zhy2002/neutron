package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanClearingFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LoanClearingFlagNode extends BooleanUiNode<LoanNode> {

    @Inject
    public LoanClearingFlagNode(@Owner LoanNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanClearingFlagNode.class;
    }

    protected final LoanClearingFlagNodeComponent getComponent() {
        return component;
    }


    private LoanClearingFlagNodeComponent component;

    @Inject
    void createComponent(LoanClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setLoanClearingFlagNodeModule(new LoanClearingFlagNodeModule(this)).build();
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
