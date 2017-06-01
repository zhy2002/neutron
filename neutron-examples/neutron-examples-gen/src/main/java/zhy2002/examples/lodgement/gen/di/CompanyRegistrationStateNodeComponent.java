package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyRegistrationStateNodeModule.class})
public interface CompanyRegistrationStateNodeComponent {

    List<RuleProvider<CompanyRegistrationStateNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegistrationStateNodeModule(CompanyRegistrationStateNodeModule module);

        CompanyRegistrationStateNodeComponent build();
    }

}
