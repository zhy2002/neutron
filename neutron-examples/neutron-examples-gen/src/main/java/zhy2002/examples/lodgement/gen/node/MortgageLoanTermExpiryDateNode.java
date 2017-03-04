package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageLoanTermExpiryDateNode extends StringUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageLoanTermExpiryDateNode.class;
    }

    private MortgageLoanTermExpiryDateNodeComponent component;

    @Inject
    void createComponent(MortgageLoanTermExpiryDateNodeComponent.Builder builder) {
        this.component = builder.setMortgageLoanTermExpiryDateNodeModule(new MortgageLoanTermExpiryDateNodeModule(this)).build();
    }

    @Override
    protected MortgageLoanTermExpiryDateNodeRuleProvider getRuleProvider() {
        return component.getMortgageLoanTermExpiryDateNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgageLoanTermExpiryDateNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
