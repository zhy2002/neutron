package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ReceiveOffersNodeModule {

    private final ReceiveOffersNode owner;

    public ReceiveOffersNodeModule(ReceiveOffersNode owner) {
        this.owner = owner;
    }

    @Provides @ReceiveOffersNodeScope @Owner ReceiveOffersNode provideReceiveOffersNode() {
        return owner;
    }

    @Provides @ReceiveOffersNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ReceiveOffersNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ReceiveOffersNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ReceiveOffersNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

}