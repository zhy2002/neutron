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

    @Provides @AddressRefListNodeScope @Owner AddressRefListNode provideAddressRefListNode() {
        return owner;
    }

    @Provides @AddressRefListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @AddressRefListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AddressRefListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AddressRefListNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @AddressRefListNodeScope
    Map<String, RuleProvider<AddressRefListNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.AddressRefListNodeRuleProvider> addressRefListNodeRuleProvider
    ) {
        Map<String, RuleProvider<AddressRefListNode>> result = new HashMap<>();
        result.put("addressRefListNode", addressRefListNodeRuleProvider.get());
        return result;
    }
}