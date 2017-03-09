package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class PropertyAddressNode extends StringUiNode<PropertyDetailsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyAddressNode.class;
    }

    private PropertyAddressNodeComponent component;

    @Inject
    void createComponent(PropertyAddressNodeComponent.Builder builder) {
        this.component = builder.setPropertyAddressNodeModule(new PropertyAddressNodeModule(this)).build();
    }

    private PropertyAddressNodeRuleProvider getRuleProvider() {
        return component.getPropertyAddressNodeRuleProvider();
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

    private RuleProvider<PropertyAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PropertyAddressNode(@NotNull PropertyDetailsNode parent, String name) {
        super(parent, name);
    }

}
