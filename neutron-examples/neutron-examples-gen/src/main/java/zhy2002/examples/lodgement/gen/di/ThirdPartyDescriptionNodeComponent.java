package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyDescriptionNodeScope
@Subcomponent(modules = {ThirdPartyDescriptionNodeModule.class})
public interface ThirdPartyDescriptionNodeComponent {

    ThirdPartyDescriptionNodeRuleProvider getThirdPartyDescriptionNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyDescriptionNodeModule(ThirdPartyDescriptionNodeModule module);

        ThirdPartyDescriptionNodeComponent build();
    }
}
