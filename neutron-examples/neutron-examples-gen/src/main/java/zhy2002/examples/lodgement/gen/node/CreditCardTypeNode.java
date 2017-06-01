package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardTypeNode extends StringUiNode<CreditCardNode> {

    @Inject
    public CreditCardTypeNode(@Owner CreditCardNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardTypeNode.class;
    }

    protected final CreditCardTypeNodeComponent getComponent() {
        return component;
    }


    private CreditCardTypeNodeComponent component;

    @Inject
    void createComponent(CreditCardTypeNodeComponent.Builder builder) {
        this.component = builder.setCreditCardTypeNodeModule(new CreditCardTypeNodeModule(this)).build();
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
