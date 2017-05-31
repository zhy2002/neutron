package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyNode extends ObjectUiNode<CompanyListNode> {
    private CompanyNodeChildFactory childFactory;
    private CompanyNodeComponent component;

    public CompanyNode(@NotNull CompanyListNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyNode.class;
    }

    @Inject
    void receiveNodeProvider(CompanyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(CompanyNodeComponent.Builder builder) {
        this.component = builder.setCompanyNodeModule(new CompanyNodeModule(this)).build();
    }

    private RuleProvider<CompanyNode> getRuleProvider() {
        return component.getCompanyNodeRuleProvider();
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
    public CompanyGeneralNode getCompanyGeneralNode() {
        return (CompanyGeneralNode)getChildByName("companyGeneralNode");
    }

    @JsMethod
    public CompanyContactNode getCompanyContactNode() {
        return (CompanyContactNode)getChildByName("companyContactNode");
    }

    @JsMethod
    public CompanyTrustNode getCompanyTrustNode() {
        return (CompanyTrustNode)getChildByName("companyTrustNode");
    }

    @JsMethod
    public CompanyPrivacyNode getCompanyPrivacyNode() {
        return (CompanyPrivacyNode)getChildByName("companyPrivacyNode");
    }

    @JsMethod
    public CompanyOtherIncomeListNode getCompanyOtherIncomeListNode() {
        return (CompanyOtherIncomeListNode)getChildByName("companyOtherIncomeListNode");
    }

    @JsMethod
    public CompanyResponsibleLendNode getCompanyResponsibleLendNode() {
        return (CompanyResponsibleLendNode)getChildByName("companyResponsibleLendNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("companyGeneralNode");
        children.add(childFactory.createCompanyGeneralNode());
        setChildNodeIdentity("companyContactNode");
        children.add(childFactory.createCompanyContactNode());
        setChildNodeIdentity("companyTrustNode");
        children.add(childFactory.createCompanyTrustNode());
        setChildNodeIdentity("companyPrivacyNode");
        children.add(childFactory.createCompanyPrivacyNode());
        setChildNodeIdentity("companyOtherIncomeListNode");
        children.add(childFactory.createCompanyOtherIncomeListNode());
        setChildNodeIdentity("companyResponsibleLendNode");
        children.add(childFactory.createCompanyResponsibleLendNode());
        setChildNodeIdentity(null);
        return children;
    }

}
