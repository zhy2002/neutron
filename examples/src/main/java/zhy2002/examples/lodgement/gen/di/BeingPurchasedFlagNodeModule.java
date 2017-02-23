package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class BeingPurchasedFlagNodeModule {

    private final BeingPurchasedFlagNode owner;

    public BeingPurchasedFlagNodeModule(BeingPurchasedFlagNode owner) {
        this.owner = owner;
    }

    @Provides @BeingPurchasedFlagNodeScope @Owner BeingPurchasedFlagNode provideBeingPurchasedFlagNode() {
        return owner;
    }

    @Provides @BeingPurchasedFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @BeingPurchasedFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @BeingPurchasedFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}