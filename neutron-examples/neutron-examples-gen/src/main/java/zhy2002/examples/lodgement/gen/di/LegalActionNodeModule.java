package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LegalActionNodeModule {

    private final LegalActionNode owner;

    public LegalActionNodeModule(LegalActionNode owner) {
        this.owner = owner;
    }

    @Provides @LegalActionNodeScope @Owner LegalActionNode provideLegalActionNode() {
        return owner;
    }

    @Provides @LegalActionNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @LegalActionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @LegalActionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LegalActionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LegalActionNodeScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @LegalActionNodeScope
    RuleProvider<LegalActionNode> provideRuleProvider(Provider<LegalActionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @LegalActionNodeScope
    Map<String, RuleProvider<LegalActionNode>> provideInstanceProviderMap(
        Provider<BasePrivacyNodeChildProvider.LegalActionNodeRuleProvider> legalActionNodeRuleProvider
    ) {
        Map<String, RuleProvider<LegalActionNode>> result = new HashMap<>();
        result.put("legalActionNode", legalActionNodeRuleProvider.get());
        return result;
    }
}