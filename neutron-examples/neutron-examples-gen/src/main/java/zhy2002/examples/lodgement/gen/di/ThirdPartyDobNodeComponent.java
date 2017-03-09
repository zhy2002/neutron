package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyDobNodeScope
@Subcomponent(modules = {ThirdPartyDobNodeModule.class})
public interface ThirdPartyDobNodeComponent {

    ThirdPartyDobNodeRuleProvider getThirdPartyDobNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyDobNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyDobNodeModule(ThirdPartyDobNodeModule module);

        ThirdPartyDobNodeComponent build();
    }
}
