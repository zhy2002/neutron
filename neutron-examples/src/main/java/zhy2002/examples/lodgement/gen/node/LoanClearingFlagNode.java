package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class LoanClearingFlagNode extends BooleanUiNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanClearingFlagNode.class;
    }

    private LoanClearingFlagNodeComponent component;

    @Inject
    void createComponent(LoanClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setLoanClearingFlagNodeModule(new LoanClearingFlagNodeModule(this)).build();
    }

    @Override
    protected LoanClearingFlagNodeRuleProvider getRuleProvider() {
        return component.getLoanClearingFlagNodeRuleProvider();
    }

    public LoanClearingFlagNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}
