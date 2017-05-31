package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;

public class ReceiveOffersNode extends BooleanUiNode<RegisterNode> {
    private ReceiveOffersNodeComponent component;

    public ReceiveOffersNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ReceiveOffersNode.class;
    }

    @Inject
    void createComponent(ReceiveOffersNodeComponent.Builder builder) {
        this.component = builder.setReceiveOffersNodeModule(new ReceiveOffersNodeModule(this)).build();
    }

    private RuleProvider<ReceiveOffersNode> getRuleProvider() {
        return component.getReceiveOffersNodeRuleProvider();
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

    private RuleProvider<ReceiveOffersNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
