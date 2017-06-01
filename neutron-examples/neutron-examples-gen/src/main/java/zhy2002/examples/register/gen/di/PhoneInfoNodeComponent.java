package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PhoneInfoNodeModule.class})
public interface PhoneInfoNodeComponent {

    CountryCodeNode createCountryCodeNode();
    AreaCodeNode createAreaCodeNode();
    PhoneNumberNode createPhoneNumberNode();

    RuleProvider<PhoneInfoNode> getPhoneInfoNodeRuleProvider();
    Map<String, RuleProvider<PhoneInfoNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPhoneInfoNodeModule(PhoneInfoNodeModule module);

        PhoneInfoNodeComponent build();
    }

}
