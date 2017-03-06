package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RelatedPartyListNode extends ListUiNode<AdditionalNode,RelatedPartyNode> {

    private RelatedPartyListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(RelatedPartyListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return RelatedPartyListNode.class;
    }

    private RelatedPartyListNodeComponent component;

    @Inject
    void createComponent(RelatedPartyListNodeComponent.Builder builder) {
        this.component = builder.setRelatedPartyListNodeModule(new RelatedPartyListNodeModule(this)).build();
    }

    private RelatedPartyListNodeRuleProvider getRuleProvider() {
        return component.getRelatedPartyListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public RelatedPartyListNode(@NotNull AdditionalNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<RelatedPartyNode> getItemClass() {
        return RelatedPartyNode.class;
    }

    public NodeAddEvent<RelatedPartyNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<RelatedPartyNode> createItemRemoveEvent(RelatedPartyNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
