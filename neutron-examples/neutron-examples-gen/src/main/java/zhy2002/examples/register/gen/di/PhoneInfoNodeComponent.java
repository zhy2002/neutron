package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PhoneInfoNodeModule.class})
public interface PhoneInfoNodeComponent {

    List<RuleProvider<PhoneInfoNode>> provideRuleProviders();

    CountryCodeNode createCountryCodeNode();
    AreaCodeNode createAreaCodeNode();
    PhoneNumberNode createPhoneNumberNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setPhoneInfoNodeModule(PhoneInfoNodeModule module);

        PhoneInfoNodeComponent build();
    }

}
