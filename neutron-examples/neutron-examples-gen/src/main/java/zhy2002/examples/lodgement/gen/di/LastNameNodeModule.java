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

    @Provides @LastNameNodeScope @Owner LastNameNode provideLastNameNode() {
        return owner;
    }

    @Provides @LastNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @LastNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LastNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LastNameNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @LastNameNodeScope
    Map<String, RuleProvider<LastNameNode>> provideInstanceProviders(
        Provider<PersonGeneralNodeChildProvider.LastNameNodeRuleProvider> lastNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<LastNameNode>> result = new HashMap<>();
        result.put("lastNameNode", lastNameNodeRuleProvider.get());
        return result;
    }
}