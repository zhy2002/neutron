package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditCardClearingFlagNode extends BooleanUiNode<CreditCardNode> {
    private CreditCardClearingFlagNodeComponent component;

    public CreditCardClearingFlagNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardClearingFlagNode.class;
    }

    @Inject
    void createComponent(CreditCardClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setCreditCardClearingFlagNodeModule(new CreditCardClearingFlagNodeModule(this)).build();
    }

    private RuleProvider<CreditCardClearingFlagNode> getRuleProvider() {
        return component.getCreditCardClearingFlagNodeRuleProvider();
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

    private RuleProvider<CreditCardClearingFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
