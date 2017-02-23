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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetNode.class;
    }

    private OtherAssetNodeComponent component;

    @Inject
    void createComponent(OtherAssetNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetNodeModule(new OtherAssetNodeModule(this)).build();
    }

    @Override
    protected OtherAssetNodeRuleProvider getRuleProvider() {
        return component.getOtherAssetNodeRuleProvider();
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
