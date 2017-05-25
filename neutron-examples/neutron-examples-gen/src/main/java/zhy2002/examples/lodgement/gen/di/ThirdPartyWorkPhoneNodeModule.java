package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyWorkPhoneNodeModule {

    private final ThirdPartyWorkPhoneNode owner;

    public ThirdPartyWorkPhoneNodeModule(ThirdPartyWorkPhoneNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyWorkPhoneNodeScope @Owner ThirdPartyWorkPhoneNode provideThirdPartyWorkPhoneNode() {
        return owner;
    }

    @Provides @ThirdPartyWorkPhoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @ThirdPartyWorkPhoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyWorkPhoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyWorkPhoneNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyWorkPhoneNodeScope
    RuleProvider<ThirdPartyWorkPhoneNode> provideRuleProvider(Provider<ThirdPartyWorkPhoneNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ThirdPartyWorkPhoneNodeScope
    Map<String, RuleProvider<ThirdPartyWorkPhoneNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyWorkPhoneNodeRuleProvider> thirdPartyWorkPhoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyWorkPhoneNode>> result = new HashMap<>();
        result.put("thirdPartyWorkPhoneNode", thirdPartyWorkPhoneNodeRuleProvider.get());
        return result;
    }
}