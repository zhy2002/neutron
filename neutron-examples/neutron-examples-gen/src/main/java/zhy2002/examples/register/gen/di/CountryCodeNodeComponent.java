package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;

@CountryCodeNodeScope
@Subcomponent(modules = {CountryCodeNodeModule.class})
public interface CountryCodeNodeComponent {

    CountryCodeNodeRuleProvider getCountryCodeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCountryCodeNodeModule(CountryCodeNodeModule module);

        CountryCodeNodeComponent build();
    }
}
