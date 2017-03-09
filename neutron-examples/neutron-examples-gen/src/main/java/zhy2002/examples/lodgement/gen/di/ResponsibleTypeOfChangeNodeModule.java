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

    @Provides @ResponsibleTypeOfChangeNodeScope @Owner ResponsibleTypeOfChangeNode provideResponsibleTypeOfChangeNode() {
        return owner;
    }

    @Provides @ResponsibleTypeOfChangeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ResponsibleTypeOfChangeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ResponsibleTypeOfChangeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ResponsibleTypeOfChangeNodeScope BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner.getParent();
    }

    @Provides @ResponsibleTypeOfChangeNodeScope
    Map<String, RuleProvider<ResponsibleTypeOfChangeNode>> provideInstanceProviders(
        Provider<BaseResponsibleLendNodeChildProvider.ResponsibleTypeOfChangeNodeRuleProvider> responsibleTypeOfChangeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ResponsibleTypeOfChangeNode>> result = new HashMap<>();
        result.put("responsibleTypeOfChangeNode", responsibleTypeOfChangeNodeRuleProvider.get());
        return result;
    }
}