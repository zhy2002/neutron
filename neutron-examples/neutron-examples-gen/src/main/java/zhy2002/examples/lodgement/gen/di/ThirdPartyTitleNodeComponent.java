package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyTitleNodeScope
@Subcomponent(modules = {ThirdPartyTitleNodeModule.class})
public interface ThirdPartyTitleNodeComponent {

    ThirdPartyTitleNodeRuleProvider getThirdPartyTitleNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyTitleNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyTitleNodeModule(ThirdPartyTitleNodeModule module);

        ThirdPartyTitleNodeComponent build();
    }
}
