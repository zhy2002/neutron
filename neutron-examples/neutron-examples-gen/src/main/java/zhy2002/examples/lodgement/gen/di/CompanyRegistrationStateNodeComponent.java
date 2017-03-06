package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyRegistrationStateNodeScope
@Subcomponent(modules = {CompanyRegistrationStateNodeModule.class})
public interface CompanyRegistrationStateNodeComponent {

    CompanyRegistrationStateNodeRuleProvider getCompanyRegistrationStateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegistrationStateNodeModule(CompanyRegistrationStateNodeModule module);

        CompanyRegistrationStateNodeComponent build();
    }
}
