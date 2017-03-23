package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ErrorListNode extends ListUiNode<ApplicationNode,ErrorNode> {

    private ErrorListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ErrorListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ErrorListNode.class;
    }

    private ErrorListNodeComponent component;

    @Inject
    void createComponent(ErrorListNodeComponent.Builder builder) {
        this.component = builder.setErrorListNodeModule(new ErrorListNodeModule(this)).build();
    }

    private ErrorListNodeRuleProvider getRuleProvider() {
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

    public ErrorListNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
    }

    @Override
    public NodeAddEvent<ErrorNode> createItemAddEvent(String name) {
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<ErrorNode> createItemRemoveEvent(ErrorNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

    @JsMethod
    public String getFocus() {
        return getStateValue(ApplicationNodeConstants.FOCUS);
    }

    @JsMethod
    public void setFocus(String value) {
        setStateValue(ApplicationNodeConstants.FOCUS, String.class, value);
    }

}
