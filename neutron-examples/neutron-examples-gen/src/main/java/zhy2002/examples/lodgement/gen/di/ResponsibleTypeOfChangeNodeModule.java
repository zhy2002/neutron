package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ResponsibleTypeOfChangeNodeModule {

    private final ResponsibleTypeOfChangeNode owner;

    public ResponsibleTypeOfChangeNodeModule(ResponsibleTypeOfChangeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ResponsibleTypeOfChangeNode provideResponsibleTypeOfChangeNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ResponsibleTypeOfChangeNode> provideRuleProvider(Provider<ResponsibleTypeOfChangeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ResponsibleTypeOfChangeNode>> provideInstanceProviderMap(
        Provider<BaseResponsibleLendNodeChildProvider.ResponsibleTypeOfChangeNodeRuleProvider> responsibleTypeOfChangeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ResponsibleTypeOfChangeNode>> result = new HashMap<>();
        result.put("responsibleTypeOfChangeNode", responsibleTypeOfChangeNodeRuleProvider.get());
        return result;
    }
}