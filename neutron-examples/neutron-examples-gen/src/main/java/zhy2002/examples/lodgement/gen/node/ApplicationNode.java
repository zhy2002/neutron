package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.*;


@Singleton
public class ApplicationNode extends ObjectUiNode<VoidUiNode> {

    private AddressRefListNode addressRefListNode;
    private PersonListNode personListNode;
    private CompanyListNode companyListNode;
    private FinancialPositionNode financialPositionNode;
    private RealEstateListNode realEstateListNode;
    private ProductsNode productsNode;
    private AdditionalNode additionalNode;
    private SubmissionNode submissionNode;
    private ErrorListNode errorListNode;

    private ApplicationNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ApplicationNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ApplicationNode.class;
    }

    private ApplicationNodeComponent component;

    @Inject
    void createComponent(ApplicationNodeComponent.Builder builder) {
        this.component = builder.setApplicationNodeModule(new ApplicationNodeModule(this)).build();
    }

    @Override
    protected ApplicationNodeRuleProvider getRuleProvider() {
        return component.getApplicationNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    @Inject
    public ApplicationNode(@NotNull ApplicationNodeContext context) {
        super(context);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedName("personListNode");
        setChangeTrackingMode(ApplicationNodeConstants.CONTENT_LEVEL, ChangeTrackingModeEnum.Always);
    }

    @JsMethod
    public Boolean getShowErrorList() {
        return getStateValue(ApplicationNodeConstants.SHOW_ERROR_LIST, Boolean.FALSE);
    }

    @JsMethod
    public void setShowErrorList(Boolean value) {
        setStateValue(ApplicationNodeConstants.SHOW_ERROR_LIST, Boolean.class, value);
    }

    @JsMethod
    public int getContentLevel() {
        return getStateValue(ApplicationNodeConstants.CONTENT_LEVEL, 1);
    }

    @JsMethod
    public void setContentLevel(int value) {
        setStateValue(ApplicationNodeConstants.CONTENT_LEVEL, Integer.class, value);
    }

    @JsMethod
    public AddressRefListNode getAddressRefListNode() {
        return addressRefListNode;
    }

    @JsMethod
    public PersonListNode getPersonListNode() {
        return personListNode;
    }

    @JsMethod
    public CompanyListNode getCompanyListNode() {
        return companyListNode;
    }

    @JsMethod
    public FinancialPositionNode getFinancialPositionNode() {
        return financialPositionNode;
    }

    @JsMethod
    public RealEstateListNode getRealEstateListNode() {
        return realEstateListNode;
    }

    @JsMethod
    public ProductsNode getProductsNode() {
        return productsNode;
    }

    @JsMethod
    public AdditionalNode getAdditionalNode() {
        return additionalNode;
    }

    @JsMethod
    public SubmissionNode getSubmissionNode() {
        return submissionNode;
    }

    @JsMethod
    public ErrorListNode getErrorListNode() {
        return errorListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        addressRefListNode = childFactory.createAddressRefListNode();
        children.add(addressRefListNode);
        personListNode = childFactory.createPersonListNode();
        children.add(personListNode);
        companyListNode = childFactory.createCompanyListNode();
        children.add(companyListNode);
        financialPositionNode = childFactory.createFinancialPositionNode();
        children.add(financialPositionNode);
        realEstateListNode = childFactory.createRealEstateListNode();
        children.add(realEstateListNode);
        productsNode = childFactory.createProductsNode();
        children.add(productsNode);
        additionalNode = childFactory.createAdditionalNode();
        children.add(additionalNode);
        submissionNode = childFactory.createSubmissionNode();
        children.add(submissionNode);
        errorListNode = childFactory.createErrorListNode();
        children.add(errorListNode);
        return children;
    }

}
