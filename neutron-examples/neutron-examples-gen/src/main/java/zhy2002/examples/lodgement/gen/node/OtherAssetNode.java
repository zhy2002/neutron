package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherAssetNode extends ObjectUiNode<OtherAssetListNode> {

    private OtherAssetTypeNode otherAssetTypeNode;
    private OtherAssetDescriptionNode otherAssetDescriptionNode;
    private OtherAssetMarketValueNode otherAssetMarketValueNode;
    private OtherAssetOwnershipListNode ownershipListNode;

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

    private OtherAssetNodeRuleProvider getRuleProvider() {
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


    public OtherAssetNode(@NotNull OtherAssetListNode parent, String name) {
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

    @JsMethod
    public OtherAssetOwnershipListNode getOwnershipListNode() {
        return ownershipListNode;
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
        ownershipListNode = childFactory.createOwnershipListNode();
        children.add(ownershipListNode);
        return children;
    }

}
