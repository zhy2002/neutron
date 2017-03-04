package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageChargePositionNode extends StringUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageChargePositionNode.class;
    }

    private MortgageChargePositionNodeComponent component;

    @Inject
    void createComponent(MortgageChargePositionNodeComponent.Builder builder) {
        this.component = builder.setMortgageChargePositionNodeModule(new MortgageChargePositionNodeModule(this)).build();
    }

    @Override
    protected MortgageChargePositionNodeRuleProvider getRuleProvider() {
        return component.getMortgageChargePositionNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgageChargePositionNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
