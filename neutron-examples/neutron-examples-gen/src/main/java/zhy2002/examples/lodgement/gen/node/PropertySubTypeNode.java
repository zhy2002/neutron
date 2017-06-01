package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PropertySubTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertySubTypeNode extends StringUiNode<PropertyNode> {

    @Inject
    public PropertySubTypeNode(@Owner PropertyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertySubTypeNode.class;
    }

    protected final PropertySubTypeNodeComponent getComponent() {
        return component;
    }


    private PropertySubTypeNodeComponent component;

    @Inject
    void createComponent(PropertySubTypeNodeComponent.Builder builder) {
        this.component = builder.setPropertySubTypeNodeModule(new PropertySubTypeNodeModule(this)).build();
    }

    private RuleProvider<PropertySubTypeNode> getRuleProvider() {
        return component.getPropertySubTypeNodeRuleProvider();
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

    private RuleProvider<PropertySubTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
