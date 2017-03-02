package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class DefenseServiceFlagNodeModule {

    private final DefenseServiceFlagNode owner;

    public DefenseServiceFlagNodeModule(DefenseServiceFlagNode owner) {
        this.owner = owner;
    }

    @Provides @DefenseServiceFlagNodeScope @Owner DefenseServiceFlagNode provideDefenseServiceFlagNode() {
        return owner;
    }

    @Provides @DefenseServiceFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @DefenseServiceFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @DefenseServiceFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}