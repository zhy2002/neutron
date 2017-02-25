package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class UnemployedSinceNodeModule {

    private final UnemployedSinceNode owner;

    public UnemployedSinceNodeModule(UnemployedSinceNode owner) {
        this.owner = owner;
    }

    @Provides @UnemployedSinceNodeScope @Owner UnemployedSinceNode provideUnemployedSinceNode() {
        return owner;
    }

    @Provides @UnemployedSinceNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @UnemployedSinceNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @UnemployedSinceNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @UnemployedSinceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}