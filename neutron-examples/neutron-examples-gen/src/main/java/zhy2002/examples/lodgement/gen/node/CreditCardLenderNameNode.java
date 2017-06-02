package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardLenderNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardLenderNameNode extends StringUiNode<CreditCardNode> {

    @Inject
    protected CreditCardLenderNameNode(@Owner CreditCardNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardLenderNameNode.class;
    }

    protected final CreditCardLenderNameNodeComponent getComponent() {
        return component;
    }


    private CreditCardLenderNameNodeComponent component;

    @Inject
    void createComponent(CreditCardLenderNameNodeComponent.Builder builder) {
        this.component = builder.setCreditCardLenderNameNodeModule(new CreditCardLenderNameNodeModule(this)).build();
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
