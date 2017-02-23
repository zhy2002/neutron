package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PhoneInfoNodeModule {

    private final PhoneInfoNode owner;

    public PhoneInfoNodeModule(PhoneInfoNode owner) {
        this.owner = owner;
    }

    @Provides @PhoneInfoNodeScope @Owner PhoneInfoNode providePhoneInfoNode() {
        return owner;
    }

    @Provides @PhoneInfoNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PhoneInfoNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}