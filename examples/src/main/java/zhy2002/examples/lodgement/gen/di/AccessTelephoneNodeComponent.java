package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AccessTelephoneNodeScope
@Subcomponent(modules = {AccessTelephoneNodeModule.class})
public interface AccessTelephoneNodeComponent {

    AccessTelephoneNodeRuleProvider getAccessTelephoneNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessTelephoneNodeModule(AccessTelephoneNodeModule module);

        AccessTelephoneNodeComponent build();
    }
}
