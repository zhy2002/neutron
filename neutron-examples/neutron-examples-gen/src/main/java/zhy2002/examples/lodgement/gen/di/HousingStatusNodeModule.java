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

    @Provides @ComponentScope @Owner HousingStatusNode provideHousingStatusNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<HousingStatusNode> provideRuleProvider(Provider<HousingStatusNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<HousingStatusNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.HousingStatusNodeRuleProvider> housingStatusNodeRuleProvider
    ) {
        Map<String, RuleProvider<HousingStatusNode>> result = new HashMap<>();
        result.put("housingStatusNode", housingStatusNodeRuleProvider.get());
        return result;
    }
}