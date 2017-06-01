package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageChargePositionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageChargePositionNode extends StringUiNode<ExistingMortgageNode> {

    @Inject
    public MortgageChargePositionNode(@Owner ExistingMortgageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageChargePositionNode.class;
    }

    protected final MortgageChargePositionNodeComponent getComponent() {
        return component;
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

}
