package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageInterestOnlyExpiryDateNode extends StringUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageInterestOnlyExpiryDateNode.class;
    }

    private MortgageInterestOnlyExpiryDateNodeComponent component;

    @Inject
    void createComponent(MortgageInterestOnlyExpiryDateNodeComponent.Builder builder) {
        this.component = builder.setMortgageInterestOnlyExpiryDateNodeModule(new MortgageInterestOnlyExpiryDateNodeModule(this)).build();
    }

    @Override
    protected MortgageInterestOnlyExpiryDateNodeRuleProvider getRuleProvider() {
        return component.getMortgageInterestOnlyExpiryDateNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgageInterestOnlyExpiryDateNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
