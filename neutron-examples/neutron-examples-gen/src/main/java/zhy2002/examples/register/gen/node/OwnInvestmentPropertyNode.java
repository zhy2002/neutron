package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;


public class OwnInvestmentPropertyNode extends BooleanUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OwnInvestmentPropertyNode.class;
    }

    private OwnInvestmentPropertyNodeComponent component;

    @Inject
    void createComponent(OwnInvestmentPropertyNodeComponent.Builder builder) {
        this.component = builder.setOwnInvestmentPropertyNodeModule(new OwnInvestmentPropertyNodeModule(this)).build();
    }

    @Override
    protected OwnInvestmentPropertyNodeRuleProvider getRuleProvider() {
        return component.getOwnInvestmentPropertyNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public OwnInvestmentPropertyNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

}
