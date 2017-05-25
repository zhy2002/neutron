package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AddressLineNodeModule {

    private final AddressLineNode owner;

    public AddressLineNodeModule(AddressLineNode owner) {
        this.owner = owner;
    }

    @Provides @AddressLineNodeScope @Owner AddressLineNode provideAddressLineNode() {
        return owner;
    }

    @Provides @AddressLineNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AddressLineNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AddressLineNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AddressLineNodeScope AddressNode<?> provideAddressNode() {
        return owner.getParent();
    }

    @Provides @AddressLineNodeScope
    RuleProvider<AddressLineNode> provideRuleProvider(Provider<AddressLineNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AddressLineNodeScope
    Map<String, RuleProvider<AddressLineNode>> provideInstanceProviderMap(
        Provider<AddressNodeChildProvider.AddressLineNodeRuleProvider> addressLineNodeRuleProvider
    ) {
        Map<String, RuleProvider<AddressLineNode>> result = new HashMap<>();
        result.put("addressLineNode", addressLineNodeRuleProvider.get());
        return result;
    }
}