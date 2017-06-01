package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class UnemployedOnBenefitFlagNodeModule {

    private final UnemployedOnBenefitFlagNode owner;

    public UnemployedOnBenefitFlagNodeModule(UnemployedOnBenefitFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UnemployedOnBenefitFlagNode provideUnemployedOnBenefitFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<UnemployedOnBenefitFlagNode> provideRuleProvider(Provider<UnemployedOnBenefitFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<UnemployedOnBenefitFlagNode>> provideInstanceProviderMap(
        Provider<UnemployedNodeChildProvider.UnemployedOnBenefitFlagNodeRuleProvider> unemployedOnBenefitFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<UnemployedOnBenefitFlagNode>> result = new HashMap<>();
        result.put("unemployedOnBenefitFlagNode", unemployedOnBenefitFlagNodeRuleProvider.get());
        return result;
    }
}