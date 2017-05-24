package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

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

    private RuleProvider<MortgageChargePositionNode> getRuleProvider() {
        return component.getMortgageChargePositionNodeRuleProvider();
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

    private RuleProvider<MortgageChargePositionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public MortgageChargePositionNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
