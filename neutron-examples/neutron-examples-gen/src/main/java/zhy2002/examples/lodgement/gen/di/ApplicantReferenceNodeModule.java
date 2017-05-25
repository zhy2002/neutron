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

    @Provides @ApplicantReferenceNodeScope @Owner ApplicantReferenceNode provideApplicantReferenceNode() {
        return owner;
    }

    @Provides @ApplicantReferenceNodeScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @ApplicantReferenceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ApplicantReferenceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ApplicantReferenceNodeScope OwnershipNode provideOwnershipNode() {
        return owner.getParent();
    }

    @Provides @ApplicantReferenceNodeScope
    RuleProvider<ApplicantReferenceNode> provideRuleProvider(Provider<ApplicantReferenceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ApplicantReferenceNodeScope
    Map<String, RuleProvider<ApplicantReferenceNode>> provideInstanceProviderMap(
        Provider<OwnershipNodeChildProvider.ApplicantReferenceNodeRuleProvider> applicantReferenceNodeRuleProvider
    ) {
        Map<String, RuleProvider<ApplicantReferenceNode>> result = new HashMap<>();
        result.put("applicantReferenceNode", applicantReferenceNodeRuleProvider.get());
        return result;
    }
}