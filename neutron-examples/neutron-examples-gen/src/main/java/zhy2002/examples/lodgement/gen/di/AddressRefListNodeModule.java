package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AddressRefListNodeModule {

    private final AddressRefListNode owner;

    public AddressRefListNodeModule(AddressRefListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AddressRefListNode provideAddressRefListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AddressRefListNode> provideRuleProvider(Provider<AddressRefListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AddressRefListNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.AddressRefListNodeRuleProvider> addressRefListNodeRuleProvider
    ) {
        Map<String, RuleProvider<AddressRefListNode>> result = new HashMap<>();
        result.put("addressRefListNode", addressRefListNodeRuleProvider.get());
        return result;
    }
}