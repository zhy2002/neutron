package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class EmployerAddressNodeModule {

    private final EmployerAddressNode owner;

    public EmployerAddressNodeModule(EmployerAddressNode owner) {
        this.owner = owner;
    }

    @Provides @EmployerAddressNodeScope @Owner EmployerAddressNode provideEmployerAddressNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}