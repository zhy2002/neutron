package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CountryNodeScope
@Subcomponent(modules = {CountryNodeModule.class})
public interface CountryNodeComponent {

    CountryNodeRuleProvider getCountryNodeRuleProvider();
    Map<String, RuleProvider<CountryNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCountryNodeModule(CountryNodeModule module);

        CountryNodeComponent build();
    }
}
