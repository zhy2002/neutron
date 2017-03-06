package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyMobileNumberNodeScope
@Subcomponent(modules = {CompanyMobileNumberNodeModule.class})
public interface CompanyMobileNumberNodeComponent {

    CompanyMobileNumberNodeRuleProvider getCompanyMobileNumberNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyMobileNumberNodeModule(CompanyMobileNumberNodeModule module);

        CompanyMobileNumberNodeComponent build();
    }
}
