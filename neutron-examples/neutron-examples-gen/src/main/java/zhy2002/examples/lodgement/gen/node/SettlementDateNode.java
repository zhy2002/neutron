package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SettlementDateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SettlementDateNode extends StringUiNode<ProductsNode> {

    @Inject
    public SettlementDateNode(@Owner ProductsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SettlementDateNode.class;
    }

    protected final SettlementDateNodeComponent getComponent() {
        return component;
    }


    private SettlementDateNodeComponent component;

    @Inject
    void createComponent(SettlementDateNodeComponent.Builder builder) {
        this.component = builder.setSettlementDateNodeModule(new SettlementDateNodeModule(this)).build();
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
