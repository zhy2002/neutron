package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyEmailNodeScope
@Subcomponent(modules = {ThirdPartyEmailNodeModule.class})
public interface ThirdPartyEmailNodeComponent {

    RuleProvider<ThirdPartyEmailNode> getThirdPartyEmailNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyEmailNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyEmailNodeModule(ThirdPartyEmailNodeModule module);

        ThirdPartyEmailNodeComponent build();
    }
}
