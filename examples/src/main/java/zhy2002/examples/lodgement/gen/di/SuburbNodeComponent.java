package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SuburbNodeScope
@Subcomponent(modules = {SuburbNodeModule.class})
public interface SuburbNodeComponent {

    SuburbNodeRuleProvider getSuburbNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSuburbNodeModule(SuburbNodeModule module);

        SuburbNodeComponent build();
    }
}
