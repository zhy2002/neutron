package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private PropertyPurseNodeRuleProvider getRuleProvider() {
        return component.getPropertyPurseNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public PropertyPurseNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
