package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ContactEmailNodeScope
@Subcomponent(modules = {ContactEmailNodeModule.class})
public interface ContactEmailNodeComponent {

    ContactEmailNodeRuleProvider getContactEmailNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setContactEmailNodeModule(ContactEmailNodeModule module);

        ContactEmailNodeComponent build();
    }
}
