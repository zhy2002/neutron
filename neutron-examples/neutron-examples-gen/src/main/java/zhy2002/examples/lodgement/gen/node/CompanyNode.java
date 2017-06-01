package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanyNode extends ObjectUiNode<CompanyListNode> {

    @Inject
    public CompanyNode(@Owner CompanyListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyNode.class;
    }

    protected final CompanyNodeComponent getComponent() {
        return component;
    }


    private CompanyNodeComponent component;

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

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("companyGeneralNode");
        children.add(getComponent().createCompanyGeneralNode());
        setChildNodeIdentity("companyContactNode");
        children.add(getComponent().createCompanyContactNode());
        setChildNodeIdentity("companyTrustNode");
        children.add(getComponent().createCompanyTrustNode());
        setChildNodeIdentity("companyPrivacyNode");
        children.add(getComponent().createCompanyPrivacyNode());
        setChildNodeIdentity("companyOtherIncomeListNode");
        children.add(getComponent().createCompanyOtherIncomeListNode());
        setChildNodeIdentity("companyResponsibleLendNode");
        children.add(getComponent().createCompanyResponsibleLendNode());
        setChildNodeIdentity(null);
        return children;
    }

}
