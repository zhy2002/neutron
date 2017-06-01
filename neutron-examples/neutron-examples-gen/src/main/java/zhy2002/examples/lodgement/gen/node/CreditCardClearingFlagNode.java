package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardClearingFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardClearingFlagNode extends BooleanUiNode<CreditCardNode> {

    @Inject
    public CreditCardClearingFlagNode(@Owner CreditCardNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardClearingFlagNode.class;
    }

    protected final CreditCardClearingFlagNodeComponent getComponent() {
        return component;
    }


    private CreditCardClearingFlagNodeComponent component;

    @Inject
    void createComponent(CreditCardClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setCreditCardClearingFlagNodeModule(new CreditCardClearingFlagNodeModule(this)).build();
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
