package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SettlementDateNode extends StringUiNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SettlementDateNode.class;
    }

    private SettlementDateNodeComponent component;

    @Inject
    void createComponent(SettlementDateNodeComponent.Builder builder) {
        this.component = builder.setSettlementDateNodeModule(new SettlementDateNodeModule(this)).build();
    }

    @Override
    protected SettlementDateNodeRuleProvider getRuleProvider() {
        return component.getSettlementDateNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public SettlementDateNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
