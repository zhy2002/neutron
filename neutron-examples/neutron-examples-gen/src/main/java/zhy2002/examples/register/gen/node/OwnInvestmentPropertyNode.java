package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.OwnInvestmentPropertyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class OwnInvestmentPropertyNode extends BooleanUiNode<RegisterNode> {

    @Inject
    public OwnInvestmentPropertyNode(@Owner RegisterNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwnInvestmentPropertyNode.class;
    }

    protected final OwnInvestmentPropertyNodeComponent getComponent() {
        return component;
    }


    private OwnInvestmentPropertyNodeComponent component;

    @Inject
    void createComponent(OwnInvestmentPropertyNodeComponent.Builder builder) {
        this.component = builder.setOwnInvestmentPropertyNodeModule(new OwnInvestmentPropertyNodeModule(this)).build();
    }

    private RuleProvider<OwnInvestmentPropertyNode> getRuleProvider() {
        return component.getOwnInvestmentPropertyNodeRuleProvider();
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

    private RuleProvider<OwnInvestmentPropertyNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
