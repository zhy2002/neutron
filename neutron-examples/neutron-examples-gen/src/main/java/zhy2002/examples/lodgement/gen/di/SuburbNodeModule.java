package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SuburbNodeModule {

    private final SuburbNode owner;

    public SuburbNodeModule(SuburbNode owner) {
        this.owner = owner;
    }

    @Provides @SuburbNodeScope @Owner SuburbNode provideSuburbNode() {
        return owner;
    }

    @Provides @SuburbNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SuburbNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SuburbNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SuburbNodeScope AddressNode<?> provideAddressNode() {
        return owner.getParent();
    }

    @Provides @SuburbNodeScope
    RuleProvider<SuburbNode> provideRuleProvider(Provider<SuburbNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SuburbNodeScope
    Map<String, RuleProvider<SuburbNode>> provideInstanceProviderMap(
        Provider<AddressNodeChildProvider.SuburbNodeRuleProvider> suburbNodeRuleProvider
    ) {
        Map<String, RuleProvider<SuburbNode>> result = new HashMap<>();
        result.put("suburbNode", suburbNodeRuleProvider.get());
        return result;
    }
}