package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanySelectBeneficialOwnerNodeScope
@Subcomponent(modules = {CompanySelectBeneficialOwnerNodeModule.class})
public interface CompanySelectBeneficialOwnerNodeComponent {

    RuleProvider<CompanySelectBeneficialOwnerNode> getCompanySelectBeneficialOwnerNodeRuleProvider();
    Map<String, RuleProvider<CompanySelectBeneficialOwnerNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanySelectBeneficialOwnerNodeModule(CompanySelectBeneficialOwnerNodeModule module);

        CompanySelectBeneficialOwnerNodeComponent build();
    }
}
