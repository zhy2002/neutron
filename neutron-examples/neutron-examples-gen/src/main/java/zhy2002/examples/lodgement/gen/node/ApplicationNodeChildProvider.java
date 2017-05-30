package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface ApplicationNodeChildFactory {
    IdNode createIdNode();
    StatusNode createStatusNode();
    OwningUserNode createOwningUserNode();
    LenderNode createLenderNode();
    DateCreatedNode createDateCreatedNode();
    DateUpdatedNode createDateUpdatedNode();
    DateLodgedNode createDateLodgedNode();
    AddressRefListNode createAddressRefListNode();
    PersonListNode createPersonListNode();
    CompanyListNode createCompanyListNode();
    FinancialPositionNode createFinancialPositionNode();
    RealEstateListNode createRealEstateListNode();
    ProductsNode createProductsNode();
    AdditionalNode createAdditionalNode();
    SubmissionNode createSubmissionNode();
    ErrorListNode createErrorListNode();
}

@Singleton
public class ApplicationNodeChildProvider {
    @Inject
    MembersInjector<OwningUserNode> owningUserNodeInjector;
    @Inject
    MembersInjector<FinancialPositionNode> financialPositionNodeInjector;
    @Inject
    MembersInjector<StatusNode> statusNodeInjector;
    @Inject
    MembersInjector<IdNode> idNodeInjector;
    @Inject
    MembersInjector<DateCreatedNode> dateCreatedNodeInjector;
    @Inject
    MembersInjector<CompanyListNode> companyListNodeInjector;
    @Inject
    MembersInjector<ProductsNode> productsNodeInjector;
    @Inject
    MembersInjector<ErrorListNode> errorListNodeInjector;
    @Inject
    MembersInjector<DateLodgedNode> dateLodgedNodeInjector;
    @Inject
    MembersInjector<PersonListNode> personListNodeInjector;
    @Inject
    MembersInjector<AddressRefListNode> addressRefListNodeInjector;
    @Inject
    MembersInjector<SubmissionNode> submissionNodeInjector;
    @Inject
    MembersInjector<DateUpdatedNode> dateUpdatedNodeInjector;
    @Inject
    MembersInjector<RealEstateListNode> realEstateListNodeInjector;
    @Inject
    MembersInjector<LenderNode> lenderNodeInjector;
    @Inject
    MembersInjector<AdditionalNode> additionalNodeInjector;

    @Inject
    protected ApplicationNodeChildProvider () {}

    protected MembersInjector<OwningUserNode> getOwningUserNodeInjector() {
        return this.owningUserNodeInjector;
    }

    protected MembersInjector<FinancialPositionNode> getFinancialPositionNodeInjector() {
        return this.financialPositionNodeInjector;
    }

    protected MembersInjector<StatusNode> getStatusNodeInjector() {
        return this.statusNodeInjector;
    }

    protected MembersInjector<IdNode> getIdNodeInjector() {
        return this.idNodeInjector;
    }

    protected MembersInjector<DateCreatedNode> getDateCreatedNodeInjector() {
        return this.dateCreatedNodeInjector;
    }

    protected MembersInjector<CompanyListNode> getCompanyListNodeInjector() {
        return this.companyListNodeInjector;
    }

    protected MembersInjector<ProductsNode> getProductsNodeInjector() {
        return this.productsNodeInjector;
    }

    protected MembersInjector<ErrorListNode> getErrorListNodeInjector() {
        return this.errorListNodeInjector;
    }

    protected MembersInjector<DateLodgedNode> getDateLodgedNodeInjector() {
        return this.dateLodgedNodeInjector;
    }

    protected MembersInjector<PersonListNode> getPersonListNodeInjector() {
        return this.personListNodeInjector;
    }

    protected MembersInjector<AddressRefListNode> getAddressRefListNodeInjector() {
        return this.addressRefListNodeInjector;
    }

    protected MembersInjector<SubmissionNode> getSubmissionNodeInjector() {
        return this.submissionNodeInjector;
    }

