package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.PropertyStateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class PropertyStateNode extends StringUiNode<PropertyDetailsNode> {

    @Inject
    public PropertyStateNode(@Owner PropertyDetailsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyStateNode.class;
    }

    protected final PropertyStateNodeComponent getComponent() {
        return component;
    }


    private PropertyStateNodeComponent component;

    @Inject
    void createComponent(PropertyStateNodeComponent.Builder builder) {
        this.component = builder.setPropertyStateNodeModule(new PropertyStateNodeModule(this)).build();
    }

    private RuleProvider<PropertyStateNode> getRuleProvider() {
        return component.getPropertyStateNodeRuleProvider();
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

    private RuleProvider<PropertyStateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
