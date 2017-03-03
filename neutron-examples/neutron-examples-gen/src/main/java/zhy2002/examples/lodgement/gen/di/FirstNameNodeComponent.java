package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@FirstNameNodeScope
@Subcomponent(modules = {FirstNameNodeModule.class})
public interface FirstNameNodeComponent {

    FirstNameNodeRuleProvider getFirstNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setFirstNameNodeModule(FirstNameNodeModule module);

        FirstNameNodeComponent build();
    }
}
