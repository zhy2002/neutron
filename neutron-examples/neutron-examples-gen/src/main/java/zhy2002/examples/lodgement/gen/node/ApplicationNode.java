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
        return (IdNode)getChildByName("idNode");
    }

    @JsMethod
    public StatusNode getStatusNode() {
        return (StatusNode)getChildByName("statusNode");
    }

    @JsMethod
    public OwningUserNode getOwningUserNode() {
        return (OwningUserNode)getChildByName("owningUserNode");
    }

    @JsMethod
    public LenderNode getLenderNode() {
        return (LenderNode)getChildByName("lenderNode");
    }

    @JsMethod
    public DateCreatedNode getDateCreatedNode() {
        return (DateCreatedNode)getChildByName("dateCreatedNode");
    }

    @JsMethod
    public DateUpdatedNode getDateUpdatedNode() {
        return (DateUpdatedNode)getChildByName("dateUpdatedNode");
    }

    @JsMethod
    public DateLodgedNode getDateLodgedNode() {
        return (DateLodgedNode)getChildByName("dateLodgedNode");
    }

    @JsMethod
    public AddressRefListNode getAddressRefListNode() {
        return (AddressRefListNode)getChildByName("addressRefListNode");
    }

    @JsMethod
    public PersonListNode getPersonListNode() {
        return (PersonListNode)getChildByName("personListNode");
    }

    @JsMethod
    public CompanyListNode getCompanyListNode() {
        return (CompanyListNode)getChildByName("companyListNode");
    }

    @JsMethod
    public FinancialPositionNode getFinancialPositionNode() {
        return (FinancialPositionNode)getChildByName("financialPositionNode");
    }

    @JsMethod
    public RealEstateListNode getRealEstateListNode() {
        return (RealEstateListNode)getChildByName("realEstateListNode");
    }

    @JsMethod
    public ProductsNode getProductsNode() {
        return (ProductsNode)getChildByName("productsNode");
    }

    @JsMethod
    public AdditionalNode getAdditionalNode() {
        return (AdditionalNode)getChildByName("additionalNode");
    }

    @JsMethod
    public SubmissionNode getSubmissionNode() {
        return (SubmissionNode)getChildByName("submissionNode");
    }

    @JsMethod
    public ErrorListNode getErrorListNode() {
        return (ErrorListNode)getChildByName("errorListNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createIdNode());
        children.add(childFactory.createStatusNode());
        children.add(childFactory.createOwningUserNode());
        children.add(childFactory.createLenderNode());
        children.add(childFactory.createDateCreatedNode());
        children.add(childFactory.createDateUpdatedNode());
        children.add(childFactory.createDateLodgedNode());
        children.add(childFactory.createAddressRefListNode());
        children.add(childFactory.createPersonListNode());
        children.add(childFactory.createCompanyListNode());
        children.add(childFactory.createFinancialPositionNode());
        children.add(childFactory.createRealEstateListNode());
        children.add(childFactory.createProductsNode());
        children.add(childFactory.createAdditionalNode());
        children.add(childFactory.createSubmissionNode());
        children.add(childFactory.createErrorListNode());
        return children;
    }

}
