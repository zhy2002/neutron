package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherIncomeAddBackTypeNodeModule {

    private final OtherIncomeAddBackTypeNode owner;

    public OtherIncomeAddBackTypeNodeModule(OtherIncomeAddBackTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomeAddBackTypeNode provideOtherIncomeAddBackTypeNode() {
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
    RuleProvider<OtherIncomeAddBackTypeNode> provideRuleProvider(Provider<OtherIncomeAddBackTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherIncomeAddBackTypeNode>> provideInstanceProviderMap(
        Provider<OtherIncomeNodeChildProvider.OtherIncomeAddBackTypeNodeRuleProvider> otherIncomeAddBackTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherIncomeAddBackTypeNode>> result = new HashMap<>();
        result.put("otherIncomeAddBackTypeNode", otherIncomeAddBackTypeNodeRuleProvider.get());
        return result;
    }
}