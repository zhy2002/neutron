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

    @Provides @ComponentScope @Owner ThirdPartyWorkPhoneNode provideThirdPartyWorkPhoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ThirdPartyWorkPhoneNode> provideRuleProvider(Provider<ThirdPartyWorkPhoneNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ThirdPartyWorkPhoneNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyWorkPhoneNodeRuleProvider> thirdPartyWorkPhoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyWorkPhoneNode>> result = new HashMap<>();
        result.put("thirdPartyWorkPhoneNode", thirdPartyWorkPhoneNodeRuleProvider.get());
        return result;
    }
}