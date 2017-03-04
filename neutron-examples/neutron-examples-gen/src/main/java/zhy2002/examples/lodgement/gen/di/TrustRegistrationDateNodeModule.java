package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TrustRegistrationDateNodeModule {

    private final TrustRegistrationDateNode owner;

    public TrustRegistrationDateNodeModule(TrustRegistrationDateNode owner) {
        this.owner = owner;
    }

    @Provides @TrustRegistrationDateNodeScope @Owner TrustRegistrationDateNode provideTrustRegistrationDateNode() {
        return owner;
    }

    @Provides @TrustRegistrationDateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustRegistrationDateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustRegistrationDateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustRegistrationDateNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

}