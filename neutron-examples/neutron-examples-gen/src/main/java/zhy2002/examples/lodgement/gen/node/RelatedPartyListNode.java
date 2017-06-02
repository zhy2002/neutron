package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RelatedPartyListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class RelatedPartyListNode extends ListUiNode<AdditionalNode,RelatedPartyNode> {

    @Inject
    protected RelatedPartyListNode(@Owner AdditionalNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RelatedPartyListNode.class;
    }

    protected final RelatedPartyListNodeComponent getComponent() {
        return component;
    }


    private RelatedPartyListNodeComponent component;

    @Inject
    void createComponent(RelatedPartyListNodeComponent.Builder builder) {
        this.component = builder.setRelatedPartyListNodeModule(new RelatedPartyListNodeModule(this)).build();
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
    public Class<RelatedPartyNode> getItemClass() {
        return RelatedPartyNode.class;
    }

    @Override
    public NodeAddEvent<RelatedPartyNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        RelatedPartyNode item = getComponent().createRelatedPartyNode();
        setNameOfChildBeingCreated(null);
        return new RelatedPartyNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<RelatedPartyNode> createItemRemoveEvent(RelatedPartyNode item) {
        return new RelatedPartyNodeRemoveEvent(item);
    }

}
