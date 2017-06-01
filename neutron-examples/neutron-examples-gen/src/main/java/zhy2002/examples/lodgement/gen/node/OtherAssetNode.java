package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherAssetNode extends ObjectUiNode<OtherAssetListNode> {

    @Inject
    public OtherAssetNode(@Owner OtherAssetListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherAssetNode.class;
    }

    private OtherAssetNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(OtherAssetNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    private OtherAssetNodeComponent component;

    @Inject
    void createComponent(OtherAssetNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetNodeModule(new OtherAssetNodeModule(this)).build();
    }

    private RuleProvider<OtherAssetNode> getRuleProvider() {
        return component.getOtherAssetNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    @JsMethod
    public OtherAssetTypeNode getOtherAssetTypeNode() {
        return (OtherAssetTypeNode)getChildByName("otherAssetTypeNode");
    }

    @JsMethod
    public OtherAssetDescriptionNode getOtherAssetDescriptionNode() {
        return (OtherAssetDescriptionNode)getChildByName("otherAssetDescriptionNode");
    }

    @JsMethod
    public OtherAssetMarketValueNode getOtherAssetMarketValueNode() {
        return (OtherAssetMarketValueNode)getChildByName("otherAssetMarketValueNode");
    }

    @JsMethod
    public OtherAssetOwnershipListNode getOwnershipListNode() {
        return (OtherAssetOwnershipListNode)getChildByName("ownershipListNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("otherAssetTypeNode");
        children.add(childFactory.createOtherAssetTypeNode());
        setChildNodeIdentity("otherAssetDescriptionNode");
        children.add(childFactory.createOtherAssetDescriptionNode());
        setChildNodeIdentity("otherAssetMarketValueNode");
        children.add(childFactory.createOtherAssetMarketValueNode());
        setChildNodeIdentity("ownershipListNode");
        children.add(childFactory.createOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
