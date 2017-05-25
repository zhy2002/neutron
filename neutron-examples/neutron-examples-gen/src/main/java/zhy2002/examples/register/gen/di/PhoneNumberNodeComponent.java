package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PhoneNumberNodeScope
@Subcomponent(modules = {PhoneNumberNodeModule.class})
public interface PhoneNumberNodeComponent {

    RuleProvider<PhoneNumberNode> getPhoneNumberNodeRuleProvider();
    Map<String, RuleProvider<PhoneNumberNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPhoneNumberNodeModule(PhoneNumberNodeModule module);

        PhoneNumberNodeComponent build();
    }
}
