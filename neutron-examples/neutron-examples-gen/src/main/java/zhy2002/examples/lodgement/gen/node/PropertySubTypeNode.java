package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertySubTypeNode extends StringUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertySubTypeNode.class;
    }

    private PropertySubTypeNodeComponent component;

    @Inject
    void createComponent(PropertySubTypeNodeComponent.Builder builder) {
        this.component = builder.setPropertySubTypeNodeModule(new PropertySubTypeNodeModule(this)).build();
    }

    private PropertySubTypeNodeRuleProvider getRuleProvider() {
        return component.getPropertySubTypeNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public PropertySubTypeNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
