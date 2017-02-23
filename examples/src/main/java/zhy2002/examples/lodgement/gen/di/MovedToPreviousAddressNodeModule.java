package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MovedToPreviousAddressNodeModule {

    private final MovedToPreviousAddressNode owner;

    public MovedToPreviousAddressNodeModule(MovedToPreviousAddressNode owner) {
        this.owner = owner;
    }

    @Provides @MovedToPreviousAddressNodeScope @Owner MovedToPreviousAddressNode provideMovedToPreviousAddressNode() {
        return owner;
    }

    @Provides @MovedToPreviousAddressNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @MovedToPreviousAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @MovedToPreviousAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}