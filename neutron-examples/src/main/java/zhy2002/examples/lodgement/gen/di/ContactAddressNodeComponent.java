package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ContactAddressNodeScope
@Subcomponent(modules = {ContactAddressNodeModule.class})
public interface ContactAddressNodeComponent {

    ContactAddressNodeRuleProvider getContactAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setContactAddressNodeModule(ContactAddressNodeModule module);

        ContactAddressNodeComponent build();
    }
}
