package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PropertyPurseNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertyPurseNode extends BooleanUiNode<PropertyNode> {

    @Inject
    public PropertyPurseNode(@Owner PropertyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyPurseNode.class;
    }

    protected final PropertyPurseNodeComponent getComponent() {
        return component;
    }


    private PropertyPurseNodeComponent component;

    @Inject
    void createComponent(PropertyPurseNodeComponent.Builder builder) {
        this.component = builder.setPropertyPurseNodeModule(new PropertyPurseNodeModule(this)).build();
    }

    private RuleProvider<PropertyPurseNode> getRuleProvider() {
        return component.getPropertyPurseNodeRuleProvider();
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

    private RuleProvider<PropertyPurseNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
