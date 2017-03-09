package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyDisclosureFlagNodeScope
@Subcomponent(modules = {ThirdPartyDisclosureFlagNodeModule.class})
public interface ThirdPartyDisclosureFlagNodeComponent {

    ThirdPartyDisclosureFlagNodeRuleProvider getThirdPartyDisclosureFlagNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyDisclosureFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyDisclosureFlagNodeModule(ThirdPartyDisclosureFlagNodeModule module);

        ThirdPartyDisclosureFlagNodeComponent build();
    }
}
