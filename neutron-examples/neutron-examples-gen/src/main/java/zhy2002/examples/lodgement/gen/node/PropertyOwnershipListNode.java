package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertyOwnershipListNode extends OwnershipListNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyOwnershipListNode.class;
    }

    private PropertyOwnershipListNodeComponent component;

    @Inject
    void createComponent(PropertyOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setPropertyOwnershipListNodeModule(new PropertyOwnershipListNodeModule(this)).build();
    }

    private PropertyOwnershipListNodeRuleProvider getRuleProvider() {
        return component.getPropertyOwnershipListNodeRuleProvider();
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

    private RuleProvider<PropertyOwnershipListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PropertyOwnershipListNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
