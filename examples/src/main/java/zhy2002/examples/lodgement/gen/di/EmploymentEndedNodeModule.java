package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class EmploymentEndedNodeModule {

    private final EmploymentEndedNode owner;

    public EmploymentEndedNodeModule(EmploymentEndedNode owner) {
        this.owner = owner;
    }

    @Provides @EmploymentEndedNodeScope @Owner EmploymentEndedNode provideEmploymentEndedNode() {
        return owner;
    }

    @Provides @EmploymentEndedNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @EmploymentEndedNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @EmploymentEndedNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @EmploymentEndedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}