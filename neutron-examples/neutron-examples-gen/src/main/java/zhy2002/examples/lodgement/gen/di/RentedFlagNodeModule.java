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

    @Provides @RentedFlagNodeScope @Owner RentedFlagNode provideRentedFlagNode() {
        return owner;
    }

    @Provides @RentedFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @RentedFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @RentedFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RentedFlagNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @RentedFlagNodeScope
    Map<String, RuleProvider<RentedFlagNode>> provideInstanceProviders(
        Provider<PropertyNodeChildProvider.RentedFlagNodeRuleProvider> rentedFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<RentedFlagNode>> result = new HashMap<>();
        result.put("rentedFlagNode", rentedFlagNodeRuleProvider.get());
        return result;
    }
}