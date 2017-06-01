package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherIncomePreviousYearNodeModule {

    private final OtherIncomePreviousYearNode owner;

    public OtherIncomePreviousYearNodeModule(OtherIncomePreviousYearNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomePreviousYearNode provideOtherIncomePreviousYearNode() {
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

    @Provides @ComponentScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherIncomePreviousYearNode> provideRuleProvider(Provider<OtherIncomePreviousYearNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherIncomePreviousYearNode>> provideInstanceProviderMap(
        Provider<OtherIncomeNodeChildProvider.OtherIncomePreviousYearNodeRuleProvider> otherIncomePreviousYearNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherIncomePreviousYearNode>> result = new HashMap<>();
        result.put("otherIncomePreviousYearNode", otherIncomePreviousYearNodeRuleProvider.get());
        return result;
    }
}