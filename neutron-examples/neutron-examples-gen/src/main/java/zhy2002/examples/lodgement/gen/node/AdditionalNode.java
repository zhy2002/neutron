package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AdditionalNodeComponent;
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
    public AdditionalNode(@Owner ApplicationNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AdditionalNode.class;
    }

    protected final AdditionalNodeComponent getComponent() {
        return component;
    }


    private AdditionalNodeComponent component;

    @Inject
    void createComponent(AdditionalNodeComponent.Builder builder) {
        this.component = builder.setAdditionalNodeModule(new AdditionalNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public AdditionalCommentNode getAdditionalCommentNode() {
        return (AdditionalCommentNode)getChildByName("additionalCommentNode");
    }

    @JsMethod
    public RelatedPartyListNode getRelatedPartyListNode() {
        return (RelatedPartyListNode)getChildByName("relatedPartyListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("additionalCommentNode");
        children.add(getComponent().createAdditionalCommentNode());
        setChildNodeIdentity("relatedPartyListNode");
        children.add(getComponent().createRelatedPartyListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
