package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class RentedFlagNodeModule {

    private final RentedFlagNode owner;

    public RentedFlagNodeModule(RentedFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RentedFlagNode provideRentedFlagNode() {
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

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<RentedFlagNode> provideRuleProvider(Provider<RentedFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<RentedFlagNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.RentedFlagNodeRuleProvider> rentedFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<RentedFlagNode>> result = new HashMap<>();
        result.put("rentedFlagNode", rentedFlagNodeRuleProvider.get());
        return result;
    }
}