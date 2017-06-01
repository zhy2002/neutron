package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RentedFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RentedFlagNode extends BooleanUiNode<PropertyNode> {

    @Inject
    public RentedFlagNode(@Owner PropertyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RentedFlagNode.class;
    }

    protected final RentedFlagNodeComponent getComponent() {
        return component;
    }


    private RentedFlagNodeComponent component;

    @Inject
    void createComponent(RentedFlagNodeComponent.Builder builder) {
        this.component = builder.setRentedFlagNodeModule(new RentedFlagNodeModule(this)).build();
    }

    private RuleProvider<RentedFlagNode> getRuleProvider() {
        return component.getRentedFlagNodeRuleProvider();
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

    private RuleProvider<RentedFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
