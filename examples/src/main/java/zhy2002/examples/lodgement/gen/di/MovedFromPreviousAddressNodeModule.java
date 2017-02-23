package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

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

    @Provides @MovedFromPreviousAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}