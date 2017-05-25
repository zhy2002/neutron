package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherIncomeTypeNodeModule {

    private final OtherIncomeTypeNode owner;

    public OtherIncomeTypeNodeModule(OtherIncomeTypeNode owner) {
        this.owner = owner;
    }

    @Provides @OtherIncomeTypeNodeScope @Owner OtherIncomeTypeNode provideOtherIncomeTypeNode() {
        return owner;
    }

    @Provides @OtherIncomeTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherIncomeTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherIncomeTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherIncomeTypeNodeScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @OtherIncomeTypeNodeScope
    RuleProvider<OtherIncomeTypeNode> provideRuleProvider(Provider<OtherIncomeTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherIncomeTypeNodeScope
    Map<String, RuleProvider<OtherIncomeTypeNode>> provideInstanceProviderMap(
        Provider<OtherIncomeNodeChildProvider.OtherIncomeTypeNodeRuleProvider> otherIncomeTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherIncomeTypeNode>> result = new HashMap<>();
        result.put("otherIncomeTypeNode", otherIncomeTypeNodeRuleProvider.get());
        return result;
    }
}