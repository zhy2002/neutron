package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AdditionalNodeModule {

    private final AdditionalNode owner;

    public AdditionalNodeModule(AdditionalNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AdditionalNode provideAdditionalNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AdditionalNode> provideRuleProvider(Provider<AdditionalNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AdditionalNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.AdditionalNodeRuleProvider> additionalNodeRuleProvider
    ) {
        Map<String, RuleProvider<AdditionalNode>> result = new HashMap<>();
        result.put("additionalNode", additionalNodeRuleProvider.get());
        return result;
    }
}