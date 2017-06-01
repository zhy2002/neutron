package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ApplicationTypeNodeModule {

    private final ApplicationTypeNode owner;

    public ApplicationTypeNodeModule(ApplicationTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ApplicationTypeNode provideApplicationTypeNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ApplicationTypeNode> provideRuleProvider(Provider<ApplicationTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ApplicationTypeNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.ApplicationTypeNodeRuleProvider> applicationTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ApplicationTypeNode>> result = new HashMap<>();
        result.put("applicationTypeNode", applicationTypeNodeRuleProvider.get());
        return result;
    }
}