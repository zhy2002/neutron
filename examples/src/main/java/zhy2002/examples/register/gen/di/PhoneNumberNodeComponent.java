package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@PhoneNumberNodeScope
@Subcomponent(modules = {PhoneNumberNodeModule.class})
public interface PhoneNumberNodeComponent {

    PhoneNumberNodeRuleProvider getPhoneNumberNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPhoneNumberNodeModule(PhoneNumberNodeModule module);

        PhoneNumberNodeComponent build();
    }
}
