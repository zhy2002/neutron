package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherLiabilityClearingFlagNodeModule {

    private final OtherLiabilityClearingFlagNode owner;

    public OtherLiabilityClearingFlagNodeModule(OtherLiabilityClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope @Owner OtherLiabilityClearingFlagNode provideOtherLiabilityClearingFlagNode() {
        return owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}