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

    @Inject
    void receiveNodeProvider(AddressRefListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return AddressRefListNode.class;
    }

    private AddressRefListNodeComponent component;

    @Inject
    void createComponent(AddressRefListNodeComponent.Builder builder) {
        this.component = builder.setAddressRefListNodeModule(new AddressRefListNodeModule(this)).build();
    }

    private AddressRefListNodeRuleProvider getRuleProvider() {
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

    public AddressRefListNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<AddressRefNode> getItemClass() {
        return AddressRefNode.class;
    }

    @Override
    public NodeAddEvent<AddressRefNode> createItemAddEvent(String name) {
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<AddressRefNode> createItemRemoveEvent(AddressRefNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
