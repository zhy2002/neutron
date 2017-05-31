package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherIncomeDescriptionNodeModule {

    private final OtherIncomeDescriptionNode owner;

    public OtherIncomeDescriptionNodeModule(OtherIncomeDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomeDescriptionNode provideOtherIncomeDescriptionNode() {
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

    @Provides @ComponentScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherIncomeDescriptionNode> provideRuleProvider(Provider<OtherIncomeDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherIncomeDescriptionNode>> provideInstanceProviderMap(
        Provider<OtherIncomeNodeChildProvider.OtherIncomeDescriptionNodeRuleProvider> otherIncomeDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherIncomeDescriptionNode>> result = new HashMap<>();
        result.put("otherIncomeDescriptionNode", otherIncomeDescriptionNodeRuleProvider.get());
        return result;
    }
}