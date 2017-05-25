package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PrimaryApplicantFlagNodeModule {

    private final PrimaryApplicantFlagNode owner;

    public PrimaryApplicantFlagNodeModule(PrimaryApplicantFlagNode owner) {
        this.owner = owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope @Owner PrimaryApplicantFlagNode providePrimaryApplicantFlagNode() {
        return owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @PrimaryApplicantFlagNodeScope
    RuleProvider<PrimaryApplicantFlagNode> provideRuleProvider(Provider<PrimaryApplicantFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PrimaryApplicantFlagNodeScope
    Map<String, RuleProvider<PrimaryApplicantFlagNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.PrimaryApplicantFlagNodeRuleProvider> primaryApplicantFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<PrimaryApplicantFlagNode>> result = new HashMap<>();
        result.put("primaryApplicantFlagNode", primaryApplicantFlagNodeRuleProvider.get());
        return result;
    }
}