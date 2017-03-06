package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private CreditCardClearingFlagNodeRuleProvider getRuleProvider() {
        return component.getCreditCardClearingFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CreditCardClearingFlagNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
