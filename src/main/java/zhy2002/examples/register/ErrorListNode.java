package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;
import zhy2002.neutron.ListUiNode;
import zhy2002.neutron.NotImplementedException;

import javax.validation.constraints.NotNull;

public class ErrorListNode extends ListUiNode<RegisterNode, ErrorNode> {

    protected ErrorListNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
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
    protected void undoInitializeSelf() {

    }

    protected void undoInitializeChildren() {
        throw new NotImplementedException();
    }


}
