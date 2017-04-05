package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageTermRemainingPeriodNode extends StringUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageTermRemainingPeriodNode.class;
    }

    private MortgageTermRemainingPeriodNodeComponent component;

    @Inject
    void createComponent(MortgageTermRemainingPeriodNodeComponent.Builder builder) {
        this.component = builder.setMortgageTermRemainingPeriodNodeModule(new MortgageTermRemainingPeriodNodeModule(this)).build();
    }

    private RuleProvider<MortgageTermRemainingPeriodNode> getRuleProvider() {
        return component.getMortgageTermRemainingPeriodNodeRuleProvider();
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

    private RuleProvider<MortgageTermRemainingPeriodNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public MortgageTermRemainingPeriodNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
