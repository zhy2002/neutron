package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PropertyTypeNode extends StringUiNode<PropertyNode>
{
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

    public PropertyTypeNode(PropertyNode parent, String name) {
        super(parent, name);
    }

}
