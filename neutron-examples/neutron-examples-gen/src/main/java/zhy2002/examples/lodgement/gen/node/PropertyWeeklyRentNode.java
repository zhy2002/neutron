package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PropertyWeeklyRentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertyWeeklyRentNode extends BigDecimalUiNode<PropertyNode> {

    @Inject
    public PropertyWeeklyRentNode(@Owner PropertyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyWeeklyRentNode.class;
    }

    protected final PropertyWeeklyRentNodeComponent getComponent() {
        return component;
    }


    private PropertyWeeklyRentNodeComponent component;

    @Inject
    void createComponent(PropertyWeeklyRentNodeComponent.Builder builder) {
        this.component = builder.setPropertyWeeklyRentNodeModule(new PropertyWeeklyRentNodeModule(this)).build();
    }

    private RuleProvider<PropertyWeeklyRentNode> getRuleProvider() {
        return component.getPropertyWeeklyRentNodeRuleProvider();
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

    private RuleProvider<PropertyWeeklyRentNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
