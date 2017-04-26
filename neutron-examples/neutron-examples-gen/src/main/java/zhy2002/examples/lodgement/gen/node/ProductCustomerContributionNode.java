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

public class ProductCustomerContributionNode extends ObjectUiNode<ProductCustomerContributionListNode> {

    private ContributionTypeNode contributionTypeNode;
    private ContributionDescriptionNode contributionDescriptionNode;
    private ContributionAmountNode contributionAmountNode;

    private ProductCustomerContributionNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductCustomerContributionNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCustomerContributionNode.class;
    }

    private ProductCustomerContributionNodeComponent component;

    @Inject
    void createComponent(ProductCustomerContributionNodeComponent.Builder builder) {
        this.component = builder.setProductCustomerContributionNodeModule(new ProductCustomerContributionNodeModule(this)).build();
    }

    private RuleProvider<ProductCustomerContributionNode> getRuleProvider() {
        return component.getProductCustomerContributionNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductCustomerContributionNode(@NotNull ProductCustomerContributionListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ContributionTypeNode getContributionTypeNode() {
        return contributionTypeNode;
    }

    @JsMethod
    public ContributionDescriptionNode getContributionDescriptionNode() {
        return contributionDescriptionNode;
    }

    @JsMethod
    public ContributionAmountNode getContributionAmountNode() {
        return contributionAmountNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        contributionTypeNode = childFactory.createContributionTypeNode();
        children.add(contributionTypeNode);
        contributionDescriptionNode = childFactory.createContributionDescriptionNode();
        children.add(contributionDescriptionNode);
        contributionAmountNode = childFactory.createContributionAmountNode();
        children.add(contributionAmountNode);
        return children;
    }

}
