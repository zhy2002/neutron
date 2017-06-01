package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CountryCodeNodeModule.class})
public interface CountryCodeNodeComponent {

    List<RuleProvider<CountryCodeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCountryCodeNodeModule(CountryCodeNodeModule module);

        CountryCodeNodeComponent build();
    }

}
