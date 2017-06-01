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

    @Provides @ComponentScope @Owner MortgageChargePositionNode provideMortgageChargePositionNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgageChargePositionNode> provideRuleProvider(Provider<MortgageChargePositionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageChargePositionNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageChargePositionNodeRuleProvider> mortgageChargePositionNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageChargePositionNode>> result = new HashMap<>();
        result.put("mortgageChargePositionNode", mortgageChargePositionNodeRuleProvider.get());
        return result;
    }
}