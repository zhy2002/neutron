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

public class AdditionalNode extends ObjectUiNode<ApplicationNode> {

    @Inject
    public AdditionalNode(@Owner ApplicationNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AdditionalNode.class;
    }

    private AdditionalNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(AdditionalNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    private AdditionalNodeComponent component;

    @Inject
    void createComponent(AdditionalNodeComponent.Builder builder) {
        this.component = builder.setAdditionalNodeModule(new AdditionalNodeModule(this)).build();
    }

    private RuleProvider<AdditionalNode> getRuleProvider() {
        return component.getAdditionalNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<AdditionalNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public AdditionalCommentNode getAdditionalCommentNode() {
        return (AdditionalCommentNode)getChildByName("additionalCommentNode");
    }

    @JsMethod
    public RelatedPartyListNode getRelatedPartyListNode() {
        return (RelatedPartyListNode)getChildByName("relatedPartyListNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("additionalCommentNode");
        children.add(childFactory.createAdditionalCommentNode());
        setChildNodeIdentity("relatedPartyListNode");
        children.add(childFactory.createRelatedPartyListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
