package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CurrentEmploymentListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class CurrentEmploymentListNode extends ListUiNode<PersonNode, CurrentEmploymentNode> {

    @Inject
    protected CurrentEmploymentListNode(@Owner PersonNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CurrentEmploymentListNode.class;
    }

    protected final CurrentEmploymentListNodeComponent getComponent() {
        return component;
    }


    private CurrentEmploymentListNodeComponent component;

    @Inject
    void createComponent(CurrentEmploymentListNodeComponent.Builder builder) {
        this.component = builder.setCurrentEmploymentListNodeModule(new CurrentEmploymentListNodeModule(this)).build();
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
    public Class<CurrentEmploymentNode> getItemClass() {
        return CurrentEmploymentNode.class;
    }

    @Override
    public NodeAddEvent<CurrentEmploymentNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        CurrentEmploymentNode item = getComponent().createCurrentEmploymentNode();
        setNameOfChildBeingCreated(null);
        return new CurrentEmploymentNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<CurrentEmploymentNode> createItemRemoveEvent(CurrentEmploymentNode item) {
        return new CurrentEmploymentNodeRemoveEvent(item);
    }

}
