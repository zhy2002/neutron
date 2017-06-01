package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ApplicantReferenceNodeModule {

    private final ApplicantReferenceNode owner;

    public ApplicantReferenceNodeModule(ApplicantReferenceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ApplicantReferenceNode provideApplicantReferenceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope OwnershipNode provideOwnershipNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ApplicantReferenceNode> provideRuleProvider(Provider<ApplicantReferenceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ApplicantReferenceNode>> provideInstanceProviderMap(
        Provider<OwnershipNodeChildProvider.ApplicantReferenceNodeRuleProvider> applicantReferenceNodeRuleProvider
    ) {
        Map<String, RuleProvider<ApplicantReferenceNode>> result = new HashMap<>();
        result.put("applicantReferenceNode", applicantReferenceNodeRuleProvider.get());
        return result;
    }
}