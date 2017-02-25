package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class EmploymentStartedNodeModule {

    private final EmploymentStartedNode owner;

    public EmploymentStartedNodeModule(EmploymentStartedNode owner) {
        this.owner = owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner EmploymentStartedNode provideEmploymentStartedNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @EmploymentStartedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}