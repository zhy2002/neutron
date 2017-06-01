package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LastNameNodeModule {

    private final LastNameNode owner;

    public LastNameNodeModule(LastNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LastNameNode provideLastNameNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LastNameNode> provideRuleProvider(Provider<LastNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LastNameNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.LastNameNodeRuleProvider> lastNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<LastNameNode>> result = new HashMap<>();
        result.put("lastNameNode", lastNameNodeRuleProvider.get());
        return result;
    }
}