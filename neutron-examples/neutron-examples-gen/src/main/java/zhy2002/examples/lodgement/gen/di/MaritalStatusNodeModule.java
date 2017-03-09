package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MaritalStatusNodeModule {

    private final MaritalStatusNode owner;

    public MaritalStatusNodeModule(MaritalStatusNode owner) {
        this.owner = owner;
    }

    @Provides @MaritalStatusNodeScope @Owner MaritalStatusNode provideMaritalStatusNode() {
        return owner;
    }

    @Provides @MaritalStatusNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MaritalStatusNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MaritalStatusNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MaritalStatusNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @MaritalStatusNodeScope
    Map<String, RuleProvider<MaritalStatusNode>> provideInstanceProviders(
        Provider<PersonGeneralNodeChildProvider.MaritalStatusNodeRuleProvider> maritalStatusNodeRuleProvider
    ) {
        Map<String, RuleProvider<MaritalStatusNode>> result = new HashMap<>();
        result.put("maritalStatusNode", maritalStatusNodeRuleProvider.get());
        return result;
    }
}