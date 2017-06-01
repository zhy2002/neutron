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

    @Provides @ComponentScope @Owner RetiredOnBenefitFlagNode provideRetiredOnBenefitFlagNode() {
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

    @Provides @ComponentScope RetiredEmploymentNode provideRetiredEmploymentNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<RetiredOnBenefitFlagNode> provideRuleProvider(Provider<RetiredOnBenefitFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<RetiredOnBenefitFlagNode>> provideInstanceProviderMap(
        Provider<RetiredEmploymentNodeChildProvider.RetiredOnBenefitFlagNodeRuleProvider> retiredOnBenefitFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<RetiredOnBenefitFlagNode>> result = new HashMap<>();
        result.put("retiredOnBenefitFlagNode", retiredOnBenefitFlagNodeRuleProvider.get());
        return result;
    }
}