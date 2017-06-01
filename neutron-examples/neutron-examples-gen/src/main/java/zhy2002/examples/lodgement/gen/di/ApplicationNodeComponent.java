package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ApplicationNodeModule.class})
public interface ApplicationNodeComponent {

    List<RuleProvider<ApplicationNode>> provideRuleProviders();

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

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicationNodeModule(ApplicationNodeModule module);

        ApplicationNodeComponent build();
    }

}
