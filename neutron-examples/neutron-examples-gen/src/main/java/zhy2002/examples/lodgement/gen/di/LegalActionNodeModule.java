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

    @Provides @ComponentScope @Owner LegalActionNode provideLegalActionNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LegalActionNode> provideRuleProvider(Provider<LegalActionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LegalActionNode>> provideInstanceProviderMap(
        Provider<BasePrivacyNodeChildProvider.LegalActionNodeRuleProvider> legalActionNodeRuleProvider
    ) {
        Map<String, RuleProvider<LegalActionNode>> result = new HashMap<>();
        result.put("legalActionNode", legalActionNodeRuleProvider.get());
        return result;
    }
}