package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertyWeeklyRentNode extends BigDecimalUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyWeeklyRentNode.class;
    }

    private PropertyWeeklyRentNodeComponent component;

    @Inject
    void createComponent(PropertyWeeklyRentNodeComponent.Builder builder) {
        this.component = builder.setPropertyWeeklyRentNodeModule(new PropertyWeeklyRentNodeModule(this)).build();
    }

    private PropertyWeeklyRentNodeRuleProvider getRuleProvider() {
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

    public PropertyWeeklyRentNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
