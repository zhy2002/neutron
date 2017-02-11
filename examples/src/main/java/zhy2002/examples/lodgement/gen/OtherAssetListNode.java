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

public class OtherAssetListNode extends ListUiNode<AssetsNode,OtherAssetListNode,OtherAssetNode>
{
    private OtherAssetListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(OtherAssetListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<OtherAssetListNode> config = classRegistry.getUiNodeConfig(OtherAssetListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public OtherAssetListNode(AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<OtherAssetNode> getItemClass() {
        return OtherAssetNode.class;
    }

    @Override
    protected <M extends OtherAssetNode> OtherAssetNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createOtherAssetNode(name);
    }

}
