package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PreviousEmploymentListNode extends ListUiNode<PersonNode,PreviousEmploymentNode> {

    private PreviousEmploymentListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(PreviousEmploymentListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PreviousEmploymentListNode.class;
    }

    private PreviousEmploymentListNodeComponent component;

    @Inject
    void createComponent(PreviousEmploymentListNodeComponent.Builder builder) {
        this.component = builder.setPreviousEmploymentListNodeModule(new PreviousEmploymentListNodeModule(this)).build();
    }

    @Override
    protected PreviousEmploymentListNodeRuleProvider getRuleProvider() {
        return component.getPreviousEmploymentListNodeRuleProvider();
    }

    public PreviousEmploymentListNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<PreviousEmploymentNode> getItemClass() {
        return PreviousEmploymentNode.class;
    }

    public NodeAddEvent<PreviousEmploymentNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<PreviousEmploymentNode> createItemRemoveEvent(PreviousEmploymentNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Previous Employment");
    }

}
