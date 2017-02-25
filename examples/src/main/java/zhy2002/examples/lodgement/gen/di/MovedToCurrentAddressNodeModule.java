package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

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

}