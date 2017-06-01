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


public class CurrentEmploymentListNode extends ListUiNode<PersonNode,CurrentEmploymentNode> {

    @Inject
    public CurrentEmploymentListNode(@Owner PersonNode parent) {
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

    private RuleProvider<CurrentEmploymentListNode> getRuleProvider() {
        return component.getCurrentEmploymentListNodeRuleProvider();
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

    private RuleProvider<CurrentEmploymentListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
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
