package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;

public class ErrorListNode extends ListUiNode<RegisterNode,ErrorListNode,ErrorNode>
{
    private ErrorListNodeItemFactory itemFactory;

    @Inject
    void receiveProviders(ErrorListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<ErrorListNode> config = classRegistry.getUiNodeConfig(ErrorListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public ErrorListNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
    }

    @Override
    protected <M extends ErrorNode> ErrorNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createErrorNode(name);
    }



}
