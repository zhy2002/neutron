package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
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

    public PropertyPurseNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
