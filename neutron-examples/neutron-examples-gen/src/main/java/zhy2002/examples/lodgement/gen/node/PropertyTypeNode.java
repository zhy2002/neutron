package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PropertyTypeNode extends StringUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyTypeNode.class;
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


    public PropertyTypeNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
