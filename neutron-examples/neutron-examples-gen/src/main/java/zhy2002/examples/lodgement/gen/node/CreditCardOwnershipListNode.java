package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardOwnershipListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardOwnershipListNode extends OwnershipListNode<CreditCardNode> {

    @Inject
    protected CreditCardOwnershipListNode(@Owner CreditCardNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardOwnershipListNode.class;
    }

    protected final CreditCardOwnershipListNodeComponent getComponent() {
        return component;
    }


    private CreditCardOwnershipListNodeComponent component;

    @Inject
    void createComponent(CreditCardOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setCreditCardOwnershipListNodeModule(new CreditCardOwnershipListNodeModule(this)).build();
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
