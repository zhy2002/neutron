package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MovedToPreviousAddressNodeModule {

    private final MovedToPreviousAddressNode owner;

    public MovedToPreviousAddressNodeModule(MovedToPreviousAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MovedToPreviousAddressNode provideMovedToPreviousAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MovedToPreviousAddressNode> provideRuleProvider(Provider<MovedToPreviousAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MovedToPreviousAddressNode>> provideInstanceProviderMap(
        Provider<PersonContactNodeChildProvider.MovedToPreviousAddressNodeRuleProvider> movedToPreviousAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<MovedToPreviousAddressNode>> result = new HashMap<>();
        result.put("movedToPreviousAddressNode", movedToPreviousAddressNodeRuleProvider.get());
        return result;
    }
}