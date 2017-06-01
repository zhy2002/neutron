package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PropertyOwnershipListNode extends OwnershipListNode<PropertyNode> {

    private PropertyOwnershipListNodeComponent component;

    @Inject
    public PropertyOwnershipListNode(@Owner PropertyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyOwnershipListNode.class;
    }

    @Inject
    void createComponent(PropertyOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setPropertyOwnershipListNodeModule(new PropertyOwnershipListNodeModule(this)).build();
    }

    private RuleProvider<PropertyOwnershipListNode> getRuleProvider() {
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

}
