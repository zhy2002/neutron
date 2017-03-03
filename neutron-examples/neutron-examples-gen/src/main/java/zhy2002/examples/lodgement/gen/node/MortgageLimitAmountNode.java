package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageLimitAmountNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageLimitAmountNode.class;
    }

    private MortgageLimitAmountNodeComponent component;

    @Inject
    void createComponent(MortgageLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setMortgageLimitAmountNodeModule(new MortgageLimitAmountNodeModule(this)).build();
    }

    @Override
    protected MortgageLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getMortgageLimitAmountNodeRuleProvider();
    }

    public MortgageLimitAmountNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}