package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;


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

    @Override
    protected PropertyAddressNodeRuleProvider getRuleProvider() {
        return component.getPropertyAddressNodeRuleProvider();
    }

    public PropertyAddressNode(@NotNull PropertyDetailsNode parent, String name) {
        super(parent, name);
    }

}
