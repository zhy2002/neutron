package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageLoanTypeNode extends StringUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageLoanTypeNode.class;
    }

    private MortgageLoanTypeNodeComponent component;

    @Inject
    void createComponent(MortgageLoanTypeNodeComponent.Builder builder) {
        this.component = builder.setMortgageLoanTypeNodeModule(new MortgageLoanTypeNodeModule(this)).build();
    }

    @Override
    protected MortgageLoanTypeNodeRuleProvider getRuleProvider() {
        return component.getMortgageLoanTypeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MortgageLoanTypeNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
