package zhy2002.examples.register;

import zhy2002.neutron.ListUiNode;

import javax.validation.constraints.NotNull;

public class ErrorListNode extends ListUiNode<RegisterNode, ErrorListNode, ErrorNode> {

    protected ErrorListNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
    }








}
