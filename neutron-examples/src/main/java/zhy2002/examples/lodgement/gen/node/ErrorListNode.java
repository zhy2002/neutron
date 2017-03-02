package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected ErrorListNodeRuleProvider getRuleProvider() {
        return component.getErrorListNodeRuleProvider();
    }

    public ErrorListNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
    }

    public NodeAddEvent<ErrorNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<ErrorNode> createItemRemoveEvent(ErrorNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setChangeTrackingMode(ApplicationNodeConstants.FOCUS, ChangeTrackingModeEnum.Always);
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
