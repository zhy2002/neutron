package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PayeEmployedNodeModule {

    private final PayeEmployedNode owner;

    public PayeEmployedNodeModule(PayeEmployedNode owner) {
        this.owner = owner;
    }

    @Provides @PayeEmployedNodeScope @Owner PayeEmployedNode providePayeEmployedNode() {
        return owner;
    }

    @Provides @PayeEmployedNodeScope @Owner EmployedNode provideEmployedNode() {
        return owner;
    }

    @Provides @PayeEmployedNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PayeEmployedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}