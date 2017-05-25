package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccessTelephoneNodeModule {

    private final AccessTelephoneNode owner;

    public AccessTelephoneNodeModule(AccessTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @AccessTelephoneNodeScope @Owner AccessTelephoneNode provideAccessTelephoneNode() {
        return owner;
    }

    @Provides @AccessTelephoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @AccessTelephoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessTelephoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AccessTelephoneNodeScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @AccessTelephoneNodeScope
    RuleProvider<AccessTelephoneNode> provideRuleProvider(Provider<AccessTelephoneNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AccessTelephoneNodeScope
    Map<String, RuleProvider<AccessTelephoneNode>> provideInstanceProviderMap(
        Provider<AccessNodeChildProvider.AccessTelephoneNodeRuleProvider> accessTelephoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessTelephoneNode>> result = new HashMap<>();
        result.put("accessTelephoneNode", accessTelephoneNodeRuleProvider.get());
        return result;
    }
}