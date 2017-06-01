package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PropertySubTypeNode extends StringUiNode<PropertyNode> {

    private PropertySubTypeNodeComponent component;

    @Inject
    public PropertySubTypeNode(@Owner PropertyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertySubTypeNode.class;
    }

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
