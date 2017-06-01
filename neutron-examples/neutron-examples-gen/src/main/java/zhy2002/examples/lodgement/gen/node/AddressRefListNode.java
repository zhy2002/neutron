package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AddressRefListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class AddressRefListNode extends ListUiNode<ApplicationNode,AddressRefNode> {

    @Inject
    public AddressRefListNode(@Owner ApplicationNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AddressRefListNode.class;
    }

    protected final AddressRefListNodeComponent getComponent() {
        return component;
    }


    private AddressRefListNodeComponent component;

    @Inject
    void createComponent(AddressRefListNodeComponent.Builder builder) {
        this.component = builder.setAddressRefListNodeModule(new AddressRefListNodeModule(this)).build();
    }

    private RuleProvider<AddressRefListNode> getRuleProvider() {
        return component.getAddressRefListNodeRuleProvider();
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

    private RuleProvider<AddressRefListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<AddressRefNode> getItemClass() {
        return AddressRefNode.class;
    }

    @Override
    public NodeAddEvent<AddressRefNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        getContext().setNameOfNodeBeingCreated(name);
        AddressRefNode item = getComponent().createAddressRefNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new AddressRefNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<AddressRefNode> createItemRemoveEvent(AddressRefNode item) {
        return new AddressRefNodeRemoveEvent(item);
    }

}
