package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class DriversLicenseNodeModule {

    private final DriversLicenseNode owner;

    public DriversLicenseNodeModule(DriversLicenseNode owner) {
        this.owner = owner;
    }

    @Provides @DriversLicenseNodeScope @Owner DriversLicenseNode provideDriversLicenseNode() {
        return owner;
    }

    @Provides @DriversLicenseNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @DriversLicenseNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @DriversLicenseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}