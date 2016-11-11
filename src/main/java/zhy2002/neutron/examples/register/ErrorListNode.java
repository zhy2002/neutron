package zhy2002.neutron.examples.register;

import zhy2002.neutron.ListUiNode;

import javax.validation.constraints.NotNull;
import java.util.function.Predicate;


public class ErrorListNode extends ListUiNode<RootNode, ErrorNode> {

    protected ErrorListNode(@NotNull RootNode parent, @NotNull String name) {
        super(parent, name);
    }

    public void remove(Predicate<ErrorNode> predicate) {

    }
}
