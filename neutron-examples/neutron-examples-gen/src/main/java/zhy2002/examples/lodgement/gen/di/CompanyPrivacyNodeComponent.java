package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyPrivacyNodeScope
@Subcomponent(modules = {CompanyPrivacyNodeModule.class})
public interface CompanyPrivacyNodeComponent {

    CompanyPrivacyNodeRuleProvider getCompanyPrivacyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyPrivacyNodeModule(CompanyPrivacyNodeModule module);

        CompanyPrivacyNodeComponent build();
    }
}
