package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CreditCardClearingFlagNode extends BooleanUiNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardClearingFlagNode.class;
    }

    private CreditCardClearingFlagNodeComponent component;

    @Inject
    void createComponent(CreditCardClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setCreditCardClearingFlagNodeModule(new CreditCardClearingFlagNodeModule(this)).build();
    }

    @Override
    protected CreditCardClearingFlagNodeRuleProvider getRuleProvider() {
        return component.getCreditCardClearingFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CreditCardClearingFlagNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
