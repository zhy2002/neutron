package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class RetiredSinceNodeModule {

    private final RetiredSinceNode owner;

    public RetiredSinceNodeModule(RetiredSinceNode owner) {
        this.owner = owner;
    }

    @Provides @RetiredSinceNodeScope @Owner RetiredSinceNode provideRetiredSinceNode() {
        return owner;
    }

    @Provides @RetiredSinceNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @RetiredSinceNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @RetiredSinceNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @RetiredSinceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}