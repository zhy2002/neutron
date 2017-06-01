package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class AddressRefNodeModule {

    private final AddressRefNode owner;

    public AddressRefNodeModule(AddressRefNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AddressRefNode provideAddressRefNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
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

    @Provides @ComponentScope AddressRefListNode provideAddressRefListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AddressRefNode> provideRuleProvider(Provider<AddressRefNodeRuleProvider> provider) {
        return provider.get();
    }

}