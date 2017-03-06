package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyIndustryNodeScope
@Subcomponent(modules = {CompanyIndustryNodeModule.class})
public interface CompanyIndustryNodeComponent {

    CompanyIndustryNodeRuleProvider getCompanyIndustryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyIndustryNodeModule(CompanyIndustryNodeModule module);

        CompanyIndustryNodeComponent build();
    }
}
