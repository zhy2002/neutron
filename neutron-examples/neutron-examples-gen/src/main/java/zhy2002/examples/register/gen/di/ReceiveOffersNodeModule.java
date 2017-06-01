package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ReceiveOffersNodeModule {

    private final ReceiveOffersNode owner;

    public ReceiveOffersNodeModule(ReceiveOffersNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ReceiveOffersNode provideReceiveOffersNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
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

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ReceiveOffersNode> provideRuleProvider(Provider<ReceiveOffersNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ReceiveOffersNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.ReceiveOffersNodeRuleProvider> receiveOffersNodeRuleProvider
    ) {
        Map<String, RuleProvider<ReceiveOffersNode>> result = new HashMap<>();
        result.put("receiveOffersNode", receiveOffersNodeRuleProvider.get());
        return result;
    }
}