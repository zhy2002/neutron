package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PrimarySecurityFlagNodeScope
@Subcomponent(modules = {PrimarySecurityFlagNodeModule.class})
public interface PrimarySecurityFlagNodeComponent {

    PrimarySecurityFlagNodeRuleProvider getPrimarySecurityFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPrimarySecurityFlagNodeModule(PrimarySecurityFlagNodeModule module);

        PrimarySecurityFlagNodeComponent build();
    }
}
