package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCustomerContributionNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCustomerContributionNode extends ObjectUiNode<ProductCustomerContributionListNode> {

    @Inject
    protected ProductCustomerContributionNode(@Owner ProductCustomerContributionListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCustomerContributionNode.class;
    }

    protected final ProductCustomerContributionNodeComponent getComponent() {
        return component;
    }


    private ProductCustomerContributionNodeComponent component;

    @Inject
    void createComponent(ProductCustomerContributionNodeComponent.Builder builder) {
        this.component = builder.setProductCustomerContributionNodeModule(new ProductCustomerContributionNodeModule(this)).build();
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
    public ContributionTypeNode getContributionTypeNode() {
        return (ContributionTypeNode)getChildByName("contributionTypeNode");
    }

    @JsMethod
    public ContributionDescriptionNode getContributionDescriptionNode() {
        return (ContributionDescriptionNode)getChildByName("contributionDescriptionNode");
    }

    @JsMethod
    public ContributionAmountNode getContributionAmountNode() {
        return (ContributionAmountNode)getChildByName("contributionAmountNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("contributionTypeNode");
        children.add(getComponent().createContributionTypeNode());
        setChildNodeIdentity("contributionDescriptionNode");
        children.add(getComponent().createContributionDescriptionNode());
        setChildNodeIdentity("contributionAmountNode");
        children.add(getComponent().createContributionAmountNode());
        setChildNodeIdentity(null);
        return children;
    }

}
