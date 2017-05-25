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

    @Provides @ResponsibleRepaymentDifficultyNodeScope @Owner ResponsibleRepaymentDifficultyNode provideResponsibleRepaymentDifficultyNode() {
        return owner;
    }

    @Provides @ResponsibleRepaymentDifficultyNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @ResponsibleRepaymentDifficultyNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ResponsibleRepaymentDifficultyNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ResponsibleRepaymentDifficultyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ResponsibleRepaymentDifficultyNodeScope BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner.getParent();
    }

    @Provides @ResponsibleRepaymentDifficultyNodeScope
    RuleProvider<ResponsibleRepaymentDifficultyNode> provideRuleProvider(Provider<ResponsibleRepaymentDifficultyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ResponsibleRepaymentDifficultyNodeScope
    Map<String, RuleProvider<ResponsibleRepaymentDifficultyNode>> provideInstanceProviderMap(
        Provider<BaseResponsibleLendNodeChildProvider.ResponsibleRepaymentDifficultyNodeRuleProvider> responsibleRepaymentDifficultyNodeRuleProvider
    ) {
        Map<String, RuleProvider<ResponsibleRepaymentDifficultyNode>> result = new HashMap<>();
        result.put("responsibleRepaymentDifficultyNode", responsibleRepaymentDifficultyNodeRuleProvider.get());
        return result;
    }
}