package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PhoneNumberNodeModule.class})
public interface PhoneNumberNodeComponent {

    List<RuleProvider<PhoneNumberNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPhoneNumberNodeModule(PhoneNumberNodeModule module);

        PhoneNumberNodeComponent build();
    }

}
