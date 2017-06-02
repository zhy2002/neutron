package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.ReceiveOffersNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class ReceiveOffersNode extends BooleanUiNode<RegisterNode> {

    @Inject
    protected ReceiveOffersNode(@Owner RegisterNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ReceiveOffersNode.class;
    }

    protected final ReceiveOffersNodeComponent getComponent() {
        return component;
    }


    private ReceiveOffersNodeComponent component;

    @Inject
    void createComponent(ReceiveOffersNodeComponent.Builder builder) {
        this.component = builder.setReceiveOffersNodeModule(new ReceiveOffersNodeModule(this)).build();
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
