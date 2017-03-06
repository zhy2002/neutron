package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private MortgageLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getMortgageLimitAmountNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public MortgageLimitAmountNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
