package zhy2002.examples.register;

import zhy2002.examples.register.event.ErrorNodeAddEvent;
import zhy2002.examples.register.event.ErrorNodeRemoveEvent;
import zhy2002.neutron.*;

import javax.validation.constraints.NotNull;

public class ErrorListNode extends ListUiNode<RegisterNode, ErrorNode> {

    protected ErrorListNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
    }

    @Override
    protected NodeAddEvent<ErrorNode> createNodeAddEvent(ErrorNode item) {
        return new ErrorNodeAddEvent(item);
    }

    @Override
    protected void initializeSelf() {

    }

    @Override
    protected void initializeChildren() {
    }

    @Override
    protected ErrorNode createItemInternal(Class<? extends ErrorNode> itemClass) {


        ChildNodeFactory<ErrorNode, ErrorListNode> factory = getContext().getChildNodeFactory(itemClass);
        return factory.create(this, String.valueOf(getChildSequenceNumber()));
    }

    @Override
    protected NodeRemoveEvent<ErrorNode> createNodeRemoveEvent(ErrorNode child) {
        return new ErrorNodeRemoveEvent(child);
    }

    @Override
    protected void undoInitializeSelf() {

    }

    protected void undoInitializeChildren() {
        throw new NotImplementedException();
    }


}
