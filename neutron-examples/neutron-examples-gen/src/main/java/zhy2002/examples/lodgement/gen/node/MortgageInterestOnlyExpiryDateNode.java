package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MortgageInterestOnlyExpiryDateNode extends StringUiNode<ExistingMortgageNode> {
    private MortgageInterestOnlyExpiryDateNodeComponent component;

    public MortgageInterestOnlyExpiryDateNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageInterestOnlyExpiryDateNode.class;
    }

    @Inject
    void createComponent(MortgageInterestOnlyExpiryDateNodeComponent.Builder builder) {
        this.component = builder.setMortgageInterestOnlyExpiryDateNodeModule(new MortgageInterestOnlyExpiryDateNodeModule(this)).build();
    }

    private RuleProvider<MortgageInterestOnlyExpiryDateNode> getRuleProvider() {
        return component.getMortgageInterestOnlyExpiryDateNodeRuleProvider();
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

    private RuleProvider<MortgageInterestOnlyExpiryDateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
