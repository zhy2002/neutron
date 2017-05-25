package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyTypeNodeScope
@Subcomponent(modules = {ThirdPartyTypeNodeModule.class})
public interface ThirdPartyTypeNodeComponent {

    RuleProvider<ThirdPartyTypeNode> getThirdPartyTypeNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyTypeNodeModule(ThirdPartyTypeNodeModule module);

        ThirdPartyTypeNodeComponent build();
    }
}
