package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class RetiredOnBenefitFlagNodeModule {

    private final RetiredOnBenefitFlagNode owner;

    public RetiredOnBenefitFlagNodeModule(RetiredOnBenefitFlagNode owner) {
        this.owner = owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner RetiredOnBenefitFlagNode provideRetiredOnBenefitFlagNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope RetiredEmploymentNode provideRetiredEmploymentNode() {
        return owner.getParent();
    }

    @Provides @RetiredOnBenefitFlagNodeScope
    Map<String, RuleProvider<RetiredOnBenefitFlagNode>> provideInstanceProviders(
        Provider<RetiredEmploymentNodeChildProvider.RetiredOnBenefitFlagNodeRuleProvider> retiredOnBenefitFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<RetiredOnBenefitFlagNode>> result = new HashMap<>();
        result.put("retiredOnBenefitFlagNode", retiredOnBenefitFlagNodeRuleProvider.get());
        return result;
    }
}