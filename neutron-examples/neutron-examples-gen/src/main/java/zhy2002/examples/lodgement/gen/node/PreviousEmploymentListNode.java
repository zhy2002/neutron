package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private PreviousEmploymentListNodeRuleProvider getRuleProvider() {
        return component.getPreviousEmploymentListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
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

}
