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

    @Provides @ComponentScope @Owner AccessTelephoneNode provideAccessTelephoneNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AccessTelephoneNode> provideRuleProvider(Provider<AccessTelephoneNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AccessTelephoneNode>> provideInstanceProviderMap(
        Provider<AccessNodeChildProvider.AccessTelephoneNodeRuleProvider> accessTelephoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessTelephoneNode>> result = new HashMap<>();
        result.put("accessTelephoneNode", accessTelephoneNodeRuleProvider.get());
        return result;
    }
}