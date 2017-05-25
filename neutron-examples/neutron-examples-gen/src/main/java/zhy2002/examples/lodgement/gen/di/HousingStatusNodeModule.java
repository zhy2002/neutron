package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class HousingStatusNodeModule {

    private final HousingStatusNode owner;

    public HousingStatusNodeModule(HousingStatusNode owner) {
        this.owner = owner;
    }

    @Provides @HousingStatusNodeScope @Owner HousingStatusNode provideHousingStatusNode() {
        return owner;
    }

    @Provides @HousingStatusNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @HousingStatusNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @HousingStatusNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @HousingStatusNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @HousingStatusNodeScope
    RuleProvider<HousingStatusNode> provideRuleProvider(Provider<HousingStatusNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @HousingStatusNodeScope
    Map<String, RuleProvider<HousingStatusNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.HousingStatusNodeRuleProvider> housingStatusNodeRuleProvider
    ) {
        Map<String, RuleProvider<HousingStatusNode>> result = new HashMap<>();
        result.put("housingStatusNode", housingStatusNodeRuleProvider.get());
        return result;
    }
}