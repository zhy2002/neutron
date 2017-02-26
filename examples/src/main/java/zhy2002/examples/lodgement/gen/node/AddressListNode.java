package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class AddressListNode extends ListUiNode<ApplicationNode,AddressRefUiNode> {

    private AddressListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(AddressListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return AddressListNode.class;
    }

    private AddressListNodeComponent component;

    @Inject
    void createComponent(AddressListNodeComponent.Builder builder) {
        this.component = builder.setAddressListNodeModule(new AddressListNodeModule(this)).build();
    }

    @Override
    protected AddressListNodeRuleProvider getRuleProvider() {
        return component.getAddressListNodeRuleProvider();
    }

    public AddressListNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<AddressRefUiNode> getItemClass() {
        return AddressRefUiNode.class;
    }

    public NodeAddEvent<AddressRefUiNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<AddressRefUiNode> createItemRemoveEvent(AddressRefUiNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
