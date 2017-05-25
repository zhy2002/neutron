package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ThirdPartyWorkPhoneNodeScope
@Subcomponent(modules = {ThirdPartyWorkPhoneNodeModule.class})
public interface ThirdPartyWorkPhoneNodeComponent {

    RuleProvider<ThirdPartyWorkPhoneNode> getThirdPartyWorkPhoneNodeRuleProvider();
    Map<String, RuleProvider<ThirdPartyWorkPhoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setThirdPartyWorkPhoneNodeModule(ThirdPartyWorkPhoneNodeModule module);

        ThirdPartyWorkPhoneNodeComponent build();
    }
}
