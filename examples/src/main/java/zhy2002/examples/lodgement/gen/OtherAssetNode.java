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

public class OtherAssetNode extends ObjectUiNode<OtherAssetListNode>
{
    private OtherAssetTypeNode otherAssetTypeNode;
    private OtherAssetDescriptionNode otherAssetDescriptionNode;
    private OtherAssetMarketValueNode otherAssetMarketValueNode;

    private OtherAssetNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(OtherAssetNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<OtherAssetNode> config = classRegistry.getUiNodeConfig(OtherAssetNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public OtherAssetNode(OtherAssetListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public OtherAssetTypeNode getOtherAssetTypeNode() {
        return otherAssetTypeNode;
    }

    @JsMethod
    public OtherAssetDescriptionNode getOtherAssetDescriptionNode() {
        return otherAssetDescriptionNode;
    }

    @JsMethod
    public OtherAssetMarketValueNode getOtherAssetMarketValueNode() {
        return otherAssetMarketValueNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        otherAssetTypeNode = childFactory.createOtherAssetTypeNode();
        children.add(otherAssetTypeNode);
        otherAssetDescriptionNode = childFactory.createOtherAssetDescriptionNode();
        children.add(otherAssetDescriptionNode);
        otherAssetMarketValueNode = childFactory.createOtherAssetMarketValueNode();
        children.add(otherAssetMarketValueNode);
        return children;
    }

}
