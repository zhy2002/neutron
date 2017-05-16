package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MortgageBorrowerRateNode extends BasePercentageNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageBorrowerRateNode.class;
    }

    private MortgageBorrowerRateNodeComponent component;

    @Inject
    void createComponent(MortgageBorrowerRateNodeComponent.Builder builder) {
        this.component = builder.setMortgageBorrowerRateNodeModule(new MortgageBorrowerRateNodeModule(this)).build();
    }

    private RuleProvider<MortgageBorrowerRateNode> getRuleProvider() {
        return component.getMortgageBorrowerRateNodeRuleProvider();
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

    private RuleProvider<MortgageBorrowerRateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public MortgageBorrowerRateNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
