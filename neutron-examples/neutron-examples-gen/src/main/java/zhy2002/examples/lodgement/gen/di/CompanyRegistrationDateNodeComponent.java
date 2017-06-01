package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyRegistrationDateNodeModule.class})
public interface CompanyRegistrationDateNodeComponent {

    List<RuleProvider<CompanyRegistrationDateNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegistrationDateNodeModule(CompanyRegistrationDateNodeModule module);

        CompanyRegistrationDateNodeComponent build();
    }

}
