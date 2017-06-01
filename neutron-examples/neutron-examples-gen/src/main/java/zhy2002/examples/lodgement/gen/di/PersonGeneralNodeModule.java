package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonGeneralNodeModule {

    private final PersonGeneralNode owner;

    public PersonGeneralNodeModule(PersonGeneralNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonGeneralNode providePersonGeneralNode() {
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

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonGeneralNode> provideRuleProvider(Provider<PersonGeneralNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonGeneralNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PersonGeneralNodeRuleProvider> personGeneralNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonGeneralNode>> result = new HashMap<>();
        result.put("personGeneralNode", personGeneralNodeRuleProvider.get());
        return result;
    }
}