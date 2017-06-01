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

    @Provides @ComponentScope @Owner PersonApplicantTypeNode providePersonApplicantTypeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseApplicantTypeNode<?> provideBaseApplicantTypeNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonApplicantTypeNode> provideRuleProvider(Provider<PersonApplicantTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonApplicantTypeNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.PersonApplicantTypeNodeRuleProvider> personApplicantTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonApplicantTypeNode>> result = new HashMap<>();
        result.put("personApplicantTypeNode", personApplicantTypeNodeRuleProvider.get());
        return result;
    }
}