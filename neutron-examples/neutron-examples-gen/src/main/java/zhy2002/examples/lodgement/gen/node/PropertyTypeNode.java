package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PropertyTypeNode extends StringUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyTypeNode.class;
    }

    private PropertyTypeNodeComponent component;

    @Inject
    void createComponent(PropertyTypeNodeComponent.Builder builder) {
        this.component = builder.setPropertyTypeNodeModule(new PropertyTypeNodeModule(this)).build();
    }

    @Override
    protected PropertyTypeNodeRuleProvider getRuleProvider() {
        return component.getPropertyTypeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PropertyTypeNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
