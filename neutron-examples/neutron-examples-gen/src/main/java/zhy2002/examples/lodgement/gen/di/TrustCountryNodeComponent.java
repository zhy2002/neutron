package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {TrustCountryNodeModule.class})
public interface TrustCountryNodeComponent {

    List<RuleProvider<TrustCountryNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setTrustCountryNodeModule(TrustCountryNodeModule module);

        TrustCountryNodeComponent build();
    }

}
