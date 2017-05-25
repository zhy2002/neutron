package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyAddressNodeScope
@Subcomponent(modules = {ThirdPartyAddressNodeModule.class})
public interface ThirdPartyAddressNodeComponent {

    RuleProvider<ThirdPartyAddressNode> getThirdPartyAddressNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyAddressNodeModule(ThirdPartyAddressNodeModule module);

        ThirdPartyAddressNodeComponent build();
    }
}
