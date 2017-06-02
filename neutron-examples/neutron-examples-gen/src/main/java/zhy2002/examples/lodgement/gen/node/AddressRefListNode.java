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
    protected AddressRefListNode(@Owner ApplicationNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<AddressRefNode> getItemClass() {
        return AddressRefNode.class;
    }

    @Override
    public NodeAddEvent<AddressRefNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        AddressRefNode item = getComponent().createAddressRefNode();
        setNameOfChildBeingCreated(null);
        return new AddressRefNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<AddressRefNode> createItemRemoveEvent(AddressRefNode item) {
        return new AddressRefNodeRemoveEvent(item);
    }

}
