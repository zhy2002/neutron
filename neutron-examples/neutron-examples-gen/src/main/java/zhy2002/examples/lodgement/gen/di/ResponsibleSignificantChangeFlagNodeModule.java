package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ResponsibleSignificantChangeFlagNodeModule {

    private final ResponsibleSignificantChangeFlagNode owner;

    public ResponsibleSignificantChangeFlagNodeModule(ResponsibleSignificantChangeFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ResponsibleSignificantChangeFlagNode provideResponsibleSignificantChangeFlagNode() {
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

    @Provides @ComponentScope BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ResponsibleSignificantChangeFlagNode> provideRuleProvider(Provider<ResponsibleSignificantChangeFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ResponsibleSignificantChangeFlagNode>> provideInstanceProviderMap(
        Provider<BaseResponsibleLendNodeChildProvider.ResponsibleSignificantChangeFlagNodeRuleProvider> responsibleSignificantChangeFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ResponsibleSignificantChangeFlagNode>> result = new HashMap<>();
        result.put("responsibleSignificantChangeFlagNode", responsibleSignificantChangeFlagNodeRuleProvider.get());
        return result;
    }
}