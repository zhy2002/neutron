package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class EmployerPhoneNodeModule {

    private final EmployerPhoneNode owner;

    public EmployerPhoneNodeModule(EmployerPhoneNode owner) {
        this.owner = owner;
    }

    @Provides @EmployerPhoneNodeScope @Owner EmployerPhoneNode provideEmployerPhoneNode() {
        return owner;
    }

    @Provides @EmployerPhoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @EmployerPhoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EmployerPhoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}