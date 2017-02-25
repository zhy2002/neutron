package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PlanNodeModule {

    private final PlanNode owner;

    public PlanNodeModule(PlanNode owner) {
        this.owner = owner;
    }

    @Provides @PlanNodeScope @Owner PlanNode providePlanNode() {
        return owner;
    }

    @Provides @PlanNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PlanNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PlanNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}