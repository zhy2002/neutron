package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PreviousEmploymentListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class PreviousEmploymentListNode extends ListUiNode<PersonNode,PreviousEmploymentNode> {

    @Inject
    public PreviousEmploymentListNode(@Owner PersonNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PreviousEmploymentListNode.class;
    }

    protected final PreviousEmploymentListNodeComponent getComponent() {
        return component;
    }


    private PreviousEmploymentListNodeComponent component;

    @Inject
    void createComponent(PreviousEmploymentListNodeComponent.Builder builder) {
        this.component = builder.setPreviousEmploymentListNodeModule(new PreviousEmploymentListNodeModule(this)).build();
    }

    private RuleProvider<PreviousEmploymentListNode> getRuleProvider() {
        return component.getPreviousEmploymentListNodeRuleProvider();
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

    private RuleProvider<PreviousEmploymentListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<PreviousEmploymentNode> getItemClass() {
        return PreviousEmploymentNode.class;
    }

    @Override
    public NodeAddEvent<PreviousEmploymentNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        getContext().setNameOfNodeBeingCreated(name);
        PreviousEmploymentNode item = getComponent().createPreviousEmploymentNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new PreviousEmploymentNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<PreviousEmploymentNode> createItemRemoveEvent(PreviousEmploymentNode item) {
        return new PreviousEmploymentNodeRemoveEvent(item);
    }

}
