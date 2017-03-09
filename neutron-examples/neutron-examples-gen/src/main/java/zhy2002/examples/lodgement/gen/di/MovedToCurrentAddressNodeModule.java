package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MovedToCurrentAddressNodeModule {

    private final MovedToCurrentAddressNode owner;

    public MovedToCurrentAddressNodeModule(MovedToCurrentAddressNode owner) {
        this.owner = owner;
    }

    @Provides @MovedToCurrentAddressNodeScope @Owner MovedToCurrentAddressNode provideMovedToCurrentAddressNode() {
        return owner;
    }

    @Provides @MovedToCurrentAddressNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @MovedToCurrentAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @MovedToCurrentAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @MovedToCurrentAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MovedToCurrentAddressNodeScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @MovedToCurrentAddressNodeScope
    Map<String, RuleProvider<MovedToCurrentAddressNode>> provideInstanceProviders(
        Provider<PersonContactNodeChildProvider.MovedToCurrentAddressNodeRuleProvider> movedToCurrentAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<MovedToCurrentAddressNode>> result = new HashMap<>();
        result.put("movedToCurrentAddressNode", movedToCurrentAddressNodeRuleProvider.get());
        return result;
    }
}