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

    @Provides @ComponentScope @Owner AgeOfDependantsNode provideAgeOfDependantsNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AgeOfDependantsNode> provideRuleProvider(Provider<AgeOfDependantsNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AgeOfDependantsNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.AgeOfDependantsNodeRuleProvider> ageOfDependantsNodeRuleProvider
    ) {
        Map<String, RuleProvider<AgeOfDependantsNode>> result = new HashMap<>();
        result.put("ageOfDependantsNode", ageOfDependantsNodeRuleProvider.get());
        return result;
    }
}