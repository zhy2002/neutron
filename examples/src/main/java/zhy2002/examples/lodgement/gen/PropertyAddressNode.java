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

public class PropertyAddressNode extends AddressNode<PropertyNode>
{
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

    public PropertyAddressNode(PropertyNode parent, String name) {
        super(parent, name);
    }

}
