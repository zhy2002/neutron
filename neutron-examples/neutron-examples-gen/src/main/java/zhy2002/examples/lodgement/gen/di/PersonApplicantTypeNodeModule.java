package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonApplicantTypeNodeModule {

    private final PersonApplicantTypeNode owner;

    public PersonApplicantTypeNodeModule(PersonApplicantTypeNode owner) {
        this.owner = owner;
    }

    @Provides @PersonApplicantTypeNodeScope @Owner PersonApplicantTypeNode providePersonApplicantTypeNode() {
        return owner;
    }

    @Provides @PersonApplicantTypeNodeScope @Owner BaseApplicantTypeNode<?> provideBaseApplicantTypeNode() {
        return owner;
    }

    @Provides @PersonApplicantTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonApplicantTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonApplicantTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonApplicantTypeNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @PersonApplicantTypeNodeScope
    RuleProvider<PersonApplicantTypeNode> provideRuleProvider(Provider<PersonApplicantTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PersonApplicantTypeNodeScope
    Map<String, RuleProvider<PersonApplicantTypeNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.PersonApplicantTypeNodeRuleProvider> personApplicantTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonApplicantTypeNode>> result = new HashMap<>();
        result.put("personApplicantTypeNode", personApplicantTypeNodeRuleProvider.get());
        return result;
    }
}