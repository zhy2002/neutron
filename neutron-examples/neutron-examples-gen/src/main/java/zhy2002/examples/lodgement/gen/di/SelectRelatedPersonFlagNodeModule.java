package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SelectRelatedPersonFlagNodeModule {

    private final SelectRelatedPersonFlagNode owner;

    public SelectRelatedPersonFlagNodeModule(SelectRelatedPersonFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonFlagNode provideSelectRelatedPersonFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope SelectRelatedPersonNode provideSelectRelatedPersonNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SelectRelatedPersonFlagNode> provideRuleProvider(Provider<SelectRelatedPersonFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SelectRelatedPersonFlagNode>> provideInstanceProviderMap(
        Provider<SelectRelatedPersonNodeChildProvider.SelectRelatedPersonFlagNodeRuleProvider> selectRelatedPersonFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<SelectRelatedPersonFlagNode>> result = new HashMap<>();
        result.put("selectRelatedPersonFlagNode", selectRelatedPersonFlagNodeRuleProvider.get());
        return result;
    }
}