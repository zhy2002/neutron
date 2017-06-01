package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PropertyTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertyTypeNode extends StringUiNode<PropertyNode> {

    @Inject
    public PropertyTypeNode(@Owner PropertyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyTypeNode.class;
    }

    protected final PropertyTypeNodeComponent getComponent() {
        return component;
    }


    private PropertyTypeNodeComponent component;

    @Inject
    void createComponent(PropertyTypeNodeComponent.Builder builder) {
        this.component = builder.setPropertyTypeNodeModule(new PropertyTypeNodeModule(this)).build();
    }

    private RuleProvider<PropertyTypeNode> getRuleProvider() {
        return component.getPropertyTypeNodeRuleProvider();
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

    private RuleProvider<PropertyTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
