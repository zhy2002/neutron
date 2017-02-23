package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OwnedOutrightFlagNodeScope
@Subcomponent(modules = {OwnedOutrightFlagNodeModule.class})
public interface OwnedOutrightFlagNodeComponent {

    OwnedOutrightFlagNodeRuleProvider getOwnedOutrightFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnedOutrightFlagNodeModule(OwnedOutrightFlagNodeModule module);

        OwnedOutrightFlagNodeComponent build();
    }
}
