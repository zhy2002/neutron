package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PermanentResidentFlagNodeModule {

    private final PermanentResidentFlagNode owner;

    public PermanentResidentFlagNodeModule(PermanentResidentFlagNode owner) {
        this.owner = owner;
    }

    @Provides @PermanentResidentFlagNodeScope @Owner PermanentResidentFlagNode providePermanentResidentFlagNode() {
        return owner;
    }

    @Provides @PermanentResidentFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @PermanentResidentFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PermanentResidentFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}