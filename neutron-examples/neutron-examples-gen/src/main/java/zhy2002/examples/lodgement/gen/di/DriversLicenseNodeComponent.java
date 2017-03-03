package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@DriversLicenseNodeScope
@Subcomponent(modules = {DriversLicenseNodeModule.class})
public interface DriversLicenseNodeComponent {

    DriversLicenseNodeRuleProvider getDriversLicenseNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setDriversLicenseNodeModule(DriversLicenseNodeModule module);

        DriversLicenseNodeComponent build();
    }
}