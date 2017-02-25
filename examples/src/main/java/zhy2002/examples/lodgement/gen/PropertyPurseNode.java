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

public class PropertyPurseNode extends BooleanUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyPurseNode.class;
    }

    private PropertyPurseNodeComponent component;

    @Inject
    void createComponent(PropertyPurseNodeComponent.Builder builder) {
        this.component = builder.setPropertyPurseNodeModule(new PropertyPurseNodeModule(this)).build();
    }

    @Override
    protected PropertyPurseNodeRuleProvider getRuleProvider() {
        return component.getPropertyPurseNodeRuleProvider();
    }

    public PropertyPurseNode(PropertyNode parent, String name) {
        super(parent, name);
    }

}
