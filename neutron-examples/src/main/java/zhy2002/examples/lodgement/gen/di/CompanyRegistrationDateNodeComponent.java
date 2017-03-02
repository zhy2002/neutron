package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyRegistrationDateNodeScope
@Subcomponent(modules = {CompanyRegistrationDateNodeModule.class})
public interface CompanyRegistrationDateNodeComponent {

    CompanyRegistrationDateNodeRuleProvider getCompanyRegistrationDateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegistrationDateNodeModule(CompanyRegistrationDateNodeModule module);

        CompanyRegistrationDateNodeComponent build();
    }
}
