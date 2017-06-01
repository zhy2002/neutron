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

    @Provides @ComponentScope @Owner AddressLineNode provideAddressLineNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
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

    @Provides @ComponentScope AddressNode<?> provideAddressNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AddressLineNode> provideRuleProvider(Provider<AddressLineNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AddressLineNode>> provideInstanceProviderMap(
        Provider<AddressNodeChildProvider.AddressLineNodeRuleProvider> addressLineNodeRuleProvider
    ) {
        Map<String, RuleProvider<AddressLineNode>> result = new HashMap<>();
        result.put("addressLineNode", addressLineNodeRuleProvider.get());
        return result;
    }
}