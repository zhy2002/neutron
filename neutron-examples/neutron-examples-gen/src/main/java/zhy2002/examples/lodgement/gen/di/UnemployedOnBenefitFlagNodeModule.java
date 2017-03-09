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

    @Provides @UnemployedOnBenefitFlagNodeScope @Owner UnemployedOnBenefitFlagNode provideUnemployedOnBenefitFlagNode() {
        return owner;
    }

    @Provides @UnemployedOnBenefitFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @UnemployedOnBenefitFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @UnemployedOnBenefitFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @UnemployedOnBenefitFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @UnemployedOnBenefitFlagNodeScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @UnemployedOnBenefitFlagNodeScope
    Map<String, RuleProvider<UnemployedOnBenefitFlagNode>> provideInstanceProviders(
        Provider<UnemployedNodeChildProvider.UnemployedOnBenefitFlagNodeRuleProvider> unemployedOnBenefitFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<UnemployedOnBenefitFlagNode>> result = new HashMap<>();
        result.put("unemployedOnBenefitFlagNode", unemployedOnBenefitFlagNodeRuleProvider.get());
        return result;
    }
}