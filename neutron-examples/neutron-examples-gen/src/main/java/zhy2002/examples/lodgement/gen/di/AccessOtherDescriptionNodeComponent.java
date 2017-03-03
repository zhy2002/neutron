package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AccessOtherDescriptionNodeScope
@Subcomponent(modules = {AccessOtherDescriptionNodeModule.class})
public interface AccessOtherDescriptionNodeComponent {

    AccessOtherDescriptionNodeRuleProvider getAccessOtherDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessOtherDescriptionNodeModule(AccessOtherDescriptionNodeModule module);

        AccessOtherDescriptionNodeComponent build();
    }
}
