package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@DriversLicenseNodeScope
@Subcomponent(modules = {DriversLicenseNodeModule.class})
public interface DriversLicenseNodeComponent {

    DriversLicenseNodeRuleProvider getDriversLicenseNodeRuleProvider();
    Map<String, RuleProvider<DriversLicenseNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setDriversLicenseNodeModule(DriversLicenseNodeModule module);

        DriversLicenseNodeComponent build();
    }
}
