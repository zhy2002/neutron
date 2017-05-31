package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AddressRefListNode extends ListUiNode<ApplicationNode,AddressRefNode> {
    private AddressRefListNodeItemFactory itemFactory;
    private AddressRefListNodeComponent component;

    public AddressRefListNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return AddressRefListNode.class;
    }

    @Inject
    void receiveNodeProvider(AddressRefListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

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
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<AddressRefNode> createItemRemoveEvent(AddressRefNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
