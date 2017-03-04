package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected PropertyOwnershipListNodeRuleProvider getRuleProvider() {
        return component.getPropertyOwnershipListNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PropertyOwnershipListNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
