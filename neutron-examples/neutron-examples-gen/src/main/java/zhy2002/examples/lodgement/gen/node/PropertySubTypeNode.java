package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PropertySubTypeNode extends StringUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertySubTypeNode.class;
    }

    private PropertySubTypeNodeComponent component;

    @Inject
    void createComponent(PropertySubTypeNodeComponent.Builder builder) {
        this.component = builder.setPropertySubTypeNodeModule(new PropertySubTypeNodeModule(this)).build();
    }

    @Override
    protected PropertySubTypeNodeRuleProvider getRuleProvider() {
        return component.getPropertySubTypeNodeRuleProvider();
    }

    public PropertySubTypeNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
