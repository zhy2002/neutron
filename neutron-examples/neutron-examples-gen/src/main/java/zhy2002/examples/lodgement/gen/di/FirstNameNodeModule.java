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

    @Provides @FirstNameNodeScope @Owner FirstNameNode provideFirstNameNode() {
        return owner;
    }

    @Provides @FirstNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @FirstNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @FirstNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @FirstNameNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @FirstNameNodeScope
    Map<String, RuleProvider<FirstNameNode>> provideInstanceProviders(
        Provider<PersonGeneralNodeChildProvider.FirstNameNodeRuleProvider> firstNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<FirstNameNode>> result = new HashMap<>();
        result.put("firstNameNode", firstNameNodeRuleProvider.get());
        return result;
    }
}