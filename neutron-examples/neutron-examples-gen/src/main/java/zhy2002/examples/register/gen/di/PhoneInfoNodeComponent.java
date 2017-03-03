package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@PhoneInfoNodeScope
@Subcomponent(modules = {PhoneInfoNodeModule.class})
public interface PhoneInfoNodeComponent {

    PhoneInfoNodeRuleProvider getPhoneInfoNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPhoneInfoNodeModule(PhoneInfoNodeModule module);

        PhoneInfoNodeComponent build();
    }
}
