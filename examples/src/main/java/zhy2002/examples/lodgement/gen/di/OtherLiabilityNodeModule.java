package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherLiabilityNodeModule {

    private final OtherLiabilityNode owner;

    public OtherLiabilityNodeModule(OtherLiabilityNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityNodeScope @Owner OtherLiabilityNode provideOtherLiabilityNode() {
        return owner;
    }

    @Provides @OtherLiabilityNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}