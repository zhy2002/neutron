package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PhoneInfoNodeScope
@Subcomponent(modules = {PhoneInfoNodeModule.class})
public interface PhoneInfoNodeComponent {

    PhoneInfoNodeRuleProvider getPhoneInfoNodeRuleProvider();
    Map<String, RuleProvider<PhoneInfoNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPhoneInfoNodeModule(PhoneInfoNodeModule module);

        PhoneInfoNodeComponent build();
    }
}
