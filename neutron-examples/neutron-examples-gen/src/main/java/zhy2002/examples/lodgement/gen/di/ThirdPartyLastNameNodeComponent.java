package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyLastNameNodeScope
@Subcomponent(modules = {ThirdPartyLastNameNodeModule.class})
public interface ThirdPartyLastNameNodeComponent {

    ThirdPartyLastNameNodeRuleProvider getThirdPartyLastNameNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyLastNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyLastNameNodeModule(ThirdPartyLastNameNodeModule module);

        ThirdPartyLastNameNodeComponent build();
    }
}
