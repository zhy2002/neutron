package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageClearingFlagNode extends BooleanUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageClearingFlagNode.class;
    }

    private MortgageClearingFlagNodeComponent component;

    @Inject
    void createComponent(MortgageClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setMortgageClearingFlagNodeModule(new MortgageClearingFlagNodeModule(this)).build();
    }

    @Override
    protected MortgageClearingFlagNodeRuleProvider getRuleProvider() {
        return component.getMortgageClearingFlagNodeRuleProvider();
    }

    public MortgageClearingFlagNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
