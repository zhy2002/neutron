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

    public PropertySubTypeNode(PropertyNode parent, String name) {
        super(parent, name);
    }

}
