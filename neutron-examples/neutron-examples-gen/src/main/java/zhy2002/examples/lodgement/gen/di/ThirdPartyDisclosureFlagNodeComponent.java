package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ThirdPartyDisclosureFlagNodeModule.class})
public interface ThirdPartyDisclosureFlagNodeComponent {

    List<RuleProvider<ThirdPartyDisclosureFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyDisclosureFlagNodeModule(ThirdPartyDisclosureFlagNodeModule module);

        ThirdPartyDisclosureFlagNodeComponent build();
    }

}
