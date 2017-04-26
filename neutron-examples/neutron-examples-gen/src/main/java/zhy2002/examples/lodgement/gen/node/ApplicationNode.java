package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.event.*;

@Singleton
public class ApplicationNode extends RootUiNode<VoidUiNode> {

    private IdNode idNode;
    private StatusNode statusNode;
    private OwningUserNode owningUserNode;
    private LenderNode lenderNode;
    private DateCreatedNode dateCreatedNode;
    private DateUpdatedNode dateUpdatedNode;
    private DateLodgedNode dateLodgedNode;
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

    private RuleProvider<ApplicationNode> getRuleProvider() {
        return component.getApplicationNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    @Override
    protected final NodeLoadEvent<ApplicationNode> createNodeLoadEvent() {
        return new ApplicationNodeLoadEvent(this);
    }

    @Override
    protected final NodeUnloadEvent<ApplicationNode> createNodeUnloadEvent() {
        return new ApplicationNodeUnloadEvent(this);
    }


    @Inject
    public ApplicationNode(@NotNull ApplicationNodeContext context) {
        super(context);
    }

    public static final PropertyMetadata<Boolean> SHOW_ERROR_LIST_PROPERTY = MetadataRegistry.createProperty(ApplicationNode.class, "showErrorList", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Integer> CONTENT_LEVEL_PROPERTY = MetadataRegistry.createProperty(ApplicationNode.class, "contentLevel", Integer.class, 1, ChangeTrackingModeEnum.Always);

    @JsMethod
    public Boolean getShowErrorList() {
        return getStateValue(SHOW_ERROR_LIST_PROPERTY);
    }

    @JsMethod
    public void setShowErrorList(Boolean value) {
        setStateValue(SHOW_ERROR_LIST_PROPERTY, value);
    }


    @JsMethod
    public int getContentLevel() {
        return getStateValue(CONTENT_LEVEL_PROPERTY);
    }

    @JsMethod
    public void setContentLevel(int value) {
        setStateValue(CONTENT_LEVEL_PROPERTY, value);
    }

    @JsMethod
    public IdNode getIdNode() {
        return idNode;
    }

    @JsMethod
    public StatusNode getStatusNode() {
        return statusNode;
    }

    @JsMethod
    public OwningUserNode getOwningUserNode() {
        return owningUserNode;
    }

    @JsMethod
    public LenderNode getLenderNode() {
        return lenderNode;
    }

    @JsMethod
    public DateCreatedNode getDateCreatedNode() {
        return dateCreatedNode;
    }

    @JsMethod
    public DateUpdatedNode getDateUpdatedNode() {
        return dateUpdatedNode;
    }

    @JsMethod
    public DateLodgedNode getDateLodgedNode() {
        return dateLodgedNode;
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
        idNode = childFactory.createIdNode();
        children.add(idNode);
        statusNode = childFactory.createStatusNode();
        children.add(statusNode);
        owningUserNode = childFactory.createOwningUserNode();
        children.add(owningUserNode);
        lenderNode = childFactory.createLenderNode();
        children.add(lenderNode);
        dateCreatedNode = childFactory.createDateCreatedNode();
        children.add(dateCreatedNode);
        dateUpdatedNode = childFactory.createDateUpdatedNode();
        children.add(dateUpdatedNode);
        dateLodgedNode = childFactory.createDateLodgedNode();
        children.add(dateLodgedNode);
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
