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

@Singleton
public class ApplicationNode extends ObjectUiNode<VoidUiNode>
{
    private AddressListNode addressListNode;
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

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<ApplicationNode> config = classRegistry.getUiNodeConfig(ApplicationNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    @Inject
    public ApplicationNode(@NotNull ApplicationNodeContext context) {
        super(context);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedName("personListNode");
        setChangeTrackingMode(ApplicationNodeConstants.CONTENT_LEVEL, ChangeTrackingModeEnum.Value);
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
    public AddressListNode getAddressListNode() {
        return addressListNode;
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
        addressListNode = childFactory.createAddressListNode();
        children.add(addressListNode);
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

    @Inject
    ApplicationNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}
