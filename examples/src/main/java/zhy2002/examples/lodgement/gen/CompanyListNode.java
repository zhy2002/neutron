package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class CompanyListNode extends ListUiNode<ApplicationNode,CompanyListNode,CompanyNode>
{
    private CompanyListNodeItemFactory itemFactory;

    @Inject
    void receiveProviders(CompanyListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<CompanyListNode> config = classRegistry.getUiNodeConfig(CompanyListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public CompanyListNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<CompanyNode> getItemClass() {
        return CompanyNode.class;
    }

    @Override
    protected <M extends CompanyNode> CompanyNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createCompanyNode(name);
    }



}
