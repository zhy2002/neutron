package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AgeOfDependantsNodeModule {

    private final AgeOfDependantsNode owner;

    public AgeOfDependantsNodeModule(AgeOfDependantsNode owner) {
        this.owner = owner;
    }

    @Provides @AgeOfDependantsNodeScope @Owner AgeOfDependantsNode provideAgeOfDependantsNode() {
        return owner;
    }

    @Provides @AgeOfDependantsNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AgeOfDependantsNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AgeOfDependantsNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AgeOfDependantsNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @AgeOfDependantsNodeScope
    RuleProvider<AgeOfDependantsNode> provideRuleProvider(Provider<AgeOfDependantsNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AgeOfDependantsNodeScope
    Map<String, RuleProvider<AgeOfDependantsNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.AgeOfDependantsNodeRuleProvider> ageOfDependantsNodeRuleProvider
    ) {
        Map<String, RuleProvider<AgeOfDependantsNode>> result = new HashMap<>();
        result.put("ageOfDependantsNode", ageOfDependantsNodeRuleProvider.get());
        return result;
    }
}