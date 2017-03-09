package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MovedFromPreviousAddressNodeModule {

    private final MovedFromPreviousAddressNode owner;

    public MovedFromPreviousAddressNodeModule(MovedFromPreviousAddressNode owner) {
        this.owner = owner;
    }

    @Provides @MovedFromPreviousAddressNodeScope @Owner MovedFromPreviousAddressNode provideMovedFromPreviousAddressNode() {
        return owner;
    }

    @Provides @MovedFromPreviousAddressNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @MovedFromPreviousAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @MovedFromPreviousAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @MovedFromPreviousAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MovedFromPreviousAddressNodeScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @MovedFromPreviousAddressNodeScope
    Map<String, RuleProvider<MovedFromPreviousAddressNode>> provideInstanceProviders(
        Provider<PersonContactNodeChildProvider.MovedFromPreviousAddressNodeRuleProvider> movedFromPreviousAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<MovedFromPreviousAddressNode>> result = new HashMap<>();
        result.put("movedFromPreviousAddressNode", movedFromPreviousAddressNodeRuleProvider.get());
        return result;
    }
}