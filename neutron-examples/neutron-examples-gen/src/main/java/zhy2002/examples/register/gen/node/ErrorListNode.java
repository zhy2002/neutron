package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;


public class ErrorListNode extends ListUiNode<RegisterNode,ErrorNode> {

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

    public ErrorListNode(@NotNull RegisterNode parent, String name) {
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

}