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

    @Provides @AccessTelephoneNodeScope @Owner StringUiNode<?> provideStringUiNode() {
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
    Map<String, RuleProvider<AccessTelephoneNode>> provideInstanceProviders(
        Provider<AccessNodeChildProvider.AccessTelephoneNodeRuleProvider> accessTelephoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessTelephoneNode>> result = new HashMap<>();
        result.put("accessTelephoneNode", accessTelephoneNodeRuleProvider.get());
        return result;
    }
}