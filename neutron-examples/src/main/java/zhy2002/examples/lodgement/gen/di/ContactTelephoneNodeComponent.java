package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ContactTelephoneNodeScope
@Subcomponent(modules = {ContactTelephoneNodeModule.class})
public interface ContactTelephoneNodeComponent {

    ContactTelephoneNodeRuleProvider getContactTelephoneNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setContactTelephoneNodeModule(ContactTelephoneNodeModule module);

        ContactTelephoneNodeComponent build();
    }
}
