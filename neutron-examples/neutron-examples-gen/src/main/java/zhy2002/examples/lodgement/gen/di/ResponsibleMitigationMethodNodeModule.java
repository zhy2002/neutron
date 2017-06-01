package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ResponsibleMitigationMethodNodeModule {

    private final ResponsibleMitigationMethodNode owner;

    public ResponsibleMitigationMethodNodeModule(ResponsibleMitigationMethodNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ResponsibleMitigationMethodNode provideResponsibleMitigationMethodNode() {
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
    RuleProvider<ResponsibleMitigationMethodNode> provideRuleProvider(Provider<ResponsibleMitigationMethodNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ResponsibleMitigationMethodNode>> provideInstanceProviderMap(
        Provider<BaseResponsibleLendNodeChildProvider.ResponsibleMitigationMethodNodeRuleProvider> responsibleMitigationMethodNodeRuleProvider
    ) {
        Map<String, RuleProvider<ResponsibleMitigationMethodNode>> result = new HashMap<>();
        result.put("responsibleMitigationMethodNode", responsibleMitigationMethodNodeRuleProvider.get());
        return result;
    }
}