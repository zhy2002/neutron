package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageChargePositionNodeModule {

    private final MortgageChargePositionNode owner;

    public MortgageChargePositionNodeModule(MortgageChargePositionNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageChargePositionNodeScope @Owner MortgageChargePositionNode provideMortgageChargePositionNode() {
        return owner;
    }

    @Provides @MortgageChargePositionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageChargePositionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageChargePositionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageChargePositionNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageChargePositionNodeScope
    RuleProvider<MortgageChargePositionNode> provideRuleProvider(Provider<MortgageChargePositionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @MortgageChargePositionNodeScope
    Map<String, RuleProvider<MortgageChargePositionNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageChargePositionNodeRuleProvider> mortgageChargePositionNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageChargePositionNode>> result = new HashMap<>();
        result.put("mortgageChargePositionNode", mortgageChargePositionNodeRuleProvider.get());
        return result;
    }
}