    protected MembersInjector<DateUpdatedNode> getDateUpdatedNodeInjector() {
        return this.dateUpdatedNodeInjector;
    }

    protected MembersInjector<RealEstateListNode> getRealEstateListNodeInjector() {
        return this.realEstateListNodeInjector;
    }

    protected MembersInjector<LenderNode> getLenderNodeInjector() {
        return this.lenderNodeInjector;
    }

    protected MembersInjector<AdditionalNode> getAdditionalNodeInjector() {
        return this.additionalNodeInjector;
    }

    protected IdNode newIdNode(
        ApplicationNode parent,
        String name
    ) {
        return new IdNode(parent, name);
    }

    protected void configureIdNode(IdNode node) {
    }

    @IdNodeScope
    public static class IdNodeRuleProvider implements RuleProvider<IdNode> {

        @Inject
        public IdNodeRuleProvider() {

        }

        @Override
        public void initializeState(IdNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected StatusNode newStatusNode(
        ApplicationNode parent,
        String name
    ) {
        return new StatusNode(parent, name);
    }

    protected void configureStatusNode(StatusNode node) {
    }

    @StatusNodeScope
    public static class StatusNodeRuleProvider implements RuleProvider<StatusNode> {

        @Inject
        public StatusNodeRuleProvider() {

        }

        @Override
        public void initializeState(StatusNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OwningUserNode newOwningUserNode(
        ApplicationNode parent,
        String name
    ) {
        return new OwningUserNode(parent, name);
    }

    protected void configureOwningUserNode(OwningUserNode node) {
    }

    @OwningUserNodeScope
    public static class OwningUserNodeRuleProvider implements RuleProvider<OwningUserNode> {

        @Inject
        public OwningUserNodeRuleProvider() {

        }

        @Override
        public void initializeState(OwningUserNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LenderNode newLenderNode(
        ApplicationNode parent,
        String name
    ) {
        return new LenderNode(parent, name);
    }

    protected void configureLenderNode(LenderNode node) {
    }

    @LenderNodeScope
    public static class LenderNodeRuleProvider implements RuleProvider<LenderNode> {

        @Inject
        public LenderNodeRuleProvider() {

        }

        @Override
        public void initializeState(LenderNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected DateCreatedNode newDateCreatedNode(
        ApplicationNode parent,
        String name
    ) {
        return new DateCreatedNode(parent, name);
    }

    protected void configureDateCreatedNode(DateCreatedNode node) {
    }

    @DateCreatedNodeScope
    public static class DateCreatedNodeRuleProvider implements RuleProvider<DateCreatedNode> {

        @Inject
        public DateCreatedNodeRuleProvider() {

        }

        @Override
        public void initializeState(DateCreatedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected DateUpdatedNode newDateUpdatedNode(
        ApplicationNode parent,
        String name
    ) {
        return new DateUpdatedNode(parent, name);
    }

    protected void configureDateUpdatedNode(DateUpdatedNode node) {
    }

    @DateUpdatedNodeScope
    public static class DateUpdatedNodeRuleProvider implements RuleProvider<DateUpdatedNode> {

        @Inject
        public DateUpdatedNodeRuleProvider() {

        }

        @Override
        public void initializeState(DateUpdatedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected DateLodgedNode newDateLodgedNode(
        ApplicationNode parent,
        String name
    ) {
        return new DateLodgedNode(parent, name);
    }

    protected void configureDateLodgedNode(DateLodgedNode node) {
    }

    @DateLodgedNodeScope
    public static class DateLodgedNodeRuleProvider implements RuleProvider<DateLodgedNode> {

        @Inject
        public DateLodgedNodeRuleProvider() {

        }

        @Override
        public void initializeState(DateLodgedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AddressRefListNode newAddressRefListNode(
        ApplicationNode parent,
        String name
    ) {
        return new AddressRefListNode(parent, name);
    }

    protected void configureAddressRefListNode(AddressRefListNode node) {
    }

    @AddressRefListNodeScope
    public static class AddressRefListNodeRuleProvider implements RuleProvider<AddressRefListNode> {

        @Inject
        public AddressRefListNodeRuleProvider() {

        }

        @Override
        public void initializeState(AddressRefListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PersonListNode newPersonListNode(
        ApplicationNode parent,
        String name
    ) {
        return new PersonListNode(parent, name);
    }

    protected void configurePersonListNode(PersonListNode node) {
    }

    @PersonListNodeScope
    public static class PersonListNodeRuleProvider implements RuleProvider<PersonListNode> {

        @Inject
        public PersonListNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyListNode newCompanyListNode(
        ApplicationNode parent,
        String name
    ) {
        return new CompanyListNode(parent, name);
    }

    protected void configureCompanyListNode(CompanyListNode node) {
    }

    @CompanyListNodeScope
    public static class CompanyListNodeRuleProvider implements RuleProvider<CompanyListNode> {

        @Inject
        public CompanyListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected FinancialPositionNode newFinancialPositionNode(
        ApplicationNode parent,
        String name
    ) {
        return new FinancialPositionNode(parent, name);
    }

    protected void configureFinancialPositionNode(FinancialPositionNode node) {
    }

    @FinancialPositionNodeScope
    public static class FinancialPositionNodeRuleProvider implements RuleProvider<FinancialPositionNode> {

        @Inject
        public FinancialPositionNodeRuleProvider() {

        }

        @Override
        public void initializeState(FinancialPositionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected RealEstateListNode newRealEstateListNode(
        ApplicationNode parent,
        String name
    ) {
        return new RealEstateListNode(parent, name);
    }

    protected void configureRealEstateListNode(RealEstateListNode node) {
    }

    @RealEstateListNodeScope
    public static class RealEstateListNodeRuleProvider implements RuleProvider<RealEstateListNode> {

        @Inject
        public RealEstateListNodeRuleProvider() {

        }

        @Override
        public void initializeState(RealEstateListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductsNode newProductsNode(
        ApplicationNode parent,
        String name
    ) {
        return new ProductsNode(parent, name);
    }

    protected void configureProductsNode(ProductsNode node) {
    }

    @ProductsNodeScope
    public static class ProductsNodeRuleProvider implements RuleProvider<ProductsNode> {

        @Inject
        public ProductsNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductsNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AdditionalNode newAdditionalNode(
        ApplicationNode parent,
        String name
    ) {
        return new AdditionalNode(parent, name);
    }

    protected void configureAdditionalNode(AdditionalNode node) {
    }

    @AdditionalNodeScope
    public static class AdditionalNodeRuleProvider implements RuleProvider<AdditionalNode> {

        @Inject
        public AdditionalNodeRuleProvider() {

        }

        @Override
        public void initializeState(AdditionalNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SubmissionNode newSubmissionNode(
        ApplicationNode parent,
        String name
    ) {
        return new SubmissionNode(parent, name);
    }

    protected void configureSubmissionNode(SubmissionNode node) {
    }

    @SubmissionNodeScope
    public static class SubmissionNodeRuleProvider implements RuleProvider<SubmissionNode> {

        @Inject
        public SubmissionNodeRuleProvider() {

        }

        @Override
        public void initializeState(SubmissionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ErrorListNode newErrorListNode(
        ApplicationNode parent,
        String name
    ) {
        return new ErrorListNode(parent, name);
    }

    protected void configureErrorListNode(ErrorListNode node) {
    }

    @ErrorListNodeScope
    public static class ErrorListNodeRuleProvider implements RuleProvider<ErrorListNode> {

        @Inject
        public ErrorListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ErrorListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    ApplicationNodeChildFactory createFactory(ApplicationNode parent) {
        return new ApplicationNodeChildFactoryImpl(parent);
    }

    private class ApplicationNodeChildFactoryImpl implements ApplicationNodeChildFactory {

        private final ApplicationNode parent;
        
        private ApplicationNodeChildFactoryImpl(ApplicationNode parent) {
            this.parent = parent;
        }

        @Override
        public IdNode createIdNode() {
            IdNode node = newIdNode(parent, "idNode");
            idNodeInjector.injectMembers(node);
            configureIdNode(node);
            return node;
        }

        @Override
        public StatusNode createStatusNode() {
            StatusNode node = newStatusNode(parent, "statusNode");
            statusNodeInjector.injectMembers(node);
            configureStatusNode(node);
            return node;
        }

        @Override
        public OwningUserNode createOwningUserNode() {
            OwningUserNode node = newOwningUserNode(parent, "owningUserNode");
            owningUserNodeInjector.injectMembers(node);
            configureOwningUserNode(node);
            return node;
        }

        @Override
        public LenderNode createLenderNode() {
            LenderNode node = newLenderNode(parent, "lenderNode");
            lenderNodeInjector.injectMembers(node);
            configureLenderNode(node);
            return node;
        }

        @Override
        public DateCreatedNode createDateCreatedNode() {
            DateCreatedNode node = newDateCreatedNode(parent, "dateCreatedNode");
            dateCreatedNodeInjector.injectMembers(node);
            configureDateCreatedNode(node);
            return node;
        }

        @Override
        public DateUpdatedNode createDateUpdatedNode() {
            DateUpdatedNode node = newDateUpdatedNode(parent, "dateUpdatedNode");
            dateUpdatedNodeInjector.injectMembers(node);
            configureDateUpdatedNode(node);
            return node;
        }

        @Override
        public DateLodgedNode createDateLodgedNode() {
            DateLodgedNode node = newDateLodgedNode(parent, "dateLodgedNode");
            dateLodgedNodeInjector.injectMembers(node);
            configureDateLodgedNode(node);
            return node;
        }

        @Override
        public AddressRefListNode createAddressRefListNode() {
            AddressRefListNode node = newAddressRefListNode(parent, "addressRefListNode");
            addressRefListNodeInjector.injectMembers(node);
            configureAddressRefListNode(node);
            return node;
        }

        @Override
        public PersonListNode createPersonListNode() {
            PersonListNode node = newPersonListNode(parent, "personListNode");
            personListNodeInjector.injectMembers(node);
            configurePersonListNode(node);
            return node;
        }

        @Override
        public CompanyListNode createCompanyListNode() {
            CompanyListNode node = newCompanyListNode(parent, "companyListNode");
            companyListNodeInjector.injectMembers(node);
            configureCompanyListNode(node);
            return node;
        }

        @Override
        public FinancialPositionNode createFinancialPositionNode() {
            FinancialPositionNode node = newFinancialPositionNode(parent, "financialPositionNode");
            financialPositionNodeInjector.injectMembers(node);
            configureFinancialPositionNode(node);
            return node;
        }

        @Override
        public RealEstateListNode createRealEstateListNode() {
            RealEstateListNode node = newRealEstateListNode(parent, "realEstateListNode");
            realEstateListNodeInjector.injectMembers(node);
            configureRealEstateListNode(node);
            return node;
        }

        @Override
        public ProductsNode createProductsNode() {
            ProductsNode node = newProductsNode(parent, "productsNode");
            productsNodeInjector.injectMembers(node);
            configureProductsNode(node);
            return node;
        }

        @Override
        public AdditionalNode createAdditionalNode() {
            AdditionalNode node = newAdditionalNode(parent, "additionalNode");
            additionalNodeInjector.injectMembers(node);
            configureAdditionalNode(node);
            return node;
        }

        @Override
        public SubmissionNode createSubmissionNode() {
            SubmissionNode node = newSubmissionNode(parent, "submissionNode");
            submissionNodeInjector.injectMembers(node);
            configureSubmissionNode(node);
            return node;
        }

        @Override
        public ErrorListNode createErrorListNode() {
            ErrorListNode node = newErrorListNode(parent, "errorListNode");
            errorListNodeInjector.injectMembers(node);
            configureErrorListNode(node);
            return node;
        }

    }
}
