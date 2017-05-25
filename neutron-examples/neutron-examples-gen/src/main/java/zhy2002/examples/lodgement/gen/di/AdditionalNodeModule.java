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

    @Provides @AdditionalNodeScope @Owner AdditionalNode provideAdditionalNode() {
        return owner;
    }

    @Provides @AdditionalNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AdditionalNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AdditionalNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AdditionalNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @AdditionalNodeScope
    RuleProvider<AdditionalNode> provideRuleProvider(Provider<AdditionalNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AdditionalNodeScope
    Map<String, RuleProvider<AdditionalNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.AdditionalNodeRuleProvider> additionalNodeRuleProvider
    ) {
        Map<String, RuleProvider<AdditionalNode>> result = new HashMap<>();
        result.put("additionalNode", additionalNodeRuleProvider.get());
        return result;
    }
}