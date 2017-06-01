package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class FirstNameNodeModule {

    private final FirstNameNode owner;

    public FirstNameNodeModule(FirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner FirstNameNode provideFirstNameNode() {
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
    RuleProvider<FirstNameNode> provideRuleProvider(Provider<FirstNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<FirstNameNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.FirstNameNodeRuleProvider> firstNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<FirstNameNode>> result = new HashMap<>();
        result.put("firstNameNode", firstNameNodeRuleProvider.get());
        return result;
    }
}