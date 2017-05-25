package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyFirstNameNodeScope
@Subcomponent(modules = {ThirdPartyFirstNameNodeModule.class})
public interface ThirdPartyFirstNameNodeComponent {

    RuleProvider<ThirdPartyFirstNameNode> getThirdPartyFirstNameNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyFirstNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyFirstNameNodeModule(ThirdPartyFirstNameNodeModule module);

        ThirdPartyFirstNameNodeComponent build();
    }
}
