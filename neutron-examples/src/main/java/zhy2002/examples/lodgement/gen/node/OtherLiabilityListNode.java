package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherLiabilityListNode extends ListUiNode<LiabilitiesNode,OtherLiabilityNode> {

    private OtherLiabilityListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(OtherLiabilityListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityListNode.class;
    }

    private OtherLiabilityListNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityListNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityListNodeModule(new OtherLiabilityListNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityListNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityListNodeRuleProvider();
    }

    public OtherLiabilityListNode(@NotNull LiabilitiesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<OtherLiabilityNode> getItemClass() {
        return OtherLiabilityNode.class;
    }

    public NodeAddEvent<OtherLiabilityNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<OtherLiabilityNode> createItemRemoveEvent(OtherLiabilityNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
