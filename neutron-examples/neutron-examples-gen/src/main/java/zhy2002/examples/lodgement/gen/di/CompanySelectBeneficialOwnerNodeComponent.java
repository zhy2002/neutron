package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanySelectBeneficialOwnerNodeScope
@Subcomponent(modules = {CompanySelectBeneficialOwnerNodeModule.class})
public interface CompanySelectBeneficialOwnerNodeComponent {

    CompanySelectBeneficialOwnerNodeRuleProvider getCompanySelectBeneficialOwnerNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanySelectBeneficialOwnerNodeModule(CompanySelectBeneficialOwnerNodeModule module);

        CompanySelectBeneficialOwnerNodeComponent build();
    }
}
