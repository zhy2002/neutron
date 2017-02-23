package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class AddressListNode extends ListUiNode<ApplicationNode,AddressRefUiNode>
{
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

    public AddressListNode(ApplicationNode parent, String name) {
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
