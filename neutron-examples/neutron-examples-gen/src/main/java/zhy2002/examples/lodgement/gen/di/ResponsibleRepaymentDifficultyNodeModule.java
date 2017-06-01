package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ResponsibleRepaymentDifficultyNodeModule {

    private final ResponsibleRepaymentDifficultyNode owner;

    public ResponsibleRepaymentDifficultyNodeModule(ResponsibleRepaymentDifficultyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ResponsibleRepaymentDifficultyNode provideResponsibleRepaymentDifficultyNode() {
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

    @Provides @ComponentScope BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ResponsibleRepaymentDifficultyNode> provideRuleProvider(Provider<ResponsibleRepaymentDifficultyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ResponsibleRepaymentDifficultyNode>> provideInstanceProviderMap(
        Provider<BaseResponsibleLendNodeChildProvider.ResponsibleRepaymentDifficultyNodeRuleProvider> responsibleRepaymentDifficultyNodeRuleProvider
    ) {
        Map<String, RuleProvider<ResponsibleRepaymentDifficultyNode>> result = new HashMap<>();
        result.put("responsibleRepaymentDifficultyNode", responsibleRepaymentDifficultyNodeRuleProvider.get());
        return result;
    }
}