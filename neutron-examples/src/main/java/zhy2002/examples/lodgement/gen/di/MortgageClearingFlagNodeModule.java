package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageClearingFlagNodeModule {

    private final MortgageClearingFlagNode owner;

    public MortgageClearingFlagNodeModule(MortgageClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageClearingFlagNodeScope @Owner MortgageClearingFlagNode provideMortgageClearingFlagNode() {
        return owner;
    }

    @Provides @MortgageClearingFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @MortgageClearingFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageClearingFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}