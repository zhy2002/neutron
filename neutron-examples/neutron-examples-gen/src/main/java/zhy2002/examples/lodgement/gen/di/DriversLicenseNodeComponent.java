package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {DriversLicenseNodeModule.class})
public interface DriversLicenseNodeComponent {

    List<RuleProvider<DriversLicenseNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setDriversLicenseNodeModule(DriversLicenseNodeModule module);

        DriversLicenseNodeComponent build();
    }

}
