package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AverageFlagNodeModule {

    private final AverageFlagNode owner;

    public AverageFlagNodeModule(AverageFlagNode owner) {
        this.owner = owner;
    }

    @Provides @AverageFlagNodeScope @Owner AverageFlagNode provideAverageFlagNode() {
        return owner;
    }

    @Provides @AverageFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @AverageFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AverageFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}