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


public class PreviousEmploymentListNode extends ListUiNode<PersonNode, PreviousEmploymentNode> {

    @Inject
    protected PreviousEmploymentListNode(@Owner PersonNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<PreviousEmploymentNode> getItemClass() {
        return PreviousEmploymentNode.class;
    }

    @Override
    public NodeAddEvent<PreviousEmploymentNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        PreviousEmploymentNode item = getComponent().createPreviousEmploymentNode();
        setNameOfChildBeingCreated(null);
        return new PreviousEmploymentNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<PreviousEmploymentNode> createItemRemoveEvent(PreviousEmploymentNode item) {
        return new PreviousEmploymentNodeRemoveEvent(item);
    }

}
