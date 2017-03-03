package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AdditionalNodeScope
@Subcomponent(modules = {AdditionalNodeModule.class})
public interface AdditionalNodeComponent {

    AdditionalNodeRuleProvider getAdditionalNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAdditionalNodeModule(AdditionalNodeModule module);

        AdditionalNodeComponent build();
    }
}
