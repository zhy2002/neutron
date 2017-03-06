package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class ReceiveOffersNode extends BooleanUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ReceiveOffersNode.class;
    }

    private ReceiveOffersNodeComponent component;

    @Inject
    void createComponent(ReceiveOffersNodeComponent.Builder builder) {
        this.component = builder.setReceiveOffersNodeModule(new ReceiveOffersNodeModule(this)).build();
    }

    private ReceiveOffersNodeRuleProvider getRuleProvider() {
        return component.getReceiveOffersNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ReceiveOffersNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

}
