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

    @Provides @OtherIncomePreviousYearNodeScope @Owner OtherIncomePreviousYearNode provideOtherIncomePreviousYearNode() {
        return owner;
    }

    @Provides @OtherIncomePreviousYearNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @OtherIncomePreviousYearNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherIncomePreviousYearNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherIncomePreviousYearNodeScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @OtherIncomePreviousYearNodeScope
    Map<String, RuleProvider<OtherIncomePreviousYearNode>> provideInstanceProviders(
        Provider<OtherIncomeNodeChildProvider.OtherIncomePreviousYearNodeRuleProvider> otherIncomePreviousYearNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherIncomePreviousYearNode>> result = new HashMap<>();
        result.put("otherIncomePreviousYearNode", otherIncomePreviousYearNodeRuleProvider.get());
        return result;
    }
}