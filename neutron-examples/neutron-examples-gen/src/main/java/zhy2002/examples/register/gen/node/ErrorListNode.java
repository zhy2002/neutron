package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.ErrorListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;
import zhy2002.examples.register.gen.event.*;


public class ErrorListNode extends ListUiNode<RegisterNode,ErrorNode> {

    @Inject
    public ErrorListNode(@Owner RegisterNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ErrorListNode.class;
    }

    protected final ErrorListNodeComponent getComponent() {
        return component;
    }


    private ErrorListNodeComponent component;

    @Inject
    void createComponent(ErrorListNodeComponent.Builder builder) {
        this.component = builder.setErrorListNodeModule(new ErrorListNodeModule(this)).build();
    }

    private RuleProvider<ErrorListNode> getRuleProvider() {
        return component.getErrorListNodeRuleProvider();
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

    private RuleProvider<ErrorListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
    }

    @Override
    public NodeAddEvent<ErrorNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        ErrorNode item = getComponent().createErrorNode();
        setNameOfChildBeingCreated(null);
        return new ErrorNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<ErrorNode> createItemRemoveEvent(ErrorNode item) {
        return new ErrorNodeRemoveEvent(item);
    }

}
